package com.framgia.mvp_dagger.example_2_no_dagger.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sonng266 on 16/06/2018.
 */

public class Login {

    @SerializedName("username")
    @Expose
    private String mUserName;
    @SerializedName("password")
    @Expose
    private String mPassword;
    @SerializedName("salt")
    @Expose
    private String mSalt;
    @SerializedName("md5")
    @Expose
    private String mMd5;
    @SerializedName("sha1")
    @Expose
    private String mSha1;
    @SerializedName("sha256")
    @Expose
    private String mSha256;

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }

    public String getSalt() {
        return mSalt;
    }

    public void setSalt(String salt) {
        mSalt = salt;
    }

    public String getMd5() {
        return mMd5;
    }

    public void setMd5(String md5) {
        mMd5 = md5;
    }

    public String getSha1() {
        return mSha1;
    }

    public void setSha1(String sha1) {
        mSha1 = sha1;
    }

    public String getSha256() {
        return mSha256;
    }

    public void setSha256(String sha256) {
        mSha256 = sha256;
    }

    @Override
    public String toString() {
        return "Login{" +
                "mUserName='" + mUserName + '\'' +
                ", mPassword='" + mPassword + '\'' +
                ", mSalt='" + mSalt + '\'' +
                ", mMd5='" + mMd5 + '\'' +
                ", mSha1='" + mSha1 + '\'' +
                ", mSha256='" + mSha256 + '\'' +
                '}';
    }
}
