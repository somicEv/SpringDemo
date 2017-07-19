package com.springDemo.dao;

import com.springDemo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 浩瀚 on 2017/7/18.
 */
@Repository
public interface UserDao {

	List<User> getAllUser();
}
