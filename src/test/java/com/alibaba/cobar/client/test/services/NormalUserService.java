package com.alibaba.cobar.client.test.services;

import java.util.List;

import com.alibaba.cobar.client.entities.User;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.cobar.client.test.daos.UserDao;

public class NormalUserService implements IUserService{
	private UserDao userDao ;
	
    @Transactional
    public void createUsersInBatch(List<User> users) {
    	userDao.getHibernateTemplate().saveOrUpdateAll(users);
    }
	

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
