package com.appliver.screenDimmer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Main  extends Activity {
    
     @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent svc = new Intent(this, OverlayShowingService.class);
        startService(svc);
        finish();
    }
}
