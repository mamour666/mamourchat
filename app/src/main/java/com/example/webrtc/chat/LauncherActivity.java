package com.example.webrtc.chat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.webrtc.android.R;

public class LauncherActivity extends AppCompatActivity {
    private Button button;
    private  Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        button1 = findViewById(R.id.btnopen2);
        button = findViewById(R.id.btnopen1);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(),ConnectActivity.class);
            startActivity(intent);
        });

        button1.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(),AddUserActivity.class);
            startActivity(intent);
        });
    }
}
