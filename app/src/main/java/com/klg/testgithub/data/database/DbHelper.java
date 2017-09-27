package com.klg.testgithub.data.database;

import com.klg.testgithub.data.database.model.OrganisationRealm;

import java.util.List;

import io.reactivex.annotations.NonNull;

/**
 * Created by sergejkozin on 9/23/17.
 */

public interface DbHelper {

    List<OrganisationRealm> getOrganisations();

    void setOrganisations(@NonNull List<OrganisationRealm> organisations);

    void deleteAllOrganisations();
}
