package com.framgia.mvp_dagger.example_2_dagger.module;

import android.app.Activity;
import android.content.Context;

import com.framgia.mvp_dagger.example_2_dagger.interfaces.RandomUserApplicationScope;
import com.framgia.mvp_dagger.example_2_no_dagger.data.source.repository.RandomUserRepository;
import com.framgia.mvp_dagger.example_2_no_dagger.screen.RandomUsersPresenter;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by sonng266 on 17/06/2018.
 */

@Module(includes = {RandomUsersModule.class, RxModule.class})
public class ActivityModule {

    private final Context context;

    public ActivityModule(Activity context) {
        this.context = context;
    }

    @Named("activity_context")
    @RandomUserApplicationScope
    @Provides
    public Context context() {
        return context;
    }

    @Provides
    public RandomUsersPresenter randomUsersPresenter(RandomUserRepository randomUserRepository,
                                                     CompositeDisposable compositeDisposable) {
        return new RandomUsersPresenter(randomUserRepository, compositeDisposable);
    }
}
