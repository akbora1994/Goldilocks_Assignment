package com.masai.service;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	    @Autowired
	    private EmployeeRepo empRepo;

	    @Override
	    public List<Employee> getValues() throws EmployeeException {
	    	
	        List<Employee> empList = empRepo.findAll();

	        if(empList.size() > 0) {
				
				return empList;
			}else {
				
				throw new EmployeeException("No Employee Found!");
			}
	    }

}
