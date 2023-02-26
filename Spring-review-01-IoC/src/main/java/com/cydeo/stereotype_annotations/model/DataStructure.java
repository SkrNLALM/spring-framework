package com.cydeo.stereotype_annotations.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@AllArgsConstructor
@Data

public class DataStructure {
@NonNull
   ExtraHours extraHours;

//    public DataStructure(ExtraHours extraHours) {
//        this.extraHours = extraHours;
//    }

    public void getHours(){
        System.out.println("Total hours: " + (35 + extraHours.getExtraHours()));
            }

}
