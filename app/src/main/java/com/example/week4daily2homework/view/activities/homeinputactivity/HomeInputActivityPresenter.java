package com.example.week4daily2homework.view.activities.homeinputactivity;

import com.example.week4daily2homework.dagger.components.DaggerHomeComponent;
import com.example.week4daily2homework.dagger.components.HomeComponent;
import com.example.week4daily2homework.model.local.home.Home;

public class HomeInputActivityPresenter {
    HomeInputActivityContract homeInputActivityContract;
    HomeComponent homeComponent;

    public HomeInputActivityPresenter(HomeInputActivityContract homeInputActivityContract) {
        this.homeInputActivityContract = homeInputActivityContract;
        homeComponent = DaggerHomeComponent.builder().build();
    }

    public void getHome(Home home) {
        homeInputActivityContract.passHome(home);
    }
}
