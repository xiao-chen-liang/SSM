import controller.UserController;
import dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class AnnotationTest {
    @Test
    public void test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("application-config.xml");
        UserController userController = ioc.getBean(UserController.class);
        UserService userService = ioc.getBean(UserService.class);
        UserDao userDao = ioc.getBean(UserDao.class);
    }
}
