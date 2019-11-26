package com.sybinal.shop.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/*
* 商品  product
* */
public class Product {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.id
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.name
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.category_id
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	private Integer categoryId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.general_explain
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	private String generalExplain;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.discount
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	private Integer discount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.shop_price
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	private Integer shopPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.price
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	private Integer price;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.external_id
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	private String externalId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.quantity
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	private Integer quantity;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.hot
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	private Integer hot;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.product_status
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	private Integer productStatus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.inventory_flag
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	private Integer inventoryFlag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.default_img
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	private String defaultImg;
	

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.update_time
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.update_user_id
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	private Integer updateUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.create_time
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.create_user_id
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	private Integer createUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.explain
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	private String explain;
	
	private String updateTimeFrom;
	
	private String updateTimeTo;
	
	private String categoryName;
	
	private String updateUserName;
	
	private String tempDefaultImg;
	
	public String getTempDefaultImg() {
		return tempDefaultImg;
	}

	public void setTempDefaultImg(String tempDefaultImg) {
		this.tempDefaultImg = tempDefaultImg;
	}

	public String getUpdateUserName() {
		return updateUserName;
	}

	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}

	public String getUpdateTimeFrom() {
		return updateTimeFrom;
	}

	public void setUpdateTimeFrom(String updateTimeFrom) {
		this.updateTimeFrom = updateTimeFrom;
	}

	public String getUpdateTimeTo() {
		return updateTimeTo;
	}

	public void setUpdateTimeTo(String updateTimeTo) {
		this.updateTimeTo = updateTimeTo;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.id
	 * @return  the value of product.id
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.id
	 * @param id  the value for product.id
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.name
	 * @return  the value of product.name
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.name
	 * @param name  the value for product.name
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.category_id
	 * @return  the value of product.category_id
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.category_id
	 * @param categoryId  the value for product.category_id
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.general_explain
	 * @return  the value of product.general_explain
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public String getGeneralExplain() {
		return generalExplain;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.general_explain
	 * @param generalExplain  the value for product.general_explain
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public void setGeneralExplain(String generalExplain) {
		this.generalExplain = generalExplain;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.discount
	 * @return  the value of product.discount
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public Integer getDiscount() {
		return discount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.discount
	 * @param discount  the value for product.discount
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.shop_price
	 * @return  the value of product.shop_price
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public Integer getShopPrice() {
		return shopPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.shop_price
	 * @param shopPrice  the value for product.shop_price
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public void setShopPrice(Integer shopPrice) {
		this.shopPrice = shopPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.price
	 * @return  the value of product.price
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public Integer getPrice() {
		return price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.price
	 * @param price  the value for product.price
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.external_id
	 * @return  the value of product.external_id
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public String getExternalId() {
		return externalId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.external_id
	 * @param externalId  the value for product.external_id
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.quantity
	 * @return  the value of product.quantity
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.quantity
	 * @param quantity  the value for product.quantity
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.hot
	 * @return  the value of product.hot
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public Integer getHot() {
		return hot;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.hot
	 * @param hot  the value for product.hot
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public void setHot(Integer hot) {
		this.hot = hot;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.product_status
	 * @return  the value of product.product_status
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public Integer getProductStatus() {
		return productStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.product_status
	 * @param productStatus  the value for product.product_status
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public void setProductStatus(Integer productStatus) {
		this.productStatus = productStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.inventory_flag
	 * @return  the value of product.inventory_flag
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public Integer getInventoryFlag() {
		return inventoryFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.inventory_flag
	 * @param inventoryFlag  the value for product.inventory_flag
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public void setInventoryFlag(Integer inventoryFlag) {
		this.inventoryFlag = inventoryFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.default_img
	 * @return  the value of product.default_img
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public String getDefaultImg() {
		return defaultImg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.default_img
	 * @param defaultImg  the value for product.default_img
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public void setDefaultImg(String defaultImg) {
		this.defaultImg = defaultImg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.update_time
	 * @return  the value of product.update_time
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") 
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.update_time
	 * @param updateTime  the value for product.update_time
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.update_user_id
	 * @return  the value of product.update_user_id
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public Integer getUpdateUserId() {
		return updateUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.update_user_id
	 * @param updateUserId  the value for product.update_user_id
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public void setUpdateUserId(Integer updateUserId) {
		this.updateUserId = updateUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.create_time
	 * @return  the value of product.create_time
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.create_time
	 * @param createTime  the value for product.create_time
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.create_user_id
	 * @return  the value of product.create_user_id
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public Integer getCreateUserId() {
		return createUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.create_user_id
	 * @param createUserId  the value for product.create_user_id
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.explain
	 * @return  the value of product.explain
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public String getExplain() {
		return explain;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.explain
	 * @param explain  the value for product.explain
	 * @mbg.generated  Mon Oct 24 21:14:56 CST 2016
	 */
	public void setExplain(String explain) {
		this.explain = explain;
	}
}