package com.framgia.mvp_dagger.example_1_dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.framgia.mvp_dagger.R;

public class Example1Dagger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example1_dagger);

        BattleComponent battleComponent = DaggerBattleComponent.create();
        War war = battleComponent.getWar();
        war.prepare();
        war.report();

        Cash cash = battleComponent.getCash();
        Soldiers soldiers = battleComponent.getSoldiers();
    }
}
