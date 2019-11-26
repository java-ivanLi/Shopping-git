package com.sybinal.shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*商品统计管理
*
* */
@Controller
public class CommodityStatisticsController {
      /*
      * 商品分类统计
      * */
      @RequestMapping("/productCategoryCount")
      public String   ProductCategoryCount(){
          return "admin/eWallet/productCategoryCount";
      }


}
