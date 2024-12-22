package com.example.lomba;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SelectLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_level);

        // Navigasi ke SMA Activity
        findViewById(R.id.SMAButton).setOnClickListener(view -> {
            Intent intent = new Intent(SelectLevelActivity.this, FizzyActivity.class);
            startActivity(intent);
        });

        // Navigasi ke SMP Activity
        findViewById(R.id.SMPButton).setOnClickListener(view -> {
            Intent intent = new Intent(SelectLevelActivity.this, FizzyActivity.class);
            startActivity(intent);
        });
    }
}
