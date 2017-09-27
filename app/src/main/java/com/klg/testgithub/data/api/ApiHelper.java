package com.klg.testgithub.data.api;

import com.klg.testgithub.data.api.model.OrganisationResponce;
import com.klg.testgithub.data.api.model.Repository;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by sergejkozin on 9/23/17.
 */

public interface ApiHelper {
    Flowable<OrganisationResponce> getOrganizations(String text);

    Flowable<List<Repository>> getRepositories(String name);

}
