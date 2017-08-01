package com.springDemo.controller;

import com.springDemo.entity.Category;
import com.springDemo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/category")
	public String indexCategory(Model model) {
		Category category = new Category();
		List<Category> resultList = categoryService.getCategory(category);
		for (Category temp : resultList){
			System.out.println(temp.toString());
		}
		model.addAttribute("resultList",resultList);
		return "category";
	}

}
