package com.cdac.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.UserDao;
import com.cdac.entity.User;

@Transactional
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired 
	private UserDao userDao;

	@Override
	public User save(User u) {
		return userDao.save(u);
	}

}
