package com.framgia.mvp_dagger.example_2_no_dagger.screen;

import com.framgia.mvp_dagger.example_2_no_dagger.data.model.RandomUsers;
import com.framgia.mvp_dagger.example_2_no_dagger.data.source.repository.RandomUserRepository;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by sonng266 on 16/06/2018.
 */

public class RandomUsersPresenter implements RandomUsersContract.Presenter {

    private final int SIZE_DEFAULT = 10;

    private RandomUsersContract.View mView;
    private RandomUserRepository mRandomUserRepository;
    private CompositeDisposable mSubscriptions;

    public RandomUsersPresenter(RandomUserRepository randomUserRepository,
                                CompositeDisposable compositeDisposable) {
        mRandomUserRepository = randomUserRepository;
        mSubscriptions = compositeDisposable;
    }

    @Override
    public void setView(RandomUsersContract.View view) {
        mView = view;
    }

    @Override
    public void onStart() {
        getRandomUsersFromApi(SIZE_DEFAULT);
    }

    @Override
    public void onStop() {
        mSubscriptions.clear();
    }

    @Override
    public void getRandomUsersFromApi(int size) {
        Disposable subscribe = mRandomUserRepository.getRandomUsersWithSize(size)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        mView.showLoadingProgressBar();
                    }
                })
                .subscribe(new Consumer<RandomUsers>() {
                    @Override
                    public void accept(RandomUsers randomUsers) throws Exception {
                        mView.showRandomUsers(randomUsers.getResults());
                        mView.hideLoadingProgressBar();
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        mView.hideLoadingProgressBar();
                        mView.showError();
                    }
                });
        mSubscriptions.add(subscribe);
    }

}
