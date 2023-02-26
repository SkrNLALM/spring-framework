package com.cydeo.stereotype_annotations;

import com.cydeo.stereotype_annotations.config.AppConfig;
import com.cydeo.stereotype_annotations.model.DataStructure;
import com.cydeo.stereotype_annotations.model.Microservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container =new AnnotationConfigApplicationContext(AppConfig.class);

        DataStructure ds=container.getBean(DataStructure.class);
        ds.getHours();
        Microservice ms= container.getBean(Microservice.class);
        ms.getHours();

    }
}
