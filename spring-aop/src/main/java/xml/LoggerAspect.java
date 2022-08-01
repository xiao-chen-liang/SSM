package xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class LoggerAspect {
    public void beforeAdviceMethod(JoinPoint joinPoint ){
        System.out.println(joinPoint.getSignature().getName());
        System.out.println(joinPoint.getArgs());
        System.out.println(Arrays.toString(joinPoint.getArgs()));
        System.out.println("LoggerAspect.beforeAdviceMethod");
    }

    public void afterAdviceMethod(JoinPoint joinPoint){
        System.out.println("afterAdviceMethod");
    }

    public void afterReturningAdviceMethod(JoinPoint joinPoint, Object result){
        System.out.println(result);
        System.out.println("afterReturningAdviceMethod");
    }

    public void afterThrowingAdviceMethod(JoinPoint joinPoint, Exception exception){
        System.out.println("afterThrowingAdviceMethod");
        System.out.println(exception);
    }

    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint){
        Object result = null;
        try {
            System.out.println("beforeAdviceMethod");
            result = joinPoint.proceed();
            System.out.println("afterreturningadviceMethod");
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("athrowingAdviceMethod");
        } finally {
            System.out.println("afterAdviceMethod");
        }
        return result;
    }
}
