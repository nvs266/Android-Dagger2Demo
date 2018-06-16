package com.framgia.mvp_dagger.example_2_no_dagger.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sonng266 on 16/06/2018.
 */

public class Result {

    @SerializedName("gender")
    @Expose
    private String mGender;
    @SerializedName("name")
    @Expose
    private Name mName;
    @SerializedName("location")
    @Expose
    private Location mLocation;
    @SerializedName("email")
    @Expose
    private String mEmail;
    @SerializedName("login")
    @Expose
    private Login mLogin;
    @SerializedName("dob")
    @Expose
    private String mDob;
    @SerializedName("registered")
    @Expose
    private String mRegistered;
    @SerializedName("phone")
    @Expose
    private String mPhone;
    @SerializedName("cell")
    @Expose
    private String mCell;
    @SerializedName("id")
    @Expose
    private Id mId;
    @SerializedName("picture")
    @Expose
    private Picture mPicture;
    @SerializedName("nat")
    @Expose
    private String mNat;

    public String getGender() {
        return mGender;
    }

    public void setGender(String gender) {
        mGender = gender;
    }

    public Name getName() {
        return mName;
    }

    public void setName(Name name) {
        mName = name;
    }

    public Location getLocation() {
        return mLocation;
    }

    public void setLocation(Location location) {
        mLocation = location;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public Login getLogin() {
        return mLogin;
    }

    public void setLogin(Login login) {
        mLogin = login;
    }

    public String getDob() {
        return mDob;
    }

    public void setDob(String dob) {
        mDob = dob;
    }

    public String getRegistered() {
        return mRegistered;
    }

    public void setRegistered(String registered) {
        mRegistered = registered;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public String getCell() {
        return mCell;
    }

    public void setCell(String cell) {
        mCell = cell;
    }

    public Id getId() {
        return mId;
    }

    public void setId(Id id) {
        mId = id;
    }

    public Picture getPicture() {
        return mPicture;
    }

    public void setPicture(Picture picture) {
        mPicture = picture;
    }

    public String getNat() {
        return mNat;
    }

    public void setNat(String nat) {
        mNat = nat;
    }

    @Override
    public String toString() {
        return "Result{" +
                "mGender='" + mGender + '\'' +
                ", mName=" + mName +
                ", mLocation=" + mLocation +
                ", mEmail='" + mEmail + '\'' +
                ", mLogin=" + mLogin +
                ", mDob='" + mDob + '\'' +
                ", mRegistered='" + mRegistered + '\'' +
                ", mPhone='" + mPhone + '\'' +
                ", mCell='" + mCell + '\'' +
                ", mId=" + mId +
                ", mPicture=" + mPicture +
                ", mNat='" + mNat + '\'' +
                '}';
    }
}
