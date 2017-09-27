package com.klg.testgithub.data.preference;

import android.content.Context;
import android.content.SharedPreferences;

import com.klg.testgithub.R;

/**
 * Created by sergejkozin on 9/2/17.
 */

public class PreferenceAppHelper implements PreferenceHelper {
    private SharedPreferences mPreference;
    private Context mContext;

    public PreferenceAppHelper(Context context) {
        mContext = context;
        mPreference = context.getSharedPreferences(mContext.getResources().getString(R.string.preferences), Context.MODE_PRIVATE);
    }

    @Override
    public void setLastSearch(String searchTitle) {
        SharedPreferences.Editor editor = mPreference.edit();
        editor.putString(mContext.getResources().getString(R.string.search), searchTitle);
        editor.apply();
    }

    @Override
    public String getLastSearch() {
        return mPreference.getString(mContext.getResources().getString(R.string.search),"");
    }

    @Override
    public boolean lastSearchlIsNotEmpty() {
        return !mPreference.getString(mContext.getResources().getString(R.string.search), "").isEmpty();
    }
}
