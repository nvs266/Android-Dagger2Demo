package com.framgia.mvp_dagger.example_2_no_dagger.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sonng266 on 16/06/2018.
 */

public class Picture {

    @SerializedName("large")
    @Expose
    private String mLarge;
    @SerializedName("medium")
    @Expose
    private String mMedium;
    @SerializedName("thumbnail")
    @Expose
    private String mThumbnail;

    public String getLarge() {
        return mLarge;
    }

    public void setLarge(String large) {
        mLarge = large;
    }

    public String getMedium() {
        return mMedium;
    }

    public void setMedium(String medium) {
        mMedium = medium;
    }

    public String getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(String thumbnail) {
        mThumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "mLarge='" + mLarge + '\'' +
                ", mMedium='" + mMedium + '\'' +
                ", mThumbnail='" + mThumbnail + '\'' +
                '}';
    }
}
