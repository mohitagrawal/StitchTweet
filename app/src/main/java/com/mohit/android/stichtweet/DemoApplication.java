package com.mohit.android.stichtweet;

import android.app.Application;

import com.mohit.android.stichtweet.logging.DebugLogTree;

import timber.log.Timber;

/**
 * All rights reserved
 * Created by mohit.agrawal on 2/7/18.
 */

public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Timber.plant(new DebugLogTree());
        } else {
            //dont log in release builds
        }
    }
}
