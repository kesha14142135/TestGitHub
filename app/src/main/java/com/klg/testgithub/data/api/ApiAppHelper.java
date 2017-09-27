package com.klg.testgithub.data.api;

import android.icu.util.TimeUnit;

import com.klg.testgithub.data.api.model.OrganisationResponce;
import com.klg.testgithub.data.api.model.Repository;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by sergejkozin on 9/23/17.
 */

public class ApiAppHelper implements ApiHelper {

    private ApiManager mManager;
    private static final int sPage = 1;

    public ApiAppHelper() {
        mManager = ApiManager.getInstance();
    }

    @Override
    public Flowable<OrganisationResponce> getOrganizations(String text) {
        return mManager.getService()
                .getOrganisations(text, sPage);
    }

    @Override
    public Flowable<List<Repository>> getRepositories(String name) {
        return mManager.getService()
                .getRepositoties(name);
    }
}
