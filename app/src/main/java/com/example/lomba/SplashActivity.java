package com.example.lomba;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); // Menggunakan layout activity_splash.xml

        // Timer untuk berpindah ke halaman LoginActivity
        new Handler().postDelayed(() -> {
            // Intent untuk berpindah ke LoginActivity
            Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
            startActivity(intent);
            finish(); // Menghapus SplashActivity dari stack
        }, 2000); // Durasi splash screen: 2000 ms (2 detik)
    }
}
