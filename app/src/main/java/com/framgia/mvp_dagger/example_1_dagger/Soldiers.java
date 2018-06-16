package com.framgia.mvp_dagger.example_1_dagger;

import android.util.Log;

import javax.inject.Inject;

public class Soldiers {

    @Inject
    public Soldiers() {
        Log.d(getClass().getSimpleName(), "Soldiers: ");
    }
}
