package com.sybinal.shop.controller.api;

import com.sybinal.shop.common.ApiResponseEnum;
import com.sybinal.shop.common.ApiResponseObject;


import com.sybinal.shop.service.advertise.AdertiseService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


/*
 * 轮播管理
 * */

@RestController
@RequestMapping("api/v1")
public class AdvertiseApiController extends  AbstractApiController{

   @Autowired
   private AdertiseService adertiseService;



    /* 首页请求轮播图片
    * */
    @RequestMapping(value = "/advertise/indexAdvertiseData", method = RequestMethod.POST,headers = "Accept=application/json")
    public ApiResponseObject indexAdvertiseData(){
        return this.reponseJSON(ApiResponseEnum.SUCCESS.getCode(), ApiResponseEnum.SUCCESS.getName(), adertiseService.selectIndexAdvertiseFalg());
    }
}
