package com.example.spaceportal.Planet.Service;

import com.example.spaceportal.Planet.Model.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlanetService{
    Planet savePlanet(Planet planet);

    List<Planet> fetchPlanetList();
}
