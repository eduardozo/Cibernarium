package com.example.java.model;

import com.example.java.utilities.InvalidParamException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rocket {

    private String code;
    private List<Propellant> propellants = new ArrayList<>();

    public Rocket(String code) throws InvalidParamException {
        checkValidCode(code);
        this.code = code;

    }

    public void addPropellant(int power) {
        if (power >= 1) {
            this.propellants.add(new Propellant(power));
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) throws InvalidParamException {
        checkValidCode(code);
        this.code = code;
    }

    public List<Propellant> getPropellants() {
        return propellants;
    }

    public void setPropellants(List<Propellant> propellants) {
        this.propellants = propellants;
    }

    private void checkValidCode(String code) throws InvalidParamException {
        if (code.equals("") || code.length() < 2)
            throw new InvalidParamException();
    }

    public void speedUp() {
        for (Propellant p : propellants) {
            p.speedUp();
        }
    }

    public void slowDown() {
        int max = 0;
        for (Propellant p : propellants) {
            if (p.getCurrentPower() > max) {
                max = p.getCurrentPower();
            }
        }
        for (Propellant p : propellants) {
            if (p.getCurrentPower() == max) {
                p.slowDown();
            }
        }
    }

}
