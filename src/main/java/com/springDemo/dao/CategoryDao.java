package com.springDemo.dao;


import com.springDemo.entity.Category;
import com.springDemo.entity.SecondCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryDao {
	/**
	 * 获取二级分类
	 * @param secondCategory
	 * @return
	 */
	List<SecondCategory> getSecondCategory(SecondCategory secondCategory);

	/**
	 * 获取一级分类
	 * @param category
	 * @return
	 */
	List<Category> getCategory(Category category);

}
