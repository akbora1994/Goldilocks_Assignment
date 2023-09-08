package com.masai.controller;

import com.masai.model.Employee;
import com.masai.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

	@Autowired
    private EmployeeService empService;

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getValuesHandler(){
    	
        List<Employee> empList = empService.getValues();
        return new ResponseEntity<>(empList, HttpStatus.OK);
    }
}
