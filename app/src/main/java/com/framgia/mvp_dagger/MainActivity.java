package com.framgia.mvp_dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.framgia.mvp_dagger.example_1_dagger.BattleComponent;
import com.framgia.mvp_dagger.example_1_dagger.Cash;
import com.framgia.mvp_dagger.example_1_dagger.Soldiers;
import com.framgia.mvp_dagger.example_1_dagger.War;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
