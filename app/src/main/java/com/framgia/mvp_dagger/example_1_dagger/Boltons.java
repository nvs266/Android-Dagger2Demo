package com.framgia.mvp_dagger.example_1_dagger;

import android.util.Log;

import javax.inject.Inject;

public class Boltons implements House {

    @Inject
    public Boltons() {
        Log.d(getClass().getSimpleName(), "Boltons: ");
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
