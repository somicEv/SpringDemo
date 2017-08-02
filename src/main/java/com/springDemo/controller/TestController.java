package com.springDemo.controller;


import com.springDemo.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by 浩瀚 on 2017/7/19.
 * 测试整体架构能否跑通
 */
@Controller
public class TestController {

	@RequestMapping(value = "/test")
	public String test() {
		return "index";
	}


	@RequestMapping(value="/sendxml", method= RequestMethod.POST)
	public void sendxml(@RequestBody Book book){
		System.out.println(book);
		System.out.println("接受XML数据成功！");
	}
}
