package com.example.spaceportal.Mapper;

import com.example.spaceportal.Planet.Controller.PlanetController;
import com.example.spaceportal.Planet.Model.Planet;
import com.example.spaceportal.Planet.Model.PlanetRepository;
import com.example.spaceportal.Repositories.DatabaseInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DataMapper implements CommandLineRunner{
    @Autowired
    PlanetRepository planetRepository;
    @Override
    public void run(String... args) throws Exception {

            //Planet
            DatabaseInput jdba = new DatabaseInput();

            final ArrayList<Planet> planets = jdba.InsertIntoDatabase();
            for (int i = 0; i < planets.size(); i++) {
                planetRepository.save(planets.get(i));
            }
        }
    }

