package com.klg.testgithub.data.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sergejkozin on 9/26/17.
 */

public class Repository {
    @SerializedName("id")
    @Expose
    private Integer mId;
    @SerializedName("name")
    @Expose
    private String mName;
    @SerializedName("full_name")
    @Expose
    private String mFullName;
    @SerializedName("owner")
    @Expose
    private OwnerRepository mOwner;
    @SerializedName("private")
    @Expose
    private Boolean mPrivate;
    @SerializedName("html_url")
    @Expose
    private String mHtmlUrl;
    @SerializedName("description")
    @Expose
    private String mDescription;
    @SerializedName("fork")
    @Expose
    private Boolean mFork;
    @SerializedName("url")
    @Expose
    private String mUrl;
    @SerializedName("forks_url")
    @Expose
    private String mForksUrl;
    @SerializedName("keys_url")
    @Expose
    private String mKeysUrl;
    @SerializedName("collaborators_url")
    @Expose
    private String mCollaboratorsUrl;
    @SerializedName("teams_url")
    @Expose
    private String mTeamsUrl;
    @SerializedName("hooks_url")
    @Expose
    private String mHooksUrl;
    @SerializedName("issue_events_url")
    @Expose
    private String mIssueEventsUrl;
    @SerializedName("events_url")
    @Expose
    private String mEventsUrl;
    @SerializedName("assignees_url")
    @Expose
    private String mAssigneesUrl;
    @SerializedName("branches_url")
    @Expose
    private String mBranchesUrl;
    @SerializedName("tags_url")
    @Expose
    private String mTagsUrl;
    @SerializedName("blobs_url")
    @Expose
    private String mBlobsUrl;
    @SerializedName("git_tags_url")
    @Expose
    private String mGitTagsUrl;
    @SerializedName("git_refs_url")
    @Expose
    private String mGitRefsUrl;
    @SerializedName("trees_url")
    @Expose
    private String mTreesUrl;
    @SerializedName("statuses_url")
    @Expose
    private String mStatusesUrl;
    @SerializedName("languages_url")
    @Expose
    private String mLanguagesUrl;
    @SerializedName("stargazers_url")
    @Expose
    private String mStargazersUrl;
    @SerializedName("contributors_url")
    @Expose
    private String mContributorsUrl;
    @SerializedName("subscribers_url")
    @Expose
    private String mSubscribersUrl;
    @SerializedName("subscription_url")
    @Expose
    private String mSubscriptionUrl;
    @SerializedName("commits_url")
    @Expose
    private String mCommitsUrl;
    @SerializedName("git_commits_url")
    @Expose
    private String mGitCommitsUrl;
    @SerializedName("comments_url")
    @Expose
    private String mCommentsUrl;
    @SerializedName("issue_comment_url")
    @Expose
    private String mIssueCommentUrl;
    @SerializedName("contents_url")
    @Expose
    private String mContentsUrl;
    @SerializedName("compare_url")
    @Expose
    private String mCompareUrl;
    @SerializedName("merges_url")
    @Expose
    private String mMergesUrl;
    @SerializedName("archive_url")
    @Expose
    private String mArchiveUrl;
    @SerializedName("downloads_url")
    @Expose
    private String mDownloadsUrl;
    @SerializedName("issues_url")
    @Expose
    private String mIssuesUrl;
    @SerializedName("pulls_url")
    @Expose
    private String mPullsUrl;
    @SerializedName("milestones_url")
    @Expose
    private String mMilestonesUrl;
    @SerializedName("notifications_url")
    @Expose
    private String mNotificationsUrl;
    @SerializedName("labels_url")
    @Expose
    private String mLabelsUrl;
    @SerializedName("releases_url")
    @Expose
    private String mReleasesUrl;
    @SerializedName("deployments_url")
    @Expose
    private String mDeploymentsUrl;
    @SerializedName("created_at")
    @Expose
    private String mCreatedAt;
    @SerializedName("updated_at")
    @Expose
    private String mUpdatedAt;
    @SerializedName("pushed_at")
    @Expose
    private String mPushedAt;
    @SerializedName("git_url")
    @Expose
    private String mGitUrl;
    @SerializedName("ssh_url")
    @Expose
    private String mSshUrl;
    @SerializedName("clone_url")
    @Expose
    private String mCloneUrl;
    @SerializedName("svn_url")
    @Expose
    private String mSvnUrl;
    @SerializedName("homepage")
    @Expose
    private String mHomepage;
    @SerializedName("size")
    @Expose
    private Integer mSize;
    @SerializedName("stargazers_count")
    @Expose
    private Integer mStargazersCount;
    @SerializedName("watchers_count")
    @Expose
    private Integer mWatchersCount;
    @SerializedName("language")
    @Expose
    private String mLanguage;
    @SerializedName("has_issues")
    @Expose
    private Boolean mHasIssues;
    @SerializedName("has_projects")
    @Expose
    private Boolean mHasProjects;
    @SerializedName("has_downloads")
    @Expose
    private Boolean mHasDownloads;
    @SerializedName("has_wiki")
    @Expose
    private Boolean mHasWiki;
    @SerializedName("has_pages")
    @Expose
    private Boolean mHasPages;
    @SerializedName("forks_count")
    @Expose
    private Integer mForksCount;
    @SerializedName("mirror_url")
    @Expose
    private Object mMirrorUrl;
    @SerializedName("open_issues_count")
    @Expose
    private Integer mOpenIssuesCount;
    @SerializedName("forks")
    @Expose
    private Integer mForks;
    @SerializedName("open_issues")
    @Expose
    private Integer mOpenIssues;
    @SerializedName("watchers")
    @Expose
    private Integer mWatchers;
    @SerializedName("default_branch")
    @Expose
    private String mDefaultBranch;

