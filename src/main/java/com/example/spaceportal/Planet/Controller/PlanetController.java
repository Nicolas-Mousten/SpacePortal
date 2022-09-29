package com.example.spaceportal.Planet.Controller;

import com.example.spaceportal.Planet.Model.Planet;
import com.example.spaceportal.Planet.Model.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping(path = "/api/v1/Planet")
public class PlanetController{
    @Autowired
    PlanetRepository planetRepository;

    @PostMapping()
    public Planet savePlanet(@Valid @RequestBody Planet planet){
        return planetRepository.save(planet);
    }
    @GetMapping()
    public List<Planet> fetchPlanetList(){
        return planetRepository.findAll();
    }
}
