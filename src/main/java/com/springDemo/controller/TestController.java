package com.springDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 浩瀚 on 2017/7/19.
 *  测试整体架构能否跑通
 */
@Controller
public class TestController {

	@RequestMapping(value="/test")
	public String test(){
		return "index";
	}

}
