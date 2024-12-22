package com.example.lomba;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.loginButton).setOnClickListener(view -> {
            // Login button logic here
            Intent intent = new Intent(LoginActivity.this, SelectLevelActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.MasukButton).setOnClickListener(view -> {
            // Login button Masuk here
            Intent intent = new Intent(LoginActivity.this, SelectLevelActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.DaftarButton).setOnClickListener(view -> {
            // Pindah ke halaman daftar
            Intent intent = new Intent(LoginActivity.this, SelectLevelActivity.class);
            startActivity(intent);
        });
    }
}

