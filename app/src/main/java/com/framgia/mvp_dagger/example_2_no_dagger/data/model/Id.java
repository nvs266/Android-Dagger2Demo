package com.framgia.mvp_dagger.example_2_no_dagger.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sonng266 on 16/06/2018.
 */

public class Id {

    @SerializedName("name")
    @Expose
    private String mName;
    @SerializedName("value")
    @Expose
    private String mValue;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getValue() {
        return mValue;
    }

    public void setValue(String value) {
        mValue = value;
    }

    @Override
    public String toString() {
        return "Id{" +
                "mName='" + mName + '\'' +
                ", mValue='" + mValue + '\'' +
                '}';
    }
}
