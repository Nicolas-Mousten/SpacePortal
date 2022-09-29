package com.example.spaceportal.Employee.Controller;


import com.example.spaceportal.Employee.Model.Employee;
import com.example.spaceportal.Employee.Model.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping(path="/api/v1/employees")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping()
    public Employee saveEmployee(@Valid @RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @GetMapping()
    public List<Employee> fetchEmployeeList(){
        return employeeRepository.findAll();
    }
}
