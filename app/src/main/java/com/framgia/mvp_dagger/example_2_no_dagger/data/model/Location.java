package com.framgia.mvp_dagger.example_2_no_dagger.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sonng266 on 16/06/2018.
 */

public class Location {

    @SerializedName("street")
    @Expose
    private String mStreet;
    @SerializedName("city")
    @Expose
    private String mCity;
    @SerializedName("state")
    @Expose
    private String mState;
    @SerializedName("postcode")
    @Expose
    private String mPostCode;

    public String getStreet() {
        return mStreet;
    }

    public void setStreet(String street) {
        mStreet = street;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public String getPostCode() {
        return mPostCode;
    }

    public void setPostCode(String postCode) {
        mPostCode = postCode;
    }

    @Override
    public String toString() {
        return "Location{" +
                "mStreet='" + mStreet + '\'' +
                ", mCity='" + mCity + '\'' +
                ", mState='" + mState + '\'' +
                ", mPostCode='" + mPostCode + '\'' +
                '}';
    }
}
