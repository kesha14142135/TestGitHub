package com.klg.testgithub.ui.Repository;

import com.klg.testgithub.base.BasePresenter;
import com.klg.testgithub.base.BaseView;
import com.klg.testgithub.data.api.model.Repository;

import java.util.List;

/**
 * Created by sergejkozin on 9/27/17.
 */

public interface RepositoryContract {
    interface View extends BaseView<RepositoryContract.Presenter> {
        void showRepositories(List<Repository> repositories);

        void showMessage(String message);
    }

    interface Presenter extends BasePresenter {

        void getRepositories(String name);
    }
}
