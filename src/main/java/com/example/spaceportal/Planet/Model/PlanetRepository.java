package com.example.spaceportal.Planet.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {
    Optional<Planet> findById(long id);
}
