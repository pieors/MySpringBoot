package com.pieors.aop;


import com.pieors.core.annotations.After;
import com.pieors.core.annotations.Before;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class GreetingServiceAspect {

    @Before(value = "com.pieors.di.GreetingServiceImpl.greet")
    public void bedoreAdvice(Method method, Object... args) {
        System.out.println("Before method:" + method);
    }

    @After(value = "com.pieors.di.GreetingServiceImpl.greet")
    public void afterAdvice(Method method, Object... args) {
        System.out.println("After method:" + method);
    }
}
