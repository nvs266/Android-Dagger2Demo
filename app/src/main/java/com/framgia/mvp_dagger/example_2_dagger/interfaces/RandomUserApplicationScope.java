package com.framgia.mvp_dagger.example_2_dagger.interfaces;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by sonng266 on 17/06/2018.
 */

@Scope
@Retention(RetentionPolicy.CLASS)
public @interface RandomUserApplicationScope {
}
