package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {

    //Field injection
  //  @Autowired
//    OfficeHours OfficeHours;

    //Constructor Injection
    OfficeHours officeHours;
//    @Autowired
//    OfficeHours OfficeHours;
//    public Java(com.cydeo.OfficeHours officeHours) {
//        OfficeHours = officeHours;
//    }
    public  void getTeachingHours (){
        System.out.println("Weekly teaching hours : " + (20 + officeHours.getHours()));

    }
}