    public Integer getId() {
        return mId;
    }

    public void setId(Integer id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getFullName() {
        return mFullName;
    }

    public void setFullName(String fullName) {
        mFullName = fullName;
    }

    public OwnerRepository getOwner() {
        return mOwner;
    }

    public void setOwner(OwnerRepository owner) {
        mOwner = owner;
    }

    public Boolean getPrivate() {
        return mPrivate;
    }

    public void setPrivate(Boolean isPrivate) {
        mPrivate = isPrivate;
    }

    public String getHtmlUrl() {
        return mHtmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        mHtmlUrl = htmlUrl;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Boolean getFork() {
        return mFork;
    }

    public void setFork(Boolean fork) {
        mFork = fork;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getForksUrl() {
        return mForksUrl;
    }

    public void setForksUrl(String forksUrl) {
        mForksUrl = forksUrl;
    }

    public String getKeysUrl() {
        return mKeysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        mKeysUrl = keysUrl;
    }

    public String getCollaboratorsUrl() {
        return mCollaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        mCollaboratorsUrl = collaboratorsUrl;
    }

    public String getTeamsUrl() {
        return mTeamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        mTeamsUrl = teamsUrl;
    }

    public String getHooksUrl() {
        return mHooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        mHooksUrl = hooksUrl;
    }

    public String getIssueEventsUrl() {
        return mIssueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        mIssueEventsUrl = issueEventsUrl;
    }

    public String getEventsUrl() {
        return mEventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        mEventsUrl = eventsUrl;
    }

    public String getAssigneesUrl() {
        return mAssigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        mAssigneesUrl = assigneesUrl;
    }

    public String getBranchesUrl() {
        return mBranchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        mBranchesUrl = branchesUrl;
    }

    public String getTagsUrl() {
        return mTagsUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        mTagsUrl = tagsUrl;
    }

    public String getBlobsUrl() {
        return mBlobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        mBlobsUrl = blobsUrl;
    }

    public String getGitTagsUrl() {
        return mGitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        mGitTagsUrl = gitTagsUrl;
    }

    public String getGitRefsUrl() {
        return mGitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        mGitRefsUrl = gitRefsUrl;
    }

    public String getTreesUrl() {
        return mTreesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        mTreesUrl = treesUrl;
    }

    public String getStatusesUrl() {
        return mStatusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        mStatusesUrl = statusesUrl;
    }

    public String getLanguagesUrl() {
        return mLanguagesUrl;
    }

    public void setLanguagesUrl(String languagesUrl) {
        mLanguagesUrl = languagesUrl;
    }

    public String getStargazersUrl() {
        return mStargazersUrl;
    }

    public void setStargazersUrl(String stargazersUrl) {
        mStargazersUrl = stargazersUrl;
    }

    public String getContributorsUrl() {
        return mContributorsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        mContributorsUrl = contributorsUrl;
    }

    public String getSubscribersUrl() {
        return mSubscribersUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        mSubscribersUrl = subscribersUrl;
    }

    public String getSubscriptionUrl() {
        return mSubscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        mSubscriptionUrl = subscriptionUrl;
    }

    public String getCommitsUrl() {
        return mCommitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        mCommitsUrl = commitsUrl;
    }

    public String getGitCommitsUrl() {
        return mGitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        mGitCommitsUrl = gitCommitsUrl;
    }

    public String getCommentsUrl() {
        return mCommentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        mCommentsUrl = commentsUrl;
    }

    public String getIssueCommentUrl() {
        return mIssueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        mIssueCommentUrl = issueCommentUrl;
    }

    public String getContentsUrl() {
        return mContentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        mContentsUrl = contentsUrl;
    }

    public String getCompareUrl() {
        return mCompareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        mCompareUrl = compareUrl;
    }

    public String getMergesUrl() {
        return mMergesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        mMergesUrl = mergesUrl;
    }

    public String getArchiveUrl() {
        return mArchiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        mArchiveUrl = archiveUrl;
    }

    public String getDownloadsUrl() {
        return mDownloadsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        mDownloadsUrl = downloadsUrl;
    }

    public String getIssuesUrl() {
        return mIssuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        mIssuesUrl = issuesUrl;
    }

    public String getPullsUrl() {
        return mPullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        mPullsUrl = pullsUrl;
    }

    public String getMilestonesUrl() {
        return mMilestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        mMilestonesUrl = milestonesUrl;
    }

    public String getNotificationsUrl() {
        return mNotificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        mNotificationsUrl = notificationsUrl;
    }

    public String getLabelsUrl() {
        return mLabelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        mLabelsUrl = labelsUrl;
    }

    public String getReleasesUrl() {
        return mReleasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        mReleasesUrl = releasesUrl;
    }

    public String getDeploymentsUrl() {
        return mDeploymentsUrl;
    }

    public void setDeploymentsUrl(String deploymentsUrl) {
        mDeploymentsUrl = deploymentsUrl;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        mUpdatedAt = updatedAt;
    }

    public String getPushedAt() {
        return mPushedAt;
    }

    public void setPushedAt(String pushedAt) {
        mPushedAt = pushedAt;
    }

    public String getGitUrl() {
        return mGitUrl;
    }

    public void setGitUrl(String gitUrl) {
        mGitUrl = gitUrl;
    }

    public String getSshUrl() {
        return mSshUrl;
    }

    public void setSshUrl(String sshUrl) {
        mSshUrl = sshUrl;
    }

    public String getCloneUrl() {
        return mCloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        mCloneUrl = cloneUrl;
    }

    public String getSvnUrl() {
        return mSvnUrl;
    }

    public void setSvnUrl(String svnUrl) {
        mSvnUrl = svnUrl;
    }

    public String getHomepage() {
        return mHomepage;
    }

    public void setHomepage(String homepage) {
        mHomepage = homepage;
    }

    public Integer getSize() {
        return mSize;
    }

    public void setSize(Integer size) {
        mSize = size;
    }

    public Integer getStargazersCount() {
        return mStargazersCount;
    }

    public void setStargazersCount(Integer stargazersCount) {
        mStargazersCount = stargazersCount;
    }

    public Integer getWatchersCount() {
        return mWatchersCount;
    }

    public void setWatchersCount(Integer watchersCount) {
        mWatchersCount = watchersCount;
    }

    public String getLanguage() {
        return mLanguage;
    }

    public void setLanguage(String language) {
        mLanguage = language;
    }

    public Boolean getHasIssues() {
        return mHasIssues;
    }

    public void setHasIssues(Boolean hasIssues) {
        mHasIssues = hasIssues;
    }

    public Boolean getHasProjects() {
        return mHasProjects;
    }

    public void setHasProjects(Boolean hasProjects) {
        mHasProjects = hasProjects;
    }

    public Boolean getHasDownloads() {
        return mHasDownloads;
    }

    public void setHasDownloads(Boolean hasDownloads) {
        mHasDownloads = hasDownloads;
    }

    public Boolean getHasWiki() {
        return mHasWiki;
    }

    public void setHasWiki(Boolean hasWiki) {
        mHasWiki = hasWiki;
    }

    public Boolean getHasPages() {
        return mHasPages;
    }

    public void setHasPages(Boolean hasPages) {
        mHasPages = hasPages;
    }

    public Integer getForksCount() {
        return mForksCount;
    }

    public void setForksCount(Integer forksCount) {
        mForksCount = forksCount;
    }

    public Object getMirrorUrl() {
        return mMirrorUrl;
    }

    public void setMirrorUrl(Object mirrorUrl) {
        mMirrorUrl = mirrorUrl;
    }

    public Integer getOpenIssuesCount() {
        return mOpenIssuesCount;
    }

    public void setOpenIssuesCount(Integer openIssuesCount) {
        mOpenIssuesCount = openIssuesCount;
    }

    public Integer getForks() {
        return mForks;
    }

    public void setForks(Integer forks) {
        mForks = forks;
    }

    public Integer getOpenIssues() {
        return mOpenIssues;
    }

    public void setOpenIssues(Integer openIssues) {
        mOpenIssues = openIssues;
    }

    public Integer getWatchers() {
        return mWatchers;
    }

    public void setWatchers(Integer watchers) {
        mWatchers = watchers;
    }

    public String getDefaultBranch() {
        return mDefaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        mDefaultBranch = defaultBranch;
    }
}
