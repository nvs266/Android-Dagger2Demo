package com.framgia.mvp_dagger.example_2_dagger;

import android.app.Activity;
import android.app.Application;

import com.framgia.mvp_dagger.example_2_dagger.component.DaggerRandomUserComponent;
import com.framgia.mvp_dagger.example_2_dagger.component.RandomUserComponent;
import com.framgia.mvp_dagger.example_2_dagger.module.ContextModule;

/**
 * Created by sonng266 on 17/06/2018.
 */

public class RandomUserApplication extends Application {

    private RandomUserComponent mRandomUserComponent;

    public static RandomUserApplication get(Activity activity) {
        return (RandomUserApplication) activity.getApplication();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mRandomUserComponent = DaggerRandomUserComponent.builder()
                .contextModule(new ContextModule(this))
                .build();
    }

    public RandomUserComponent getRandomUserComponent() {
        return mRandomUserComponent;
    }
}
