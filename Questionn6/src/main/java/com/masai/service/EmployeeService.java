package com.masai.service;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

import java.util.List;

public interface EmployeeService {

	public List<Employee> getValues() throws EmployeeException;
}
