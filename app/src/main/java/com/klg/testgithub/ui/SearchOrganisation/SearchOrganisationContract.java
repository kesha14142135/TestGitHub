package com.klg.testgithub.ui.SearchOrganisation;

import com.klg.testgithub.base.BasePresenter;
import com.klg.testgithub.base.BaseView;
import com.klg.testgithub.data.database.model.OrganisationRealm;

import java.util.List;

/**
 * Created by sergejkozin on 9/27/17.
 */

public interface SearchOrganisationContract {
    interface View extends BaseView<SearchOrganisationContract.Presenter> {

        void showOrganisations(List<OrganisationRealm> organisationRealms);

        void showSearch(String name);

        void showMessage(String message);
    }

    interface Presenter extends BasePresenter {

        void getLastSaveOrganisations();

        void getOrganisations(String name);
    }
}
