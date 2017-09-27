package com.appliver.screenDimmer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.splunk.mint.Mint;

public class Main  extends Activity {
    
     @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        Mint.initAndStartSession(this.getApplication(), "2866a5ad");
        
        Intent svc = new Intent(this, OverlayShowingService.class);
        startService(svc);
        finish();
    }
}
