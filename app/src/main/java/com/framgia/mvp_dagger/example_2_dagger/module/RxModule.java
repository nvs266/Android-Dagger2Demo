package com.framgia.mvp_dagger.example_2_dagger.module;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by sonng266 on 17/06/2018.
 */

@Module
public class RxModule {
    @Provides
    public CompositeDisposable compositeDisposable() {
        return new CompositeDisposable();
    }
}
