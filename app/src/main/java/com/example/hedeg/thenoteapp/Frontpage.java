package com.example.hedeg.thenoteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Frontpage extends AppCompatActivity {

    Button launch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage);
        launch = (Button) findViewById(R.id.postNewNote);
        launch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchNewNote(v);
            }
        });
    }



//Called when 'see notes'-button is clicked//
public void launchMain(View view){
    Intent intentLaunchMain = new Intent(Frontpage.this, MainActivity.class);
    Frontpage.this.startActivity(intentLaunchMain);
}

public void launchNewNote(View view){
    Intent intentLaunchNewNote = new Intent(Frontpage.this, EditorActivity.class);
    Frontpage.this.startActivity(intentLaunchNewNote);
}
}