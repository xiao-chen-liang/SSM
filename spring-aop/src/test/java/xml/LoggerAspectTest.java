package xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LoggerAspectTest {
    @Test
    public void xmlAdviceMethod() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-xml.xml");
        xml.Calculator calculator = ioc.getBean(xml.Calculator.class);
//        calculator.addInt(1,1);
        calculator.divideInt(1, 1) ;
    }
}