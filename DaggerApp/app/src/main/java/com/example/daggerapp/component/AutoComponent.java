package com.example.daggerapp.component;

import com.example.daggerapp.MainActivity;
import com.example.daggerapp.modulo.AutoModulo;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AutoModulo.class})
public interface AutoComponent {
    void inject(MainActivity mainActivity);
}
