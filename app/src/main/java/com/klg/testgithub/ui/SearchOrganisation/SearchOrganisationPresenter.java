package com.klg.testgithub.ui.SearchOrganisation;

import android.content.Context;

import com.klg.testgithub.R;
import com.klg.testgithub.data.AppDataManager;
import com.klg.testgithub.data.DataManager;
import com.klg.testgithub.data.database.model.OrganisationRealm;
import com.klg.testgithub.util.NetworkUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by sergejkozin on 9/27/17.
 */

public class SearchOrganisationPresenter implements SearchOrganisationContract.Presenter {

    private DataManager mManager;
    private SearchOrganisationContract.View mView;
    private Context mContext;
    private static final int MIN_LENGHT = 3;
    private boolean isGetData = false;

    public SearchOrganisationPresenter(SearchOrganisationContract.View view, Context context) {
        mContext = context;
        mManager = new AppDataManager(context);
        mView = view;
    }

    @Override
    public void subscribe() {
        if (mManager == null)
            mManager = new AppDataManager(mContext);
    }

    @Override
    public void unsubscribe() {
        mManager = null;
    }

    @Override
    public void getLastSaveOrganisations() {
        if (NetworkUtils.isNetworkConnected(mContext)) {
            if (mManager.isLastSearch()) {
                mView.showOrganisations(
                        mManager.getAllOrganisationsInDb());
                mView.showSearch(
                        mManager.getLastSearch());
            }
        } else {
            mView.showMessage(mContext.getString(R.string.turn_on_internet));
        }
    }

    @Override
    public void getOrganisations(String name) {
        if (name.length() > MIN_LENGHT) {
            if (NetworkUtils.isNetworkConnected(mContext)) {
                getOrganisationsFromServer(name);
            } else {
                mView.showMessage(mContext.getString(R.string.turn_on_internet));
            }
        } else {
            if (isGetData) {
                isGetData = false;
                mView.showOrganisations(new ArrayList<>());
                mView.showMessage(mContext.getString(R.string.organisation_min_value));
            }
        }
    }

    private void getOrganisationsFromServer(String name) {
        mManager.getOrganisations(name, new DataManager.CallBackOrganizations() {
            @Override
            public void onSuccess(List<OrganisationRealm> organisations) {
                isGetData = true;
                mView.showOrganisations(organisations);
            }

            @Override
            public void onFailure() {
                //mView.showMessage(mContext.getString(R.string.can_not_get_data_from_server));
            }
        });
    }
}
