package com.cydeo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Primary;

import java.security.PrivateKey;
@Getter
@Setter
@ToString

public class Person {
    private String name;
    private Car car;

}
