package com.example.spaceportal.Employee.Service;

import com.example.spaceportal.Employee.Model.Employee;
import com.example.spaceportal.Employee.Model.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    //Save Operation
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    //Read Operation
    @Override public List<Employee> fetchEmployeeList(){
        return (List<Employee>)
                employeeRepository.findAll();
    }
}