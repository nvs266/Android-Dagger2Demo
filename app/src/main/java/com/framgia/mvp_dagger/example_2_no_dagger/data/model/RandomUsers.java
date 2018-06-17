package com.framgia.mvp_dagger.example_2_no_dagger.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sonng266 on 16/06/2018.
 */

public class RandomUsers {

    @SerializedName("results")
    @Expose
    private List<Result> mResults;
    @SerializedName("info")
    @Expose
    private Info mInfo;

    public List<Result> getResults() {
        return mResults;
    }

    public void setResults(List<Result> results) {
        mResults = results;
    }

    public Info getInfo() {
        return mInfo;
    }

    public void setInfo(Info info) {
        mInfo = info;
    }

    @Override
    public String toString() {
        return "RandomUsers{" +
                "mResults=" + mResults +
                ", mInfo=" + mInfo +
                '}';
    }
}
