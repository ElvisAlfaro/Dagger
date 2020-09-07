package com.example.daggerapp.entity;

import javax.inject.Inject;
import javax.inject.Named;

public class Auto {
    Motor motor;

    @Inject
    public Auto(@Named("petroleo") Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "motor=" + motor.toString() +
                '}';
    }
}
