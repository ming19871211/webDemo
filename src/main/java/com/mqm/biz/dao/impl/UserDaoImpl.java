package com.mqm.biz.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mqm.biz.dao.UserDao;
import com.mqm.biz.model.HStudent;
import com.mqm.biz.model.HUser;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;


	public HUser selectByPrimaryKey(String userId) {
		return sessionFactory.getCurrentSession().find(HUser.class, userId);
	}
	
	public void saveHStudent(HStudent student){
		sessionFactory.getCurrentSession().save(student);
	}
	
}
