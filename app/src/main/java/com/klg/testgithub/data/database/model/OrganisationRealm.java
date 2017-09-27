package com.klg.testgithub.data.database.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

/**
 * Created by sergejkozin on 9/26/17.
 */

public class OrganisationRealm extends RealmObject{

        private String mLogin;
        private Integer mId;
        private String mAvatarUrl;
        private String mGravatarId;
        private String mUrl;
        private String mHtmlUrl;
        private String mFollowersUrl;
        private String mFollowingUrl;
        private String mGistsUrl;
        private String mStarredUrl;
        private String mSubscriptionsUrl;
        private String mOrganizationsUrl;
        private String mReposUrl;
        private String mEventsUrl;
        private String mReceivedEventsUrl;
        private String mType;
        private Boolean mSiteAdmin;
        private Double mScore;

        public String getLogin() {
            return mLogin;
        }

        public void setLogin(String login) {
            mLogin = login;
        }

        public Integer getId() {
            return mId;
        }

        public void setId(Integer id) {
            mId = id;
        }

        public String getAvatarUrl() {
            return mAvatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            mAvatarUrl = avatarUrl;
        }

        public String getGravatarId() {
            return mGravatarId;
        }

        public void setGravatarId(String gravatarId) {
            mGravatarId = gravatarId;
        }

        public String getUrl() {
            return mUrl;
        }

        public void setUrl(String url) {
            mUrl = url;
        }

        public String getHtmlUrl() {
            return mHtmlUrl;
        }

        public void setHtmlUrl(String htmlUrl) {
            mHtmlUrl = htmlUrl;
        }

        public String getFollowersUrl() {
            return mFollowersUrl;
        }

        public void setFollowersUrl(String followersUrl) {
            mFollowersUrl = followersUrl;
        }

        public String getFollowingUrl() {
            return mFollowingUrl;
        }

        public void setFollowingUrl(String followingUrl) {
            mFollowingUrl = followingUrl;
        }

        public String getGistsUrl() {
            return mGistsUrl;
        }

        public void setGistsUrl(String gistsUrl) {
            mGistsUrl = gistsUrl;
        }

        public String getStarredUrl() {
            return mStarredUrl;
        }

        public void setStarredUrl(String starredUrl) {
            mStarredUrl = starredUrl;
        }

        public String getSubscriptionsUrl() {
            return mSubscriptionsUrl;
        }

        public void setSubscriptionsUrl(String subscriptionsUrl) {
            mSubscriptionsUrl = subscriptionsUrl;
        }

        public String getOrganizationsUrl() {
            return mOrganizationsUrl;
        }

        public void setOrganizationsUrl(String organizationsUrl) {
            mOrganizationsUrl = organizationsUrl;
        }

        public String getReposUrl() {
            return mReposUrl;
        }

        public void setReposUrl(String reposUrl) {
            mReposUrl = reposUrl;
        }

        public String getEventsUrl() {
            return mEventsUrl;
        }

        public void setEventsUrl(String eventsUrl) {
            mEventsUrl = eventsUrl;
        }

        public String getReceivedEventsUrl() {
            return mReceivedEventsUrl;
        }

        public void setReceivedEventsUrl(String receivedEventsUrl) {
            mReceivedEventsUrl = receivedEventsUrl;
        }

        public String getType() {
            return mType;
        }

        public void setType(String type) {
            mType = type;
        }

        public Boolean getSiteAdmin() {
            return mSiteAdmin;
        }

        public void setSiteAdmin(Boolean siteAdmin) {
            mSiteAdmin = siteAdmin;
        }

        public Double getScore() {
            return mScore;
        }

        public void setScore(Double score) {
            mScore = score;
        }
    }
