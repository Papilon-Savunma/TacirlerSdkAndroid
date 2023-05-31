package com.papilon.tacirlersdk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.example.tacirlerdob_android.view.pap_WelcomeKvkk;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goButton(View view) {
        Intent intent = new Intent(MainActivity.this, pap_WelcomeKvkk.class);
        intent.putExtra("calling_package", this.getPackageName());
        intent.putExtra("calling_class", this.getClass().getName());
        intent.putExtra("from_main", "true");

        startActivity(intent);
    }
}