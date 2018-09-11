package com.example.java.model;

import java.util.List;

public class Rocket {

    private String code;
    private List<Propellant> propellants;

    public Rocket(String code) {
        this.code = code;
    }

    public Rocket(String code, List<Propellant> propellants) {
        this.code = code;
        this.propellants = propellants;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Propellant> getPropellants() {
        return propellants;
    }

    public void setPropellants(List<Propellant> propellants) {
        this.propellants = propellants;
    }
}
