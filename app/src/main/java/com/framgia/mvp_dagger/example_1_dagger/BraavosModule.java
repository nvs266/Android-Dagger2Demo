package com.framgia.mvp_dagger.example_1_dagger;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

import javax.inject.Inject;

@Module
public class BraavosModule {

    @Inject
    public BraavosModule() {
        Log.d(getClass().getSimpleName(), "BraavosModule: ");
    }

    @Provides
    Cash provideCash() {
        return new Cash();
    }

    @Provides
    Soldiers provideSoldiers() {
        return new Soldiers();
    }
}
