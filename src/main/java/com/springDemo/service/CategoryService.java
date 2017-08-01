package com.springDemo.service;

import com.springDemo.entity.Category;
import com.springDemo.entity.SecondCategory;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户--服务层
 * Created by 浩瀚 on 2017/7/18.
 */

public interface CategoryService {

	List<Category> getCategory(Category category);

}
