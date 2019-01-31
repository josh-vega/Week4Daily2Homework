package com.example.week4daily2homework.view.activities.officedisplayactivity;

import com.example.week4daily2homework.dagger.components.OfficeComponent;

public class OfficeDisplayActivityPresenter {
    OfficeDisplayActivityContract officeDisplayActivityContract;
    OfficeComponent officeComponent;

    public OfficeDisplayActivityPresenter(OfficeDisplayActivityContract officeDisplayActivityContract) {
        this.officeDisplayActivityContract = officeDisplayActivityContract;
    }
}
