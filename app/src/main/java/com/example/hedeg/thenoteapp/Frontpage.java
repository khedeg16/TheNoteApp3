package com.example.hedeg.thenoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Frontpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage);
    }



//Called when 'see notes'-button is clicked//
public void launchMain(View view){
    Intent intentLaunchMain = new Intent(Frontpage.this, MainActivity.class);
    Frontpage.this.startActivity(intentLaunchMain);
}
}