import com.springDemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 浩瀚 on 2017/7/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring_service.xml","classpath:spring/spring_dao.xml"})
public class TestUserDemo {

	@Autowired
	private UserService userService;

	@Test
	public void testGetAllUser(){
		userService.getAllUser();
	}

}
