package com.example.week4daily2homework.view.activities.homeinputactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.week4daily2homework.R;
import com.example.week4daily2homework.model.local.home.Home;
import com.example.week4daily2homework.view.activities.homedisplayactivity.HomeDisplayActivity;
import com.example.week4daily2homework.view.activities.officeinputactivity.OfficeInputActivity;

public class HomeInputActivity extends Activity implements HomeInputActivityContract {
    HomeInputActivityPresenter homeInputActivityPresenter;
    EditText etHomeOwner, etHomeResidents, etHomeLocation, etRented;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_input);
        homeInputActivityPresenter = new HomeInputActivityPresenter(this);

        etHomeOwner = findViewById(R.id.etHomeOwner);
        etHomeResidents = findViewById(R.id.etHomeResidents);
        etHomeLocation = findViewById(R.id.etHomeLocation);
        etRented = findViewById(R.id.etHomeRent);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnHomeNext:
                if(etHomeOwner.getText().toString() != null && etHomeResidents.getText().toString() != null && etHomeLocation.getText().toString() != null && etRented.getText().toString() != null) {
                    String owner = etHomeOwner.getText().toString();
                    String location = etHomeLocation.getText().toString();
                    String residents = etHomeResidents.getText().toString();
                    String rented = etRented.getText().toString();
                    Home home = new Home(owner, location, residents, rented);
                    homeInputActivityPresenter.getHome(home);
                }
                break;
            case R.id.btnHomeInputSwitch:
                Intent intent = new Intent(this, OfficeInputActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void passHome(Home home) {
        Intent intent;
        if(home != null){
            Bundle bundle = new Bundle();
            bundle.putParcelable("home", home);
            intent = new Intent(this, HomeDisplayActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
}
