package com.framgia.mvp_dagger.example_2_dagger.module;

import android.content.Context;

import com.framgia.mvp_dagger.example_2_dagger.interfaces.ApplicationContext;
import com.framgia.mvp_dagger.example_2_dagger.interfaces.RandomUserApplicationScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sonng266 on 16/06/2018.
 */

@Module
public class ContextModule {

    Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @ApplicationContext
    @RandomUserApplicationScope
    @Provides
    public Context context() {
        return context.getApplicationContext();
    }
}
