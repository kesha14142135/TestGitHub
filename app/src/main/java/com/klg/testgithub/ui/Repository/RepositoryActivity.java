package com.klg.testgithub.ui.Repository;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.klg.testgithub.R;
import com.klg.testgithub.ui.SearchOrganisation.SearchOrganisationFragment;
import com.klg.testgithub.util.ActivityUtils;

public class RepositoryActivity extends AppCompatActivity {

    private String mCompany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repository);

        Bundle extras = getIntent().getExtras();
        assert extras != null;
        mCompany = extras.getString(getString(R.string.company_login));

        updateViewDependencies();

        RepositoryFragment statisticsFragment = (RepositoryFragment) getSupportFragmentManager()
                .findFragmentById(R.id.frame_layout_repository);
        if (statisticsFragment == null) {
            statisticsFragment = RepositoryFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    statisticsFragment, R.id.frame_layout_repository);
        }
    }
    private void updateViewDependencies() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(mCompany);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    public String getName() {
        return mCompany;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
