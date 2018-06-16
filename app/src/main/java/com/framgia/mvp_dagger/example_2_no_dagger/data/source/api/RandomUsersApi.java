package com.framgia.mvp_dagger.example_2_no_dagger.data.source.api;

import com.framgia.mvp_dagger.example_2_no_dagger.data.model.RandomUsers;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by sonng266 on 16/06/2018.
 */

public interface RandomUsersApi {

    @GET("api")
    Observable<RandomUsers> getRandomUsers(@Query("results") int size);
}
