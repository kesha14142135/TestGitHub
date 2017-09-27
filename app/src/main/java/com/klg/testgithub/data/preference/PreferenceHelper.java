package com.klg.testgithub.data.preference;

/**
 * Created by sergejkozin on 9/22/17.
 */

public interface PreferenceHelper {

    void setLastSearch(String searchTitle);

    String getLastSearch();

    boolean lastSearchlIsNotEmpty();
}
