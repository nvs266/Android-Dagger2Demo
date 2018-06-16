package com.framgia.mvp_dagger.example_2_no_dagger.data.source.local;

import com.framgia.mvp_dagger.example_2_no_dagger.data.source.RandomUsersDataSource;

/**
 * Created by sonng266 on 16/06/2018.
 */

public class RandomUsersLocalDataSource implements RandomUsersDataSource.Local {

    private static RandomUsersLocalDataSource sInstance;

    public static RandomUsersLocalDataSource getInstance() {
        if (sInstance == null) {
            sInstance = new RandomUsersLocalDataSource();
        }

        return sInstance;
    }

    private RandomUsersLocalDataSource() {

    }
}
