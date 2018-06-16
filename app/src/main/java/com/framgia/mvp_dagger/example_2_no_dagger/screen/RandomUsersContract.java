package com.framgia.mvp_dagger.example_2_no_dagger.screen;

import com.framgia.mvp_dagger.example_2_no_dagger.data.model.Result;

import java.util.List;

/**
 * Created by sonng266 on 16/06/2018.
 */

public interface RandomUsersContract {
    /**
     * View
     */
    interface View {
        void showRandomUsers(List<Result> results);

        void showLoadingProgressBar();

        void hideLoadingProgressBar();

        void showError();
    }

    /**
     * Presenter
     */
    interface Presenter {
        void getRandomUsersFromApi(int size);

        void setView(View view);

        void onStart();

        void onStop();
    }

}
