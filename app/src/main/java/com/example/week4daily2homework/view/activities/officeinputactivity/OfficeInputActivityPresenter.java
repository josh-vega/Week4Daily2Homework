package com.example.week4daily2homework.view.activities.officeinputactivity;

import com.example.week4daily2homework.dagger.components.OfficeComponent;
import com.example.week4daily2homework.model.local.office.Office;

public class OfficeInputActivityPresenter {
    OfficeInputActivityContract officeInputActivityContract;
    OfficeComponent officeComponent;

    public OfficeInputActivityPresenter(OfficeInputActivityContract officeInputActivityContract) {
        this.officeInputActivityContract = officeInputActivityContract;
    }

    public void getOffice(Office office) {
        officeInputActivityContract.passOffice(office);
    }
}
