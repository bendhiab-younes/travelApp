package com.example.projet2209;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String username = getIntent().getStringExtra("username");
        TextView welcomeTextView = findViewById(R.id.tvWelcome);
        welcomeTextView.setText("Welcome to Travel App, " + username + "!");

        findViewById(R.id.btnExplore).setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, ListActivity.class);
            startActivity(intent);
        });
    }
}