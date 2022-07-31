package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object createProxy() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        final Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName() + Arrays.toString(args));
                Object result = method.invoke(target, args);
                System.out.println(method.getName() + result);
                return result == null ? null : result;
            }
        };
        return Proxy.newProxyInstance(classLoader, interfaces,invocationHandler);
    }
}
