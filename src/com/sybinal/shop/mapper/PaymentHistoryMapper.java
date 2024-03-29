package com.sybinal.shop.mapper;

import com.sybinal.shop.model.PaymentHistory;
import com.sybinal.shop.model.PaymentHistoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaymentHistoryMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	int countByExample(PaymentHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	int deleteByExample(PaymentHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	int insert(PaymentHistory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	int insertSelective(PaymentHistory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	List<PaymentHistory> selectByExample(PaymentHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	PaymentHistory selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	int updateByExampleSelective(@Param("record") PaymentHistory record,
			@Param("example") PaymentHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	int updateByExample(@Param("record") PaymentHistory record,
			@Param("example") PaymentHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	int updateByPrimaryKeySelective(PaymentHistory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table payment_history
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	int updateByPrimaryKey(PaymentHistory record);
}