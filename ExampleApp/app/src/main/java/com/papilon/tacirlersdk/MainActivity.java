package com.papilon.tacirlersdk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.digitalonboarding.view.pap_WelcomeKvkk;

import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class MainActivity extends AppCompatActivity {

    Button openSdkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openSdkButton = findViewById(R.id.button);

        openSdkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startLibraryActivity();
            }
        });
    }

    public void startLibraryActivity() {
        Intent intent = new Intent(MainActivity.this, pap_WelcomeKvkk.class);
        intent.putExtra("calling_package", this.getPackageName());
        intent.putExtra("calling_class", this.getClass().getName());
        intent.putExtra("from_main", "true");

        startActivity(intent);
    }
}