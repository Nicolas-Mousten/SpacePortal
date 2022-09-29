package com.example.spaceportal.Employee.Service;

import com.example.spaceportal.Employee.Model.Employee;

import java.util.List;

public interface EmployeeService{
        Employee saveEmployee(Employee employee);

        List<Employee> fetchEmployeeList();
    }

