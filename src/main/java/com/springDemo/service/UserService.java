package com.springDemo.service;

import com.springDemo.dao.UserDao;
import com.springDemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户--服务层
 * Created by 浩瀚 on 2017/7/18.
 */
@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public void getAllUser(){
		List<User> testUser = userDao.getAllUser();
		for (User demoUser : testUser){
			System.out.println(demoUser.toString());
		}
	}

}
