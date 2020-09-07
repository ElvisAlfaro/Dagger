package com.example.daggerapp.modulo;

import com.example.daggerapp.entity.Motor;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AutoModulo {

    @Named("gasolina")
    @Provides
    Motor getMotorGasolina() {
        return new Motor("gasolina");
    }

    @Singleton
    @Named("petroleo")
    @Provides
    Motor getMotorPetroleo() {
        return new Motor("petroleo");
    }
}
