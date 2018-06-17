package com.framgia.mvp_dagger.example_2_dagger.screen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.framgia.mvp_dagger.R;
import com.framgia.mvp_dagger.example_2_dagger.RandomUserApplication;
import com.framgia.mvp_dagger.example_2_no_dagger.data.model.Result;
import com.framgia.mvp_dagger.example_2_no_dagger.screen.RandomUserAdapter;
import com.framgia.mvp_dagger.example_2_no_dagger.screen.RandomUsersContract;

import java.util.List;

import javax.inject.Inject;

public class Example2DaggerActivity extends AppCompatActivity implements RandomUsersContract.View {

    @Inject
    RandomUserAdapter mRandomUserAdapter;
    @Inject
    RandomUsersContract.Presenter mPresenter;

    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example2);

        DaggerExample2DaggerActivityComponent.builder()
                .randomUserComponent(RandomUserApplication.get(this).getRandomUserComponent())
                .example2DaggerActivityModule(new Example2DaggerActivityModule(this))
                .build()
                .inject(this);

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
        recyclerView.setAdapter(mRandomUserAdapter);
    }
}
