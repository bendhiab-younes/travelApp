package com.example.projet2209;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        String destination = getIntent().getStringExtra("destination");
        int photoResId = getIntent().getIntExtra("photoResId", -1);

        TextView title = findViewById(R.id.tvTitle);
        title.setText(destination);

        ImageView photo = findViewById(R.id.ivPhoto);
        if (photoResId != -1) {
            photo.setImageResource(photoResId);
        }
    }
}