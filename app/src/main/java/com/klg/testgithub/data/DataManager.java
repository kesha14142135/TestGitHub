package com.klg.testgithub.data;

import com.klg.testgithub.data.api.model.Organisation;
import com.klg.testgithub.data.api.model.Repository;
import com.klg.testgithub.data.database.model.OrganisationRealm;

import java.util.List;

/**
 * Created by sergejkozin on 9/23/17.
 */

public interface DataManager {

    boolean isLastSearch();

    List<OrganisationRealm> getAllOrganisationsInDb();

    String getLastSearch();

    void getOrganisations(String name, CallBackOrganizations callBack);

    void getRepository(String name, CallBackRepositories callBack);

    interface CallBackRepositories {
        void onSuccess(List<Repository> repositores);

        void onFailure();
    }

    interface CallBackOrganizations {
        void onSuccess(List<OrganisationRealm> organisations);

        void onFailure();
    }
}
