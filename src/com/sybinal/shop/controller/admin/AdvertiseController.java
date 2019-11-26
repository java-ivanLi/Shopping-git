package com.sybinal.shop.controller.admin;

import com.sybinal.shop.common.PageInformation;
import com.sybinal.shop.model.Advertise;
import com.sybinal.shop.model.ProductCategory;
import com.sybinal.shop.service.advertise.AdertiseService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * 轮播管理
 * */
@Controller
public class AdvertiseController {

   @Autowired
   private AdertiseService adertiseService;

    @RequestMapping(value = "/wheelplanting", method = RequestMethod.GET)
    public ModelAndView productCategoryManage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("admin/advertise/wheelPlanting");
        return model;
    }

    /*请求表格数据
    * */
    @RequestMapping(value = "/admin/productAdvertiseDataTable", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> productAdvertiseDataTable(PageInformation pageInfo, ProductCategory category){
        return adertiseService.selectAdvertiseAll(pageInfo, category);
    }

    //删除广告
    @RequestMapping(value = "/admin/removeAdvertise", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> removeAdvertise(String id){
        Map<String, Object> map = new HashMap<String, Object>();
        if(StringUtils.isEmpty(id) == true){
            map.put("error", "-1"); // 失败
        }else{
            int i = adertiseService.removeAdvertise(id);
            if(i > 0){
                map.put("error", "0"); // 成功
            }else{
                map.put("error", "-1"); // 失败
            }
        }
        return map;
    }

    //修改
    @RequestMapping(value = "/admin/editAdvertise", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView editAdvertise(Integer  id){
        ModelAndView model = new ModelAndView();
        Advertise advertise = adertiseService.getAdvertiseContent(id);
        if(advertise != null){
            model.addObject("advertise", advertise);
        }
        model.setViewName("admin/advertise/advertiseEdit");
        return model;
    }




    //修改or保存
    @RequestMapping(value = "/admin/saveAdvertise", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> saveAdvertise(Advertise advertise){
        Map<String, Object> map = new HashMap<String, Object>();
        int i = 0;
        if(advertise.getId() == null){
            Advertise advertiseName = adertiseService.checkAdvertiseName(advertise.getName());
            if (advertiseName==null){
                i = adertiseService.addAdvertise(advertise);
            }else {
                map.put("error", "-1"); // 失败
                map.put("data", advertise); // 数据成
            }
        }else{
            i = adertiseService.updateAdvertise(advertise);
        }
        if (i > 0) {
            map.put("error", "0"); // 成功
            map.put("data", advertise); // 数据
        } else {
            map.put("error", "-1"); // 失败
            map.put("data", advertise); // 数据成
        }
        return map;
    }


    //修改
    @RequestMapping(value = "/admin/selectProductCategory", method = RequestMethod.POST)
    @ResponseBody
    public  List<ProductCategory>  selectProductCategory(){

        List<ProductCategory> productCategories = adertiseService.selectProductCategory();

        return productCategories;
    }


}
