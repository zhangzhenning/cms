package com.briup.apps.cms.dao;

import com.briup.apps.cms.bean.User;
import com.briup.apps.cms.bean.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table base_user
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	long countByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table base_user
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	int deleteByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table base_user
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table base_user
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	int insert(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table base_user
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	int insertSelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table base_user
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	List<User> selectByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table base_user
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	User selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table base_user
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table base_user
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table base_user
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	int updateByPrimaryKeySelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table base_user
	 *
	 * @mbg.generated Tue Nov 12 20:20:47 CST 2019
	 */
	int updateByPrimaryKey(User record);
}