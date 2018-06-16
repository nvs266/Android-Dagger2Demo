package com.framgia.mvp_dagger.example_1_dagger;

import dagger.Component;

@Component
public interface BattleComponent {
    War getWar();

    Starks getStarks();

    Boltons getBoltons();

    Cash getCash();

    Soldiers getSoldiers();
}
