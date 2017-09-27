package com.appliver.screenDimmer;

import android.app.Application;
import com.splunk.mint.Mint;

public class App extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        Mint.setApplicationEnvironment(Mint.appEnvironmentDevelopment);
        Mint.initAndStartSession(this, "2866a5ad");
    }
}