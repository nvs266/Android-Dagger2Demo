package com.framgia.mvp_dagger.example_1_dagger;

import android.util.Log;

import javax.inject.Inject;

public class War {

    private Starks mStarks;
    private Boltons mBoltons;

    @Inject
    public War(Starks starks, Boltons boltons) {
        mStarks = starks;
        mBoltons = boltons;
        Log.d(getClass().getSimpleName(), "War: ");
    }

    public void prepare() {
        mStarks.prepareForWar();
        mBoltons.prepareForWar();
    }

    public void report() {
        mStarks.reportForWar();
        mBoltons.reportForWar();
    }
}
