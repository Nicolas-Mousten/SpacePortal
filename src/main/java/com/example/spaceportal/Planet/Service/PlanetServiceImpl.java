package com.example.spaceportal.Planet.Service;

import com.example.spaceportal.Planet.Model.Planet;
import com.example.spaceportal.Planet.Model.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PlanetServiceImpl implements PlanetService{
    @Autowired
    private PlanetRepository planetRepository;

    //Save Operation
    public Planet savePlanet(Planet planet){
        return planetRepository.save(planet);
    }

    //Read Operation
    @Override public List<Planet> fetchPlanetList(){
        return (List<Planet>)
                planetRepository.findAll();
    }
}
