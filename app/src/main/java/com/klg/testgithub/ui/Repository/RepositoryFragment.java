package com.klg.testgithub.ui.Repository;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.klg.testgithub.R;
import com.klg.testgithub.data.api.model.Repository;
import com.klg.testgithub.ui.Repository.adapter.RepositoryAdapter;

import java.util.List;

public class RepositoryFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener, RepositoryContract.View {

    //ui element
    private RecyclerView mRecyclerViewRepository;
    private SwipeRefreshLayout mSwipeLayout;
    private TextView mTextViewNonItem;
    //control variable
    private RepositoryAdapter mDataAdapter;
    private RelativeLayout mRelativeLayout;
    private RepositoryContract.Presenter mPresenter;
    private String mName;

    public static RepositoryFragment newInstance() {
        return new RepositoryFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_repository, container, false);
        updateViewDependencies(view);
        mPresenter = new RepositoryPresenter(this, getContext());
        mPresenter.getRepositories(mName);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mName = ((RepositoryActivity) context).getName();
    }

    @Override
    public void onDetach() {
        super.onDetach();
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
    public void onRefresh() {
        mPresenter.getRepositories(mName);
    }

    @Override
    public void setPresenter(RepositoryContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showRepositories(List<Repository> repositories) {
        listIsEmpty(repositories.size());
        mDataAdapter = new RepositoryAdapter(getContext(), repositories);
        mRecyclerViewRepository.setAdapter(mDataAdapter);
        mSwipeLayout.setRefreshing(false);
    }

    @Override
    public void showMessage(String message) {
        Snackbar.make(mRelativeLayout, message, Snackbar.LENGTH_LONG)
                .show();
    }

    private void updateViewDependencies(View view) {
        mRelativeLayout = view.findViewById(R.id.relative_layout_base);
        mRecyclerViewRepository = view.findViewById(R.id.recycler_view_repository);
        mRecyclerViewRepository.setHasFixedSize(true);
        mRecyclerViewRepository.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        mTextViewNonItem = view.findViewById(R.id.text_view_repository_is_empty);
        mSwipeLayout = view.findViewById(R.id.swipe_refresh_layout_repository);
        mSwipeLayout.setOnRefreshListener(this);
    }


    private void listIsEmpty(int size) {
        if (size == 0) {
            mTextViewNonItem.setVisibility(View.VISIBLE);
        } else {
            mTextViewNonItem.setVisibility(View.INVISIBLE);
        }
    }
}
