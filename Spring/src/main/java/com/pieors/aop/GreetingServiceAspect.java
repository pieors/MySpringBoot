package com.pieors.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingServiceAspect {

    @Pointcut("execution(* com.pieors.di.*.*(..)")
    public void forAllMethods(){}

    @Before(value = "forAllMethods()")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Before method:" + joinPoint.getSignature());
    }

    @After(value = "forAllMethod()")
    public void afterAdvice(JoinPoint joinPoint) {
        System.out.println("After method:" + joinPoint.getSignature());
    }
}
