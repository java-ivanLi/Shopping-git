package com.sybinal.shop.model;


/*
* 用户权限  user_roles
* */
public class UserRoles {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_roles.user_role_id
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	private Integer userRoleId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_roles.username
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	private String username;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_roles.role
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	private String role;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_roles.user_role_id
	 * @return  the value of user_roles.user_role_id
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public Integer getUserRoleId() {
		return userRoleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_roles.user_role_id
	 * @param userRoleId  the value for user_roles.user_role_id
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_roles.username
	 * @return  the value of user_roles.username
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_roles.username
	 * @param username  the value for user_roles.username
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_roles.role
	 * @return  the value of user_roles.role
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public String getRole() {
		return role;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_roles.role
	 * @param role  the value for user_roles.role
	 * @mbggenerated  Wed Oct 19 21:07:43 CST 2016
	 */
	public void setRole(String role) {
		this.role = role;
	}
}