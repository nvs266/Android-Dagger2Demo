package com.framgia.mvp_dagger.example_2_dagger.component;

import com.framgia.mvp_dagger.example_2_dagger.interfaces.RandomUserApplicationScope;
import com.framgia.mvp_dagger.example_2_dagger.module.PicassoModule;
import com.framgia.mvp_dagger.example_2_dagger.module.RandomUsersModule;
import com.framgia.mvp_dagger.example_2_no_dagger.data.source.repository.RandomUserRepository;
import com.squareup.picasso.Picasso;

import dagger.Component;

/**
 * Created by sonng266 on 16/06/2018.
 */

@RandomUserApplicationScope
@Component(modules = {RandomUsersModule.class, PicassoModule.class})
public interface RandomUserComponent {

    Picasso getPicasso();

    RandomUserRepository getRandomUserRepository();
}
