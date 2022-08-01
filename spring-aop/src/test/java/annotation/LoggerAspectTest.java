package annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoggerAspectTest {

    @Test
    public void annotationAdviceMethod() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
//        calculator.addInt(1,1);
        calculator.divideInt(1, 1) ;
    }
}