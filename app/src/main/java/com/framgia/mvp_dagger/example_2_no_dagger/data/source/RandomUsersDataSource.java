package com.framgia.mvp_dagger.example_2_no_dagger.data.source;

import com.framgia.mvp_dagger.example_2_no_dagger.data.model.RandomUsers;

import io.reactivex.Observable;

/**
 * Created by sonng266 on 16/06/2018.
 */

public interface RandomUsersDataSource {
    /**
     * Local Data Source
     */
    interface Local {

    }

    /**
     * Remote Data Source
     */
    interface Remote {
        Observable<RandomUsers> getRandomUsersWithSize(int size);
    }
}
