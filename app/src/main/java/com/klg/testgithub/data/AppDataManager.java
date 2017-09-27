package com.klg.testgithub.data;

import android.content.Context;

import com.klg.testgithub.data.api.ApiAppHelper;
import com.klg.testgithub.data.api.ApiHelper;
import com.klg.testgithub.data.api.model.Organisation;
import com.klg.testgithub.data.api.model.OrganisationResponce;
import com.klg.testgithub.data.api.model.Repository;
import com.klg.testgithub.data.database.DbAppHelper;
import com.klg.testgithub.data.database.DbHelper;
import com.klg.testgithub.data.database.model.OrganisationRealm;
import com.klg.testgithub.data.preference.PreferenceAppHelper;
import com.klg.testgithub.data.preference.PreferenceHelper;
import com.klg.testgithub.util.rx.AppSchedulerProvider;
import com.klg.testgithub.util.rx.SchedulerProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Flowable;
import io.reactivex.schedulers.Timed;

/**
 * Created by sergejkozin on 9/23/17.
 */

public class AppDataManager implements DataManager {

    private ApiHelper mApi;
    private DbHelper mDatabase;
    private PreferenceHelper mPreference;
    private SchedulerProvider mScheduler;
    private static final String SEARCH_ORGANISATION = "+type:org";

    public AppDataManager(Context context) {
        mApi = new ApiAppHelper();
        mDatabase = new DbAppHelper();
        mPreference = new PreferenceAppHelper(context);
        mScheduler = new AppSchedulerProvider();
    }

    @Override
    public boolean isLastSearch() {
        return mPreference.lastSearchlIsNotEmpty();
    }

    @Override
    public List<OrganisationRealm> getAllOrganisationsInDb() {
        return mDatabase.getOrganisations();
    }

    @Override
    public String getLastSearch() {
        return mPreference.getLastSearch();
    }

    @Override
    public void getOrganisations(String name, CallBackOrganizations callBack) {
        String n = name + SEARCH_ORGANISATION;
        Flowable<OrganisationResponce> responceFlowable = mApi.getOrganizations(n);
        responceFlowable
                .subscribeOn(mScheduler.io())
                .observeOn(mScheduler.computation())

                .map(this::convertInOrganisation)
                .observeOn(mScheduler.ui())
                .subscribe(organisation -> {
                            mPreference.setLastSearch(name);
                            mDatabase.deleteAllOrganisations();
                            List<OrganisationRealm> org = convertInOrganisationRealm(organisation);
                            mDatabase.setOrganisations(org);
                            callBack.onSuccess(org);
                        },
                        throwable -> callBack.onFailure());
    }

    @Override
    public void getRepository(String name, CallBackRepositories callBack) {
        Flowable<List<Repository>> repositoryFlowable = mApi.getRepositories(name);
        repositoryFlowable.subscribeOn(mScheduler.io())
                .observeOn(mScheduler.ui())
                .subscribe(repositories -> {
                            callBack.onSuccess(repositories);
                        },
                        throwable -> callBack.onFailure());
    }

    private List<Organisation> convertInOrganisation(OrganisationResponce organisationResponces) {
        return organisationResponces.getItems();
    }

    private List<OrganisationRealm> convertInOrganisationRealm(List<Organisation> organisations) {
        List<OrganisationRealm> realms = new ArrayList<>();
        for (Organisation org : organisations) {
            OrganisationRealm c = new OrganisationRealm();
            c.setLogin(org.getLogin());
            c.setId(org.getId());
            c.setAvatarUrl(org.getAvatarUrl());
            c.setGravatarId(org.getGravatarId());
            c.setUrl(org.getUrl());
            c.setHtmlUrl(org.getHtmlUrl());
            c.setFollowersUrl(org.getFollowersUrl());
            c.setFollowingUrl(org.getFollowingUrl());
            c.setGistsUrl(org.getGistsUrl());
            c.setStarredUrl(org.getStarredUrl());
            c.setSubscriptionsUrl(org.getSubscriptionsUrl());
            c.setOrganizationsUrl(org.getOrganizationsUrl());
            c.setReposUrl(org.getReposUrl());
            c.setEventsUrl(org.getEventsUrl());
            c.setReceivedEventsUrl(org.getReceivedEventsUrl());
            c.setType(org.getType());
            c.setSiteAdmin(org.getSiteAdmin());
            c.setScore(org.getScore());
            realms.add(c);
        }
        return realms;
    }
}
