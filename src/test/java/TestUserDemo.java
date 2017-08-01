import com.springDemo.controller.UserController;
import com.springDemo.entity.Category;
import com.springDemo.service.CategoryService;
import com.springDemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by 浩瀚 on 2017/7/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring_service.xml","classpath:spring/spring_dao.xml","classpath:spring/spring_dispatcher.xml"})
public class TestUserDemo {

	@Autowired
	private UserService userService;

	@Autowired
	private CategoryService categoryService;

	@Test
	public void testGetAllUser(){
		userService.getAllUser();
	}

	@Test
	public void testMockMvc() throws Exception{
		UserController userController = new UserController();
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
		mockMvc.perform(get("/index")).andExpect(view().name("index"));
	}
	@Test
	public void testCategoryService(){
		Category category = new Category();
		ArrayList<Category> resultList = (ArrayList<Category>) categoryService.getCategory(category);
		for (Category temp : resultList){
			System.out.println(temp.toString());
		}
	}



}
