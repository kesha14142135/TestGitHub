package com.klg.testgithub.data.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sergejkozin on 9/26/17.
 */

public class OrganisationResponce {
    @SerializedName("total_count")
    @Expose
    private Integer mTotalCount;
    @SerializedName("incomplete_results")
    @Expose
    private Boolean mIncompleteResults;
    @SerializedName("items")
    @Expose
    private List<Organisation> mItems = null;

    public Integer getTotalCount() {
        return mTotalCount;
    }

    public void setTotalCount(Integer totalCount) {
        mTotalCount = totalCount;
    }

    public Boolean getIncompleteResults() {
        return mIncompleteResults;
    }

    public void setIncompleteResults(Boolean incompleteResults) {
        mIncompleteResults = incompleteResults;
    }

    public List<Organisation> getItems() {
        return mItems;
    }

    public void setItems(List<Organisation> items) {
        mItems = items;
    }
}
