package com.mylab021;

import com.mylab021.pojo.User;
import com.mylab021.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContent.xml");
        UserService userService =  (UserService)context.getBean("userService");
        User user = userService.getUser(1);
        System.out.println(user);
    }
}
