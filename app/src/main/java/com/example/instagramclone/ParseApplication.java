package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("zmyEI0bTInmIPIotr28z21leaXkcMVnlOLTvSB07")
                .clientKey("BZld7D1lxEKhThQE3FWcMkUhQ65S9FJ0zArSjQVN")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
