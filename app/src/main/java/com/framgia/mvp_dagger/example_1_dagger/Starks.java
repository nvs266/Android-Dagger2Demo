package com.framgia.mvp_dagger.example_1_dagger;

import android.util.Log;

import javax.inject.Inject;

public class Starks implements House {

    @Inject
    public Starks() {
        Log.d(getClass().getSimpleName(), "Starks: ");
    }

    @Override
    public void prepareForWar() {
        Log.d(getClass().getSimpleName(), "prepareForWar: ");
    }

    @Override
    public void reportForWar() {
        Log.d(getClass().getSimpleName(), "reportForWar: ");
    }
}
