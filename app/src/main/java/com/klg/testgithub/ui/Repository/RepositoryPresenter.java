package com.klg.testgithub.ui.Repository;

import android.content.Context;

import com.klg.testgithub.R;
import com.klg.testgithub.data.AppDataManager;
import com.klg.testgithub.data.DataManager;
import com.klg.testgithub.data.api.model.Repository;
import com.klg.testgithub.ui.SearchOrganisation.SearchOrganisationContract;
import com.klg.testgithub.util.NetworkUtils;

import java.util.List;

/**
 * Created by sergejkozin on 9/27/17.
 */

public class RepositoryPresenter implements RepositoryContract.Presenter {

    private DataManager mManager;
    private RepositoryContract.View mView;
    private Context mContext;

    public RepositoryPresenter(RepositoryContract.View view, Context context) {
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
    public void getRepositories(String name) {
        if (NetworkUtils.isNetworkConnected(mContext)) {
            getRepositoriesFromServer(name);
        } else {
            mView.showMessage(mContext.getString(R.string.turn_on_internet));
        }
    }

    private void getRepositoriesFromServer(String name) {
        mManager.getRepository(name, new DataManager.CallBackRepositories() {
            @Override
            public void onSuccess(List<Repository> repositores) {
                mView.showRepositories(repositores);
            }

            @Override
            public void onFailure() {
                mView.showMessage(mContext.getString(R.string.error_server_responce));
            }
        });
    }
}
