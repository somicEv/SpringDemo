package com.springDemo.service;

import com.springDemo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户--服务层
 * Created by 浩瀚 on 2017/7/18.
 */
@Service
public interface UserService {

	List<User> getAllUser();

}
