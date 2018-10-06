package com.carcha.catherinebhel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        Intent i = new Intent(this, CustomService.class);
        startService(i);
    }
    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.activity2) {
            i = new Intent(this, SecondScreen.class);
            startActivity(i);
        } else if (v.getId() == R.id.maps) {
            i = new Intent(getIntent().ACTION_VIEW);
            i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.589595 + "," + 120.975579));
            chooser = Intent.createChooser(i, "Choose A Map App");
            startActivity(chooser);
        }
}
    }
