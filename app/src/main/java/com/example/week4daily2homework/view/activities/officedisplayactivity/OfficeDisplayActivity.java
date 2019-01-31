package com.example.week4daily2homework.view.activities.officedisplayactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.week4daily2homework.R;
import com.example.week4daily2homework.model.local.office.Office;
import com.example.week4daily2homework.view.activities.homeinputactivity.HomeInputActivity;
import com.example.week4daily2homework.view.activities.officeinputactivity.OfficeInputActivity;

public class OfficeDisplayActivity extends Activity implements OfficeDisplayActivityContract {
    OfficeDisplayActivityPresenter officeDisplayActivityPresenter;
    TextView tvOfficeOwner, tvOfficeLocation, tvOfficeCompany, tvWorked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_display);
        officeDisplayActivityPresenter = new OfficeDisplayActivityPresenter(this);
        Intent intent = getIntent();
        Office office = intent.getParcelableExtra("office");

        tvOfficeOwner = findViewById(R.id.tvOfficeOwner);
        tvOfficeLocation = findViewById(R.id.tvOfficeLocation);
        tvOfficeCompany = findViewById(R.id.tvCompany);
        tvWorked = findViewById(R.id.tvOfficeWork);
        tvOfficeOwner.setText(office.getOwner());
        tvOfficeLocation.setText(office.getLocation());
        tvOfficeCompany.setText(office.getCompany());
        tvWorked.setText(String.valueOf(office.isWorkDone()));
    }

    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.btnOfficeBack:
                intent = new Intent(this, OfficeInputActivity.class);
                startActivity(intent);
                break;
            case R.id.btnOfficeDisplaySwitch:
                intent = new Intent(this, HomeInputActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void passOffice(Office office) {

    }
}
