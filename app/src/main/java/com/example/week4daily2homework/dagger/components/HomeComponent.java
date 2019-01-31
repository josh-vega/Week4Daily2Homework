package com.example.week4daily2homework.dagger.components;

import com.example.week4daily2homework.dagger.modules.HomeModule;
import com.example.week4daily2homework.model.local.home.Home;

import dagger.Component;

@Component(modules = HomeModule.class)
public interface HomeComponent {
    Home getHome();
}
