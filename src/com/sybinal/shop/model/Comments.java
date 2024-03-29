package com.sybinal.shop.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
/*
* 评论管理  comments
* */
public class Comments {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comments.id
	 * @mbg.generated  Thu Oct 27 13:19:22 CST 2016
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comments.user_id
	 * @mbg.generated  Thu Oct 27 13:19:22 CST 2016
	 */
	private Integer userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comments.product_id
	 * @mbg.generated  Thu Oct 27 13:19:22 CST 2016
	 */
	private Integer productId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comments.audit
	 * @mbg.generated  Thu Oct 27 13:19:22 CST 2016
	 */
	private Integer audit;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comments.stars
	 * @mbg.generated  Thu Oct 27 13:19:22 CST 2016
	 */
	private Integer stars;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comments.create_time
	 * @mbg.generated  Thu Oct 27 13:19:22 CST 2016
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comments.content
	 * @mbg.generated  Thu Oct 27 13:19:22 CST 2016
	 */
	private String content;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comments.id
	 * @return  the value of comments.id
	 * @mbg.generated  Thu Oct 27 13:19:22 CST 2016
	 */
	
	private String productName;
	
	private String userName;
	
	private String createTimeFrom;
	
	private String createTimeTo;
	
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCreateTimeFrom() {
		return createTimeFrom;
	}

	public void setCreateTimeFrom(String createTimeFrom) {
		this.createTimeFrom = createTimeFrom;
	}

	public String getCreateTimeTo() {
		return createTimeTo;
	}

	public void setCreateTimeTo(String createTimeTo) {
		this.createTimeTo = createTimeTo;
	}

	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comments.id
	 * @param id  the value for comments.id
	 * @mbg.generated  Thu Oct 27 13:19:22 CST 2016
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comments.user_id
	 * @return  the value of comments.user_id
	 * @mbg.generated  Thu Oct 27 13:19:22 CST 2016
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comments.user_id
	 * @param userId  the value for comments.user_id
	 * @mbg.generated  Thu Oct 27 13:19:22 CST 2016
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comments.product_id
	 * @return  the value of comments.product_id
	 * @mbg.generated  Thu Oct 27 13:19:22 CST 2016
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comments.product_id
	 * @param productId  the value for comments.product_id
	 * @mbg.generated  Thu Oct 27 13:19:22 CST 2016
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comments.audit
	 * @return  the value of comments.audit
	 * @mbg.generated  Thu Oct 27 13:19:22 CST 2016
	 */
	public Integer getAudit() {
		return audit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comments.audit
	 * @param audit  the value for comments.audit
	 * @mbg.generated  Thu Oct 27 13:19:22 CST 2016
	 */
	public void setAudit(Integer audit) {
		this.audit = audit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comments.stars
	 * @return  the value of comments.stars
	 * @mbg.generated  Thu Oct 27 13:19:22 CST 2016
	 */
	public Integer getStars() {
		return stars;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comments.stars
	 * @param stars  the value for comments.stars
	 * @mbg.generated  Thu Oct 27 13:19:22 CST 2016
	 */
	public void setStars(Integer stars) {
		this.stars = stars;
	}

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") 
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comments.content
	 * @return  the value of comments.content
	 * @mbg.generated  Thu Oct 27 13:19:22 CST 2016
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comments.content
	 * @param content  the value for comments.content
	 * @mbg.generated  Thu Oct 27 13:19:22 CST 2016
	 */
	public void setContent(String content) {
		this.content = content;
	}

}