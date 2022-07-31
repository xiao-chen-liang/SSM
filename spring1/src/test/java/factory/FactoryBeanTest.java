package factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;

public class FactoryBeanTest {
    @Test
    public void test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-factory.xml");
        ioc.getBean(Student.class);
    }
}
