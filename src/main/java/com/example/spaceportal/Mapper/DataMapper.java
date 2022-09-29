package com.example.spaceportal.Mapper;


import com.example.spaceportal.Employee.Model.Employee;
import com.example.spaceportal.Employee.Model.EmployeeRepository;
import com.example.spaceportal.Planet.Model.Planet;
import com.example.spaceportal.Planet.Model.PlanetRepository;
import com.example.spaceportal.Repositories.DatabaseInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataMapper implements CommandLineRunner{
    @Autowired
    PlanetRepository planetRepository;
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public void run(String... args) throws Exception {

            //Planet
            DatabaseInput jdba = new DatabaseInput();

            final ArrayList<Planet> planets = jdba.InsertIntoDatabase();
            for (int i = 0; i < planets.size(); i++) {
                planetRepository.save(planets.get(i));
            }


            final List<Employee> customers = new ArrayList<>();
            customers.add(new Employee("Jack","Bauer","ja@exempel.1"));
            customers.add(new Employee("Kim","Bauer","ja@exempel.2"));
            customers.add(new Employee("Samuel","Bauer","ja@exempel.3"));
            customers.add(new Employee("Nicolas","Bauer","ja@exempel.4"));
            customers.add(new Employee("Jimmy","Bauer","ja@exempel.5"));
            employeeRepository.saveAll(customers);
    }
    }

