package com.framgia.mvp_dagger.example_2_no_dagger.data.source.repository;

import com.framgia.mvp_dagger.example_2_no_dagger.data.model.RandomUsers;
import com.framgia.mvp_dagger.example_2_no_dagger.data.source.RandomUsersDataSource;
import com.framgia.mvp_dagger.example_2_no_dagger.data.source.remote.RandomUsersRemoteDataSource;

import io.reactivex.Observable;

/**
 * Created by sonng266 on 16/06/2018.
 */

public class RandomUserRepository implements RandomUsersDataSource.Remote {

    private RandomUsersDataSource.Remote mRemote;

    public RandomUserRepository(RandomUsersRemoteDataSource remote) {
        mRemote = remote;
    }

    @Override
    public Observable<RandomUsers> getRandomUsersWithSize(int size) {
        return mRemote.getRandomUsersWithSize(size);
    }
}
