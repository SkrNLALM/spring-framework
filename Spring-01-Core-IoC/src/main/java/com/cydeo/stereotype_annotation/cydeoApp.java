package com.cydeo.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class cydeoApp {

    public static void main(String[] args) {

        ApplicationContext context= new AnnotationConfigApplicationContext(ConfigCourse.class);
        context.getBean(Java.class).getTeachingHours();
        context.getBean(Agile.class).getTeachingHours();

    }
}
