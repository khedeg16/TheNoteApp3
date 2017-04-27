package com.example.hedeg.thenoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Frontpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage);
    }
}


//Called when 'see notes'-button is clicked//
public void launchMain(){
    Intent intentLaunchMain = new Intent(this, MainActivity.class);
    startActivity(intentLaunchMain);
}
}