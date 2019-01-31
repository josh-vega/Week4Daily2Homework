package com.example.week4daily2homework.dagger.modules;

import com.example.week4daily2homework.model.local.home.Home;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeModule {
    @Provides
    public Home getHome(){
        return new Home("Joshua","103 Falls Crest Dr.", "4", "false");
    }
}
