package com.klg.testgithub.ui.SearchOrganisation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.klg.testgithub.R;
import com.klg.testgithub.util.ActivityUtils;

public class SearchOrganisationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_organisation);

        SearchOrganisationFragment statisticsFragment = (SearchOrganisationFragment) getSupportFragmentManager()
                .findFragmentById(R.id.frame_layout_search_organisation);
        if (statisticsFragment == null) {
            statisticsFragment = SearchOrganisationFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    statisticsFragment, R.id.frame_layout_search_organisation);
        }
    }
}
