package com.example.spaceportal.Planet.Model;


import lombok.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@CrossOrigin
@Entity
@NoArgsConstructor
@Getter
@Setter

@Table(name="Planet")
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @Column(name="name")
    private String name;
    @Column(name="mass")
    private String mass;
    @Column(name="diameter")
    private String diameter;
    @Column(name="density")
    private String density;
    @Column(name="gravity")
    private String gravity;
    @Column(name="escapeVelocity")
    private String escapeVelocity;
    @Column(name="rotationPeriod")
    private String rotationPeriod;
    @Column(name="lengthOfDay")
    private String lengthOfDay;
    @Column(name="distanceFromSun")
    private String distanceFromSun;
    @Column(name="perihelion")
    private String perihelion;
    @Column(name="aphelion")
    private String aphelion;
    @Column(name="orbitalPeriod")
    private String orbitalPeriod;
    @Column(name="OrbitalVelocity")
    private String OrbitalVelocity;
    @Column(name="orbitalInclination")
    private String orbitalInclination;
    @Column(name="orbitalEccentricity")
    private String orbitalEccentricity;
    @Column(name="obliquityToOrbit")
    private String obliquityToOrbit;
    @Column(name="meanTemperature")
    private String meanTemperature;
    @Column(name="surfacePressure")
    private String surfacePressure;
    @Column(name="numberOfMoons")
    private String numberOfMoons;
    @Column(name="ringSystem")
    private String ringSystem;
    @Column(name="globalMagneticField")
    private String globalMagneticField;

    public Planet(String name, String mass, String diameter, String density, String gravity, String escapeVelocity, String rotationPeriod, String lengthOfDay, String distanceFromSun, String perihelion, String aphelion, String orbitalPeriod, String orbitalVelocity, String orbitalInclination, String orbitalEccentricity, String obliquityToOrbit, String meanTemperature, String surfacePressure, String numberOfMoons, String ringSystem, String globalMagneticField) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
        this.density = density;
        this.gravity = gravity;
        this.escapeVelocity = escapeVelocity;
        this.rotationPeriod = rotationPeriod;
        this.lengthOfDay = lengthOfDay;
        this.distanceFromSun = distanceFromSun;
        this.perihelion = perihelion;
        this.aphelion = aphelion;
        this.orbitalPeriod = orbitalPeriod;
        this.OrbitalVelocity = orbitalVelocity;
        this.orbitalInclination = orbitalInclination;
        this.orbitalEccentricity = orbitalEccentricity;
        this.obliquityToOrbit = obliquityToOrbit;
        this.meanTemperature = meanTemperature;
        this.surfacePressure = surfacePressure;
        this.numberOfMoons = numberOfMoons;
        this.ringSystem = ringSystem;
        this.globalMagneticField = globalMagneticField;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", mass='" + mass + '\'' +
                ", diameter='" + diameter + '\'' +
                ", density='" + density + '\'' +
                ", gravity='" + gravity + '\'' +
                ", escapeVelocity='" + escapeVelocity + '\'' +
                ", rotationPeriod='" + rotationPeriod + '\'' +
                ", lengthOfDay='" + lengthOfDay + '\'' +
                ", distanceFromSun='" + distanceFromSun + '\'' +
                ", perihelion='" + perihelion + '\'' +
                ", aphelion='" + aphelion + '\'' +
                ", orbitalPeriod='" + orbitalPeriod + '\'' +
                ", OrbitalVelocity='" + OrbitalVelocity + '\'' +
                ", orbitalInclination='" + orbitalInclination + '\'' +
                ", orbitalEccentricity='" + orbitalEccentricity + '\'' +
                ", obliquityToOrbit='" + obliquityToOrbit + '\'' +
                ", meanTemperature='" + meanTemperature + '\'' +
                ", surfacePressure='" + surfacePressure + '\'' +
                ", numberOfMoons='" + numberOfMoons + '\'' +
                ", ringSystem='" + ringSystem + '\'' +
                ", globalMagneticField='" + globalMagneticField + '\'' +
                '}';
    }
}
