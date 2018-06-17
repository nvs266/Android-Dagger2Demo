package com.framgia.mvp_dagger.example_2_dagger.module;

import android.content.Context;

import com.framgia.mvp_dagger.example_2_dagger.interfaces.ApplicationContext;

import java.io.File;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/**
 * Created by sonng266 on 16/06/2018.
 */

@Module(includes = ContextModule.class)
public class OkHttpClientModule {

    @Provides
    public OkHttpClient okHttpClient(Cache cache) {
        return new OkHttpClient()
                .newBuilder()
                .cache(cache)
                .build();
    }

    @Provides
    public Cache cache(File cacheFile) {
        return new Cache(cacheFile, 10 * 1000 * 1000); // 10 MB
    }

    @Provides
    public File file(@ApplicationContext Context context) {
        File file = new File(context.getCacheDir(), "HttpCache");
        file.mkdirs();
        return file;
    }
}
