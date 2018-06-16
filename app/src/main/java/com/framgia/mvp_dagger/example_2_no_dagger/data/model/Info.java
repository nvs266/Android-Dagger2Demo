package com.framgia.mvp_dagger.example_2_no_dagger.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sonng266 on 16/06/2018.
 */

public class Info {

    @SerializedName("seed")
    @Expose
    private String mSeed;
    @SerializedName("results")
    @Expose
    private int mResults;
    @SerializedName("page")
    @Expose
    private int mPage;
    @SerializedName("version")
    @Expose
    private String mVersion;

    public String getSeed() {
        return mSeed;
    }

    public void setSeed(String seed) {
        mSeed = seed;
    }

    public int getResults() {
        return mResults;
    }

    public void setResults(int results) {
        mResults = results;
    }

    public int getPage() {
        return mPage;
    }

    public void setPage(int page) {
        mPage = page;
    }

    public String getVersion() {
        return mVersion;
    }

    public void setVersion(String version) {
        mVersion = version;
    }

    @Override
    public String toString() {
        return "Info{" +
                "mSeed='" + mSeed + '\'' +
                ", mResults=" + mResults +
                ", mPage=" + mPage +
                ", mVersion='" + mVersion + '\'' +
                '}';
    }
}
