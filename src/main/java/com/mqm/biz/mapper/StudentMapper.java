package com.mqm.biz.mapper;

import com.mqm.biz.model.Student;

public interface StudentMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(String sno);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbg.generated
	 */
	int insert(Student record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbg.generated
	 */
	int insertSelective(Student record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbg.generated
	 */
	Student selectByPrimaryKey(String sno);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Student record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table student
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Student record);
}