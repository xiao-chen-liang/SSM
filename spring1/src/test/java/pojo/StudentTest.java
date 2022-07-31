package pojo;

import com.sun.corba.se.spi.ior.IORTypeCheckRegistry;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest extends TestCase {
    @Test
    public void testIoc(){
        final ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
//        final Student student = (Student) ioc.getBean("Student");
//        final Student student = ioc.getBean(Student.class);
//        final Student student = ioc.getBean("Student", Student.class);
        final Person person = ioc.getBean(Student.class);
        System.out.println(person);
    }

    @Test
    public void testClass(){
        final ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        final Class aclass = ioc.getBean(Class.class);
        System.out.println(aclass);
    }

    @Test
    public void testClazz(){
        final ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Clazz clazz = ioc.getBean(Clazz.class);
        System.out.println(clazz);
    }

}