package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("SfE1qk2beBXpQtn9z6ctBsuNnHrxSFtdukNxXnCC")
                .clientKey("QibwkiAbrU5pZ8WVWLsuQDOizfprKuxThGXVKLjl")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
