package com.pieors;

import com.pieors.core.CommandLineRunner;
import com.pieors.core.MySpringApplication;
import com.pieors.core.annotations.Autowired;
import com.pieors.di.GreetingService;
import org.springframework.stereotype.Component;

//标识当前类对象的生命周期
@Component
public class MySpring implements CommandLineRunner {
    //标识当前成员变量由容器自动装配合适对象
    @Autowired
    private GreetingService greetingService;

    public static void main(String[] args) {
        MySpringApplication.ENABLE_LOG = false;
        MySpringApplication.run(MySpring.class);
    }

    @Override
    public void run() {
        System.out.println("Now the application is running");
        System.out.println("This is my spring");
        greetingService.greet();
    }


}
