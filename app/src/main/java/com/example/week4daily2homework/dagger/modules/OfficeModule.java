package com.example.week4daily2homework.dagger.modules;

import com.example.week4daily2homework.model.local.office.Office;

import dagger.Module;
import dagger.Provides;

@Module
public class OfficeModule {
    @Provides
    public Office getOffice(){
        return new Office("Joshman","3500 Montwood Court", "Mobile Apps Company", "true");
    }
}
