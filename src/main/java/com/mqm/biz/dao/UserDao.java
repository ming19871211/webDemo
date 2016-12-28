package com.mqm.biz.dao;

import com.mqm.biz.model.HStudent;
import com.mqm.biz.model.HUser;

public interface UserDao {
	HUser selectByPrimaryKey(String userId);
	
	void saveHStudent(HStudent student);
}
