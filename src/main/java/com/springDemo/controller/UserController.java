package com.springDemo.controller;

import com.springDemo.entity.User;
import com.springDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/demo")
	@ResponseBody
	public List<User> index(Model model){
		List<User> userList = userService.getAllUser();
		/*model.addAttribute("userList",userList);*/
		return userList;
	}

	@RequestMapping(value="/index")
	public String transfer(){
		return "index";
	}
}
