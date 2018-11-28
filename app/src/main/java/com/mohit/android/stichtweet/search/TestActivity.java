package com.mohit.android.stichtweet.search;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.Button;
import android.widget.Toast;

import com.mohit.android.stichtweet.R;

/**
 * Copyright (c) AppDynamics Inc.
 * All rights reserved
 * Created by mohit.agrawal on 8/8/18.
 */
public class TestActivity extends AppCompatActivity {

    Button chatButton;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);
        chatButton = findViewById(R.id.chatButton);
        chatButton.setOnClickListener(v ->
                Toast.makeText(TestActivity.this, "button clicked", Toast.LENGTH_SHORT).show());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.common_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }
}
