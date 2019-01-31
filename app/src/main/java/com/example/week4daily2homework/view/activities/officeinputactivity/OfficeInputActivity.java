package com.example.week4daily2homework.view.activities.officeinputactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.week4daily2homework.R;
import com.example.week4daily2homework.model.local.office.Office;
import com.example.week4daily2homework.view.activities.homeinputactivity.HomeInputActivity;
import com.example.week4daily2homework.view.activities.officedisplayactivity.OfficeDisplayActivity;

public class OfficeInputActivity extends Activity implements OfficeInputActivityContract{
    OfficeInputActivityPresenter officeInputActivityPresenter;
    EditText etOfficeOwner, etOfficeLocation, etOfficeCompany, etWorked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_input);

        etOfficeOwner = findViewById(R.id.etOfficeOwner);
        etOfficeLocation = findViewById(R.id.etOfficeLocation);
        etOfficeCompany = findViewById(R.id.etOfficeCompany);
        etWorked = findViewById(R.id.etOfficeWork);
    }

    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.btnOfficeNext:
                if(etOfficeOwner.getText() != null && etOfficeLocation.getText() != null && etOfficeCompany.getText() != null && etWorked.getText() != null) {
                    Office office = new Office(etOfficeOwner.getText().toString(), etOfficeLocation.getText().toString(), etOfficeCompany.getText().toString(), etWorked.getText().toString());
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("office", office);
                    intent = new Intent(this, OfficeDisplayActivity.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                break;
            case R.id.btnOfficeInputSwitch:
                intent = new Intent(this, HomeInputActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void passOffice(Office office) {

    }
}
