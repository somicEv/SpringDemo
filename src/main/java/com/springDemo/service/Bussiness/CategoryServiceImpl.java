package com.springDemo.service.Bussiness;

import com.springDemo.dao.CategoryDao;
import com.springDemo.entity.Category;
import com.springDemo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryDao categoryDao;

	@Override
	public List<Category> getCategory(Category category) {
		List<Category> resultList = categoryDao.getCategory(category);
		return resultList;
	}
}
