package com.framgia.mvp_dagger.example_1_dagger;

import android.util.Log;

import javax.inject.Inject;

public class Cash {

    @Inject
    public Cash() {
        Log.d(getClass().getSimpleName(), "Cash: ");
    }
}
