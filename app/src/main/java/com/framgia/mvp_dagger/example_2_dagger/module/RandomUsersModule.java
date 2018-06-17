package com.framgia.mvp_dagger.example_2_dagger.module;

import com.framgia.mvp_dagger.example_2_dagger.interfaces.RandomUserApplicationScope;
import com.framgia.mvp_dagger.example_2_no_dagger.data.source.api.RandomUsersApi;
import com.framgia.mvp_dagger.example_2_no_dagger.data.source.remote.RandomUsersRemoteDataSource;
import com.framgia.mvp_dagger.example_2_no_dagger.data.source.repository.RandomUserRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sonng266 on 16/06/2018.
 */

@Module(includes = OkHttpClientModule.class)
public class RandomUsersModule {

    @RandomUserApplicationScope
    @Provides
    public RandomUserRepository randomUserRepository(
            RandomUsersRemoteDataSource randomUsersRemoteDataSource) {
        return new RandomUserRepository(randomUsersRemoteDataSource);
    }

    @Provides
    public RandomUsersRemoteDataSource randomUsersRemoteDataSource(RandomUsersApi randomUsersApi) {
        return new RandomUsersRemoteDataSource(randomUsersApi);
    }

    @Provides
    public RandomUsersApi randomUsersApi(Retrofit retrofit) {
        return retrofit.create(RandomUsersApi.class);
    }

    @Provides
    public Retrofit retrofit(OkHttpClient okHttpClient,
                             GsonConverterFactory gsonConverterFactory,
                             RxJava2CallAdapterFactory rxJava2CallAdapterFactory) {
        return new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://randomuser.me/")
                .addCallAdapterFactory(rxJava2CallAdapterFactory)
                .addConverterFactory(gsonConverterFactory)
                .build();
    }

    @Provides
    public RxJava2CallAdapterFactory rxJava2CallAdapterFactory() {
        return RxJava2CallAdapterFactory.create();
    }

    @Provides
    public GsonConverterFactory gsonConverterFactory(Gson gson) {
        return GsonConverterFactory.create(gson);
    }

    @Provides
    public Gson gson() {
        return new GsonBuilder().create();
    }
}
