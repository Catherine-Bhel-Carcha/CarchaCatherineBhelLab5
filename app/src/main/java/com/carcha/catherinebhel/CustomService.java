package com.carcha.catherinebhel;

import android.content.Intent;
import android.app.IntentService;
import android.support.annotation.Nullable;
import android.util.Log;


public class CustomService extends IntentService {
    public CustomService() {
        super("CustomService");
    }

    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("4ITF","CustomService is running on the background!");
    }
    }

