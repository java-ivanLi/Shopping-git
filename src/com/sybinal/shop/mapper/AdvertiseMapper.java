package com.sybinal.shop.mapper;

import com.sybinal.shop.model.Account;
import com.sybinal.shop.model.Advertise;
import com.sybinal.shop.model.ProductCategory;

import java.util.List;
import java.util.Map;

public interface AdvertiseMapper {
	




	/*
	 * 查询所有分类下的广告*/
	public List<Advertise> selectAdvertiseAll(ProductCategory record);


    /*
    查询广告总记录数
    * */
	int selectAdvertiseCount(ProductCategory record);

	//删除广告
    int removeAdvertise(Integer id);

    //查询修改信息
	Advertise getAdvertiseContent(Integer id);
    //添加
    int addAdvertise(Advertise advertise);
   //修改
	int updateAdvertise(Advertise advertise);

	//校验广告名是否重复信息
	Advertise checkAdvertiseName(String name);


	//查询所有分类
	List<ProductCategory> selectProductCategory();

	//首页查询轮播图片
	List<Advertise>   selectIndexAdvertiseFalg();

}
