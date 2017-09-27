package com.klg.testgithub.ui.SearchOrganisation;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.TextView;

import com.klg.testgithub.R;
import com.klg.testgithub.data.database.model.OrganisationRealm;
import com.klg.testgithub.ui.Repository.RepositoryActivity;
import com.klg.testgithub.ui.SearchOrganisation.adapter.CallBackOrganisation;
import com.klg.testgithub.ui.SearchOrganisation.adapter.SearchAdapter;

import java.util.List;

public class SearchOrganisationFragment extends Fragment implements SearchOrganisationContract.View, CallBackOrganisation {

    private RecyclerView mRecyclerView;
    private SearchView mSearchView;
    private RelativeLayout mRelativeLayout;
    private SearchOrganisationContract.Presenter mPresenter;
    private TextView mTextViewIsEmpty;

    public static SearchOrganisationFragment newInstance() {
        return new SearchOrganisationFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search_organisation, container, false);
        updateViewDependencies(view);
        mPresenter = new SearchOrganisationPresenter(this,getContext());
        mPresenter.getLastSaveOrganisations();
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.subscribe();
    }

    @Override
    public void onPause() {
        super.onPause();
        mPresenter.unsubscribe();
    }

    @Override
    public void setPresenter(SearchOrganisationContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showOrganisations(List<OrganisationRealm> organisationRealms) {
        listIsEmpty(organisationRealms.size());
        SearchAdapter adapter = new SearchAdapter(getContext(), organisationRealms, this);
        mRecyclerView.setAdapter(adapter);
    }

    private void listIsEmpty(int size) {
        if (size == 0) {
            mTextViewIsEmpty.setText(R.string.organisation_is_empty);
            mTextViewIsEmpty.setVisibility(View.VISIBLE);
        } else {
            mTextViewIsEmpty.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void showSearch(String name) {
        mSearchView.setQuery(name,false);
    }

    @Override
    public void showMessage(String message) {
        Snackbar.make(mRelativeLayout, message, Snackbar.LENGTH_LONG)
                .show();
    }

    private void updateViewDependencies(View view) {
        mTextViewIsEmpty = view.findViewById(R.id.text_view_organisation_is_empty);
        mRelativeLayout = view.findViewById(R.id.relative_layout_base);
        mRecyclerView = view.findViewById(R.id.recycler_view_search_organisation);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        mSearchView = view.findViewById(R.id.search_view_organisation);
        mSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // do something on text submit
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                mPresenter.getOrganisations(newText);
                return false;
            }
        });
    }

    @Override
    public void clickMovie(String nameRepo) {
        Intent intent = new Intent(getActivity(), RepositoryActivity.class);
        intent.putExtra(getString(R.string.company_login), nameRepo);
        startActivity(intent);
    }
}
