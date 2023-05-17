package com.papilon.tacirlersdk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tacirlerdob_android.view.WelcomeKvkk;


public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    public void goButton(View view) {
        Intent intent = new Intent(BaseActivity.this, WelcomeKvkk.class);
        intent.putExtra("calling_package", "com.papilon.tacirlersdk");
        intent.putExtra("calling_class", "com.papilon.tacirlersdk.BaseActivity");
        intent.putExtra("from_main", "true");
        startActivity(intent);
    }
}