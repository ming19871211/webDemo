package com.mqm.biz.service;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mqm.biz.dao.UserDao;
import com.mqm.biz.mapper.StudentMapper;
import com.mqm.biz.mapper.UserMapper;
import com.mqm.biz.model.HStudent;
import com.mqm.biz.model.HUser;
import com.mqm.biz.model.Student;
import com.mqm.biz.model.User;

@Service
public class UserService {
	
	
	/**
	 * 以spring的Jdbc形式操作数据
	 */
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public Map<String,Object> getUserToMap(String userId){
		return this.jdbcTemplate.queryForMap("select * from sys_user where user_id = ?", userId);
	}
	
	/**
	 * 以mybatis3框架操作数据库
	 */
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private StudentMapper studentMapper;
	
	/**
	 * 以hibernate5框架操作数据库
	 */
	@Autowired
	private UserDao userDao;
	
	public User getUser(String userId){
		return userMapper.selectByPrimaryKey(userId);
	}
	
	public HUser getHUser(String userId){
		return userDao.selectByPrimaryKey(userId);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void saveStudy(Student student,HStudent hStudent){
		studentMapper.insert(student);
		userDao.saveHStudent(hStudent);	
	}
	
	
}
