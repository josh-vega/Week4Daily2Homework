package com.example.week4daily2homework.view.activities.homedisplayactivity;

import com.example.week4daily2homework.dagger.components.HomeComponent;

public class HomeDisplayActivityPresenter {
    HomeDisplayActivityContract homeDisplayActivityContract;
    HomeComponent homeComponent;

    public HomeDisplayActivityPresenter(HomeDisplayActivityContract homeDisplayActivityContract) {
        this.homeDisplayActivityContract = homeDisplayActivityContract;
    }
}
