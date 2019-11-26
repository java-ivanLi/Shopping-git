package com.sybinal.shop.controller.api;

import com.sybinal.shop.common.ApiResponseEnum;
import com.sybinal.shop.common.ApiResponseObject;
import com.sybinal.shop.service.catalog.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/v1")
public class SkuApiController extends AbstractApiController {

	@Autowired
	SkuService skuService;

	@RequestMapping(value = "catalog/product/sku/list", method = RequestMethod.POST, headers = "Accept=application/json")
	public ApiResponseObject getSkuDetailsList(@RequestBody Map<String, Object> reqMap) {
		return reponseJSON(ApiResponseEnum.SUCCESS.getCode(), ApiResponseEnum.SUCCESS.getName(), skuService.getSkuDetailsList(reqMap));
	}

}
