package com.briup.apps.cms.bean;

public class User_Role {
	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column base_user_role.id
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	private Long id;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column base_user_role.user_id
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	private Long userId;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column base_user_role.role_id
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	private Long roleId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column base_user_role.id
	 *
	 * @return the value of base_user_role.id
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column base_user_role.id
	 *
	 * @param id the value for base_user_role.id
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column base_user_role.user_id
	 *
	 * @return the value of base_user_role.user_id
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column base_user_role.user_id
	 *
	 * @param userId the value for base_user_role.user_id
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column base_user_role.role_id
	 *
	 * @return the value of base_user_role.role_id
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column base_user_role.role_id
	 *
	 * @param roleId the value for base_user_role.role_id
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
}