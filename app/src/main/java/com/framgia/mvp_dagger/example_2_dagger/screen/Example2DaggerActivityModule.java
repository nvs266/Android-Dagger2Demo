package com.framgia.mvp_dagger.example_2_dagger.screen;

import com.framgia.mvp_dagger.example_2_no_dagger.data.source.repository.RandomUserRepository;
import com.framgia.mvp_dagger.example_2_no_dagger.screen.RandomUserAdapter;
import com.framgia.mvp_dagger.example_2_no_dagger.screen.RandomUsersContract;
import com.framgia.mvp_dagger.example_2_no_dagger.screen.RandomUsersPresenter;
import com.squareup.picasso.Picasso;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by sonng266 on 17/06/2018.
 */

@Module
public class Example2DaggerActivityModule {
    private final Example2DaggerActivity example2DaggerActivity;

    public Example2DaggerActivityModule(Example2DaggerActivity example2DaggerActivity) {
        this.example2DaggerActivity = example2DaggerActivity;
    }

    @Provides
    @Example2DaggerActivityScope
    public RandomUserAdapter randomUserAdapter(Picasso picasso) {
        return new RandomUserAdapter(example2DaggerActivity, picasso);
    }

    @Provides
    @Example2DaggerActivityScope
    public RandomUsersContract.Presenter randomUsersPresenter(RandomUserRepository randomUserRepository,
                                                              CompositeDisposable compositeDisposable) {
        return new RandomUsersPresenter(randomUserRepository, compositeDisposable);
    }

    @Provides
    @Example2DaggerActivityScope
    public CompositeDisposable compositeDisposable() {
        return new CompositeDisposable();
    }
}
