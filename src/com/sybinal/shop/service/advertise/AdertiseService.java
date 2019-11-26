package com.sybinal.shop.service.advertise;

import com.sybinal.shop.common.PageInformation;
import com.sybinal.shop.model.Advertise;
import com.sybinal.shop.model.Product;
import com.sybinal.shop.model.ProductCategory;

import java.util.List;
import java.util.Map;

public interface AdertiseService {

    public Map<String, Object> selectAdvertiseAll(PageInformation pageInfo, ProductCategory category);



    int removeAdvertise(String id);

    Advertise getAdvertiseContent(Integer  id);

    int addAdvertise(Advertise advertise);

    int updateAdvertise(Advertise advertise);

    //校验广告名是否重复信息
    Advertise checkAdvertiseName(String name);

    //查询所有分类
    List<ProductCategory> selectProductCategory();


    //首页查询轮播图片
    List<Advertise>   selectIndexAdvertiseFalg();
}
