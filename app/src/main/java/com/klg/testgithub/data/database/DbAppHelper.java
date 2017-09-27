package com.klg.testgithub.data.database;

import com.klg.testgithub.data.database.model.OrganisationRealm;

import java.util.List;

import io.realm.Realm;

/**
 * Created by sergejkozin on 9/23/17.
 */

public class DbAppHelper implements DbHelper {

    @Override
    public List<OrganisationRealm> getOrganisations() {
        Realm realm = Realm.getDefaultInstance();
        List<OrganisationRealm> organisations = realm.copyFromRealm(realm.where(OrganisationRealm.class).findAll());
        realm.close();
        return organisations;
    }

    @Override
    public void setOrganisations(final List<OrganisationRealm> organisations) {
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransaction(realm1 -> realm1.insertOrUpdate(organisations));
        realm.close();
    }

    @Override
    public void deleteAllOrganisations() {
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransaction(realm1 -> realm.where(OrganisationRealm.class).findAll().deleteAllFromRealm());
        realm.close();
    }
}
