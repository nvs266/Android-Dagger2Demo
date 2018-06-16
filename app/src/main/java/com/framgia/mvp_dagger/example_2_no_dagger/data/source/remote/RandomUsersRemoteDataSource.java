package com.framgia.mvp_dagger.example_2_no_dagger.data.source.remote;

import com.framgia.mvp_dagger.example_2_no_dagger.data.model.RandomUsers;
import com.framgia.mvp_dagger.example_2_no_dagger.data.source.RandomUsersDataSource;
import com.framgia.mvp_dagger.example_2_no_dagger.data.source.api.RandomUsersApi;

import io.reactivex.Observable;

/**
 * Created by sonng266 on 16/06/2018.
 */

public class RandomUsersRemoteDataSource implements RandomUsersDataSource.Remote {

    private RandomUsersApi mRandomUsersApi;

    public RandomUsersRemoteDataSource(RandomUsersApi randomUsersApi) {
        mRandomUsersApi = randomUsersApi;
    }

    @Override
    public Observable<RandomUsers> getRandomUsersWithSize(int size) {
        return mRandomUsersApi.getRandomUsers(size);
    }
}
