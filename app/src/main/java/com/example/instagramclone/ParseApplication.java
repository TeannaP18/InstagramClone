package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("SfE1qk2beBXpQtn9z6ctBsuNnHrxSFtdukNxXnCC")
                .clientKey("QibwkiAbrU5pZ8WVWLsuQDOizfprKuxThGXVKLjl")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
