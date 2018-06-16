package com.framgia.mvp_dagger.example_2_no_dagger.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sonng266 on 16/06/2018.
 */

public class Name {

    @SerializedName("title")
    @Expose
    private String mTitle;
    @SerializedName("first")
    @Expose
    private String mFirst;
    @SerializedName("last")
    @Expose
    private String mLast;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getFirst() {
        return mFirst;
    }

    public void setFirst(String first) {
        mFirst = first;
    }

    public String getLast() {
        return mLast;
    }

    public void setLast(String last) {
        mLast = last;
    }

    @Override
    public String toString() {
        return "Name{" +
                "mTitle='" + mTitle + '\'' +
                ", mFirst='" + mFirst + '\'' +
                ", mLast='" + mLast + '\'' +
                '}';
    }
}
