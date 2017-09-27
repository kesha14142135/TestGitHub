package com.klg.testgithub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.klg.testgithub.ui.SearchOrganisation.SearchOrganisationActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Intent intent = new Intent(this, SearchOrganisationActivity.class);
        startActivity(intent);
        finish();
    }
}
