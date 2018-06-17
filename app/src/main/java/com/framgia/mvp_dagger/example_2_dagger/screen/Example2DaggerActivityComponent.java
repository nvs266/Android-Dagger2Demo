package com.framgia.mvp_dagger.example_2_dagger.screen;

import com.framgia.mvp_dagger.example_2_dagger.component.RandomUserComponent;

import dagger.Component;

/**
 * Created by sonng266 on 17/06/2018.
 */

@Component(modules = Example2DaggerActivityModule.class, dependencies = RandomUserComponent.class)
@Example2DaggerActivityScope
public interface Example2DaggerActivityComponent {

    void inject(Example2DaggerActivity example2DaggerActivity);
}
