package com.example.projet2209;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        String username = getIntent().getStringExtra("username");
        TextView usernameTextView = findViewById(R.id.tvUsername);
        usernameTextView.setText(username);

        ImageView profileImageView = findViewById(R.id.ivProfile);
        profileImageView.setImageResource(R.drawable.ic_profile);
    }
}