package com.carcha.catherinebhel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class SecondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        Intent i = new Intent(this, CustomService.class);
        startService(i);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.activity1) {
            i = new Intent(this, FirstScreen.class);
            startActivity(i);
        } else if (v.getId() == R.id.map2) {
            i = new Intent(getIntent().ACTION_VIEW);
            i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.594689 + "," + 120.970649));
            chooser = Intent.createChooser(i, "Choose A Map App");
            startActivity(chooser);
        }
    }
}