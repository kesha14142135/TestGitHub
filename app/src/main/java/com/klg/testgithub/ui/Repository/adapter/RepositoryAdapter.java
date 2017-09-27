package com.klg.testgithub.ui.Repository.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.klg.testgithub.R;
import com.klg.testgithub.data.api.model.Repository;

import java.util.List;

/**
 * Created by sergejkozin on 9/15/17.
 */

public class RepositoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Repository> mRepositories;
    private Context mContext;
    private final int VIEW_TYPE_ITEM = 0;
    private final int VIEW_TYPE_LOADING = 1;

    public RepositoryAdapter(Context context, List<Repository> repositories) {
        mContext = context;
        mRepositories = repositories;
    }

    @Override
    public int getItemViewType(int position) {
        return mRepositories.get(position) == null ? VIEW_TYPE_LOADING : VIEW_TYPE_ITEM;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.card_view_repository, parent, false);
        return new OrganisationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Repository organisation = mRepositories.get(position);
        OrganisationViewHolder movieViewHolder = (OrganisationViewHolder) holder;

        movieViewHolder.mTextViewRepositoryName.setText(organisation.getName());
        movieViewHolder.mTextViewDescription.setText(organisation.getDescription());
    }

    @Override
    public int getItemCount() {
        return mRepositories == null ? 0 : mRepositories.size();
    }

    private class OrganisationViewHolder extends RecyclerView.ViewHolder {

        private TextView mTextViewRepositoryName;
        private TextView mTextViewDescription;

        OrganisationViewHolder(View itemView) {
            super(itemView);
            mTextViewRepositoryName = itemView.findViewById(R.id.text_view_name_repository);
            mTextViewDescription = itemView.findViewById(R.id.text_view_description);
        }
    }
}
