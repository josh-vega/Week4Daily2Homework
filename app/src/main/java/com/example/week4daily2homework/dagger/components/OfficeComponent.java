package com.example.week4daily2homework.dagger.components;

import com.example.week4daily2homework.dagger.modules.OfficeModule;
import com.example.week4daily2homework.model.local.office.Office;

import dagger.Component;

@Component(modules = OfficeModule.class)
public interface OfficeComponent {
    Office getOffice();
}
