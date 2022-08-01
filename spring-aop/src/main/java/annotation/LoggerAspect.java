package annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LoggerAspect {
    @Pointcut("execution(* annotation.*.*(..))")
    public void pointcut() {}

//    @Before("execution(public int annotation.CalculatorImpl.addInt(int , int) ) ) ")
//    @Before("execution(* annotation.*.*(..))")
    @Before("pointcut()")
    public void beforeAdviceMethod(JoinPoint joinPoint ){
        System.out.println(joinPoint.getSignature().getName());
        System.out.println(joinPoint.getArgs());
        System.out.println(Arrays.toString(joinPoint.getArgs()));
        System.out.println("LoggerAspect.beforeAdviceMethod");
    }

    @After("pointcut()")
    public void afterAdviceMethod(JoinPoint joinPoint){
        System.out.println("afterAdviceMethod");
    }

    @AfterReturning(value = "pointcut()", returning = "result")
    public void afterReturningAdviceMethod(JoinPoint joinPoint, Object result){
        System.out.println(result);
        System.out.println("afterReturningAdviceMethod");
    }

    @AfterThrowing (value = "pointcut()", throwing="exception")
    public void afterThrowingAdviceMethod(JoinPoint joinPoint, Exception exception){
        System.out.println("afterThrowingAdviceMethod");
        System.out.println(exception);
    }

    @Around("pointcut()")
    public Object pointcut(ProceedingJoinPoint joinPoint){
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
