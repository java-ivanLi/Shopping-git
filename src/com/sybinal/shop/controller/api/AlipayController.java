package com.sybinal.shop.controller.api;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.sybinal.shop.common.ApiResponseEnum;
import com.sybinal.shop.common.ApiResponseObject;
import com.sybinal.shop.model.*;
import com.sybinal.shop.service.catalog.ProductService;
import com.sybinal.shop.service.catalog.SkuService;
import com.sybinal.shop.service.option.OptionService;
import com.sybinal.shop.service.order.OrderService;
import com.sybinal.shop.utils.AlipayConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Controller
@RequestMapping("api/v1")
public class AlipayController extends AbstractApiController{

    @Autowired
    OrderService orderService;

    @Autowired
    ProductService productService;

    @Autowired
    SkuService skuService;

    @Autowired
    OptionService optionService;

    @RequestMapping(value = "/pc/pay/Alipay")
    @ResponseBody
    public   void  Alipay(HttpServletResponse response,@RequestBody  Map<String,Object> reqMap) throws UnsupportedEncodingException {
        if(reqMap.get("WIDout_trade_no")!=null){
            String userId=(String)reqMap.get("userId");
            String  contectId=(String)reqMap.get("contectId");
            String  paymentType=(String)reqMap.get("paymentType");
            // 商户订单号，商户网站订单系统中唯一订单号，必填
            String out_trade_no = (String)reqMap.get("WIDout_trade_no");
            // 订单名称，必填
            String subject = (String)reqMap.get("WIDsubject");
            System.out.println(subject);
            // 付款金额，必填
            String total_amount=(String)reqMap.get("WIDtotal_amount");
            // 商品描述，可空
            String body = "Alipay测试数据";
            // 超时时间 可空
            String timeout_express="2m";
            // 销售产品码 必填
            String product_code="QUICK_WAP_WAY";
            //设置请求参数
            AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
            alipayRequest.setReturnUrl("http://localhost:8080/Shopping/api/v1/pc/alipay/return_url?userId="+userId+"&contectId="+contectId+"&paymentType="+paymentType);
           // alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
           alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","

                    + "\"total_amount\":\""+ total_amount +"\","
                    + "\"subject\":\""+ subject +"\","
                    + "\"body\":\""+ body +"\","
                    + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
            //获得初始化的AlipayClient
            AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
            //请求
            String result = null;
            try {
                result = alipayClient.pageExecute(alipayRequest).getBody();


                //输出
                response.setContentType("text/html;charset=" + AlipayConfig.charset);
                response.getWriter().write(result);//直接将完整的表单html输出到页面
                response.getWriter().flush();
                response.getWriter().close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @RequestMapping("/pc/alipay/return_url")
    @ResponseBody
    public ApiResponseObject  returnURL(HttpServletRequest request) throws Exception {

        //获取支付宝GET过来反馈信息
        Map<String,String> params = new HashMap<String,String>();
        Map<String,String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
            valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }

        //调用SDK验证签名
        boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名
        //——请在这里编写您的程序（以下代码仅作参考）——
        if(!signVerified) {
            //商户订单号
            String userId=new String(request.getParameter("userId").getBytes("ISO-8859-1"),"UTF-8");
            String  contectId=new String(request.getParameter("contectId").getBytes("ISO-8859-1"),"UTF-8");
            String  paymentType=new String(request.getParameter("paymentType").getBytes("ISO-8859-1"),"UTF-8");

            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");
            //支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");
            //付款金额
            String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"),"UTF-8");
            //Integer total_amount1=Integer.parseInt(total_amount)*100;
            System.out.println("userId:" + userId);
            System.out.println("contectId:" + contectId);
            System.out.println("paymentType:" + paymentType);
            System.out.println("商户订单号:" + out_trade_no);
            System.out.println("付款金额:" + total_amount);
            System.out.println("支付宝交易号:" + trade_no);
            System.out.println("userId:"+userId+"<br/>contectId:"+contectId+"<br/>paymentType:"+paymentType+"<br/>trade_no:"+trade_no+"<br/>out_trade_no:"+out_trade_no+"<br/>total_amount:"+total_amount);
            Order order = new Order();
            order.setUserId(Integer.parseInt(userId));
            Contect contect = new Contect();
            contect.setId(Integer.parseInt(contectId));
            contect.setPaymentType(Integer.parseInt(paymentType));
            order.setContect(contect);
            //使用order的userid 获取用户的购物车
            Order orderData = orderService.getOrderByUserId(order.getUserId());
            if(orderData==null){
                return reponseJSON(ApiResponseEnum.FAIL.getCode(), ApiResponseEnum.FAIL.getName(), null);
            }
            for (OrderItem orderItem : orderData.getOrderItemList()) {
                Product product = productService.getProductByid(orderItem.getProductId());
                if(product == null) {
                    return reponseJSON(ApiResponseEnum.FAIL.getCode(), ApiResponseEnum.FAIL.getName(), null);
                }
                //需要计算库存
                if(product.getInventoryFlag() == 0) {
                    if (!StringUtils.isEmpty(orderItem.getOptionValueKeyGroup())) {
                        Sku sku = skuService.getSkyById(orderItem.getSkuId());
                        if (sku != null) {
                            if (orderItem.getQuantity() > sku.getQuantity()) {
                                return reponseJSON(ApiResponseEnum.FAIL.getCode(), "库存不足", sku);
                            }
                        }
                    } else {
                        if (orderItem.getQuantity() > product.getQuantity()) {
                            return reponseJSON(ApiResponseEnum.FAIL.getCode(), "库存不足", product);
                        }
                    }
                }

            }
            order.setOrderNum(orderData.getOrderItemList().get(0).getOrderNum());
            orderService.savePaymentHistory(order,out_trade_no,trade_no,total_amount); //保存到支付历史记录表中
            optionService.setQuantity(orderData.getOrderItemList());//保存到订单项表中
            return reponseJSON(ApiResponseEnum.SUCCESS.getCode(), ApiResponseEnum.SUCCESS.getName(), 1);
        }else {
            return reponseJSON(ApiResponseEnum.FAIL.getCode(), "验签失败",1);
        }
    }
}
