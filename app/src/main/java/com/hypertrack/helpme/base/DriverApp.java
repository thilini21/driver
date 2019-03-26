package com.hypertrack.helpme.base;

import android.app.Application;
import android.util.Log;

import com.hypertrack.helpme.R;
import com.hypertrack.lib.HyperTrack;


public class DriverApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        HyperTrack.initialize(this, getString(R.string.hypertrack_key));
        HyperTrack.enableDebugLogging(Log.VERBOSE);
        //TODO add Fabric/Crashlytics
    }
}
