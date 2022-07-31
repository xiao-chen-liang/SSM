package proxy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorStaticProxyTest {
    Calculator proxy = new CalculatorStaticProxy(new CalculatorImpl());

    @Test
    public void addInt() {
//        proxy.addInt(1,2);
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl() );
        final Calculator proxy = (Calculator) proxyFactory.createProxy();
        proxy.addInt(1, 2);
    }

    @Test
    public void subtractInt() {
    }

    @Test
    public void multiplyInt() {
    }

    @Test
    public void divideInt() {
    }
}