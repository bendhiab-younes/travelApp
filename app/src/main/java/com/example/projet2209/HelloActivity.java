package com.example.projet2209;

import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        TextView helloTextView = findViewById(R.id.tvHello);
        helloTextView.setText("Hello Activity");
    }
}