package com.klg.testgithub.ui.SearchOrganisation.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.klg.testgithub.R;
import com.klg.testgithub.data.database.model.OrganisationRealm;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by sergejkozin on 9/15/17.
 */

public class SearchAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<OrganisationRealm> mOrganisations;
    private CallBackOrganisation mCallBackOrganisation;
    private Context mContext;
    private final int VIEW_TYPE_ITEM = 0;
    private final int VIEW_TYPE_LOADING = 1;

    public SearchAdapter(Context context, List<OrganisationRealm> organisationRealms, CallBackOrganisation callBack) {
        mContext = context;
        mOrganisations = organisationRealms;
        mCallBackOrganisation = callBack;
    }

    @Override
    public int getItemViewType(int position) {
        return mOrganisations.get(position) == null ? VIEW_TYPE_LOADING : VIEW_TYPE_ITEM;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.card_view_organisation_search, parent, false);
        return new OrganisationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        OrganisationRealm organisation = mOrganisations.get(position);
        OrganisationViewHolder movieViewHolder = (OrganisationViewHolder) holder;

        movieViewHolder.mTextViewOrganisationName.setText(organisation.getLogin());
        movieViewHolder.mTextViewOrganisationLocation.setText(organisation.getId().toString());
        movieViewHolder.mTextViewOrganisationRepos.setText(organisation.getHtmlUrl());
        Picasso.with(mContext).load(organisation.getAvatarUrl())
                .into(movieViewHolder.mImageViewMoviePoster);
        movieViewHolder.mCardViewMovie.setOnClickListener(view ->
                mCallBackOrganisation.clickMovie(mOrganisations.get(position).getLogin()));
    }

    @Override
    public int getItemCount() {
        return mOrganisations == null ? 0 : mOrganisations.size();
    }

    private class OrganisationViewHolder extends RecyclerView.ViewHolder {

        private TextView mTextViewOrganisationName;
        private TextView mTextViewOrganisationLocation;
        private TextView mTextViewOrganisationRepos;
        private ImageView mImageViewMoviePoster;
        private CardView mCardViewMovie;

        OrganisationViewHolder(View itemView) {
            super(itemView);
            mTextViewOrganisationName = itemView.findViewById(R.id.text_view_name_organisation);
            mTextViewOrganisationLocation = itemView.findViewById(R.id.text_view_location);
            mTextViewOrganisationRepos = itemView.findViewById(R.id.text_view_project);
            mImageViewMoviePoster = itemView.findViewById(R.id.image_view_organisation);
            mCardViewMovie = itemView.findViewById(R.id.card_view_movie);
        }
    }
}
