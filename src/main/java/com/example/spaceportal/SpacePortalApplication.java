package com.example.spaceportal;


import com.example.spaceportal.Planet.Controller.PlanetController;
import com.example.spaceportal.Planet.Model.Planet;
import com.example.spaceportal.Repositories.DatabaseInput;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class SpacePortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpacePortalApplication.class, args);

    }
}
