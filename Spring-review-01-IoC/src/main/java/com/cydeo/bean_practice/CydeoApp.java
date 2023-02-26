package com.cydeo.bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        //how to create container ?
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class, NewAppConfig.class);

        FullTimeEmployee ft= applicationContext.getBean(FullTimeEmployee.class);
        ft.createAccount();

        PartTimeEmployee pt= applicationContext.getBean(PartTimeEmployee.class);
        pt.createAccount();

        String str2= applicationContext.getBean("str2", String.class);
        System.out.println(str2);

        String str1= applicationContext.getBean("str1", String.class);
        System.out.println(str1);

    }
}
