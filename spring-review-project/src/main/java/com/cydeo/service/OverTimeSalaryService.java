package com.cydeo.service;

import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Qualifier;

public class OverTimeSalaryService {

    HoursRepository hoursRepository;
    EmployeeRepository employeeRepository;

    public OverTimeSalaryService(@Qualifier("OTH") HoursRepository hoursRepository, EmployeeRepository employeeRepository) {
        this.hoursRepository = hoursRepository;
        this.employeeRepository = employeeRepository;
    }

    public void calculateOvertimeSalary(){

        System.out.println(hoursRepository.getHours());
    }
}
