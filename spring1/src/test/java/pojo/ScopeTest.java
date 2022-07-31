package pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    @Test
    public void test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-scope.xml");
        final Student student1 = ioc.getBean(Student.class);
        final Student student2 = ioc.getBean(Student.class);
        System.out.println(student1.equals(student2));
    }
}
