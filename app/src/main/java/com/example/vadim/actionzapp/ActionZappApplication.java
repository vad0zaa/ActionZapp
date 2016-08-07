package com.example.vadim.actionzapp;

import android.app.Application;
import com.firebase.client.Firebase;

/**
 * Created by Administrator on 7.08.2016.
 */
public class ActionZappApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }

}
