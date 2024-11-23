package com.example.drivetouniv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Navigate(View view){


        Uri gmmIntentUri = Uri.parse("google.navigation:q=40.8644624104021, -74.19858111477711");


        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);


        mapIntent.setPackage("com.google.android.apps.maps");


        startActivity(mapIntent);
    }
}