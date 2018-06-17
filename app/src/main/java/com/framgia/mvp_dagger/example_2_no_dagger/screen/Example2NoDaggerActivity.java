package com.framgia.mvp_dagger.example_2_no_dagger.screen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.framgia.mvp_dagger.R;
import com.framgia.mvp_dagger.example_2_no_dagger.data.model.Result;
import com.framgia.mvp_dagger.example_2_no_dagger.data.source.api.RandomUsersApi;
import com.framgia.mvp_dagger.example_2_no_dagger.data.source.remote.RandomUsersRemoteDataSource;
import com.framgia.mvp_dagger.example_2_no_dagger.data.source.repository.RandomUserRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.List;

import io.reactivex.disposables.CompositeDisposable;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Example2NoDaggerActivity extends AppCompatActivity implements RandomUsersContract.View {

    private final String BASE_URL = "https://randomuser.me/";

    private RandomUserAdapter mRandomUserAdapter;
    private RandomUsersContract.Presenter mPresenter;
    private ProgressBar mProgressBar;
    private Picasso mPicasso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example2);

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        File cacheFile = new File(this.getCacheDir(), "HttpCache");
        cacheFile.mkdirs();

        Cache cache = new Cache(cacheFile, 10 * 1000 * 1000); //10 MB

        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .cache(cache)
                .build();

        OkHttp3Downloader okHttpDownloader = new OkHttp3Downloader(okHttpClient);

        mPicasso = new Picasso.Builder(this).downloader(okHttpDownloader).build();

        Retrofit retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                .build();

        RandomUsersApi randomUsersApi = retrofit.create(RandomUsersApi.class);

        RandomUsersRemoteDataSource randomUsersRemoteDataSource =
                new RandomUsersRemoteDataSource(randomUsersApi);

        RandomUserRepository randomUserRepository =
                new RandomUserRepository(randomUsersRemoteDataSource);

        mPresenter = new RandomUsersPresenter(randomUserRepository, new CompositeDisposable());
        mPresenter.setView(this);

        initViews();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mPresenter.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mPresenter.onStop();
    }

    @Override
    public void showRandomUsers(List<Result> results) {
        mRandomUserAdapter.setData(results);
    }

    @Override
    public void showLoadingProgressBar() {
        mProgressBar.setVisibility(View.VISIBLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
    }

    @Override
    public void hideLoadingProgressBar() {
        mProgressBar.setVisibility(View.GONE);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
    }

    @Override
    public void showError() {
        Toast.makeText(this, R.string.msg_no_internet_connection, Toast.LENGTH_SHORT).show();
    }

    private void initViews() {
        mProgressBar = findViewById(R.id.progress_bar);

        RecyclerView recyclerView = findViewById(R.id.recycler_random_users);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mRandomUserAdapter = new RandomUserAdapter(this, mPicasso);
        recyclerView.setAdapter(mRandomUserAdapter);
    }
}
