package com.example.daggerapp.entity;

import javax.inject.Inject;

public class Motor {
    String tipo;

    @Inject
    public Motor(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
