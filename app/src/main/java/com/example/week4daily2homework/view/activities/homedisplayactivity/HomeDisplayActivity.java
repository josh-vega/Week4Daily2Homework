package com.example.week4daily2homework.view.activities.homedisplayactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.week4daily2homework.R;
import com.example.week4daily2homework.model.local.home.Home;
import com.example.week4daily2homework.view.activities.homeinputactivity.HomeInputActivity;
import com.example.week4daily2homework.view.activities.officeinputactivity.OfficeInputActivity;

public class HomeDisplayActivity extends Activity implements HomeDisplayActivityContract {
    HomeDisplayActivityPresenter homeDisplayActivityPresenter;
    TextView tvHomeOwner, tvHomeLocation, tvHomeResidents, tvRented;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_display);
        homeDisplayActivityPresenter = new HomeDisplayActivityPresenter(this);
        Intent intent = getIntent();
        Home home = intent.getParcelableExtra("home");

        tvHomeOwner = findViewById(R.id.tvHomeOwner);
        tvHomeLocation = findViewById(R.id.tvHomeLocation);
        tvHomeResidents = findViewById(R.id.tvHomeResidents);
        tvRented = findViewById(R.id.tvHomeRent);
        tvHomeOwner.setText(home.getOwner());
        tvHomeLocation.setText(home.getLocation());
        tvHomeResidents.setText(home.getResidents());
        tvRented.setText(String.valueOf(home.isForRent()));
    }

    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.btnHomeBack:
                intent = new Intent(this, HomeInputActivity.class);
                startActivity(intent);
                break;
            case R.id.btnHomeDisplaySwitch:
                intent = new Intent(this, OfficeInputActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void passHome(Home home) {

    }
}
