package com.example.lomba;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FizzyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catatan); // Layout XML yang Anda gunakan

        // Hubungkan ImageView dengan ID di XML
        ImageView getaranImage = findViewById(R.id.getaran1);
        ImageView kstImage = findViewById(R.id.kesetimbangan1);

        // Event klik untuk gambar "Getaran"
        getaranImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke LabolatoryActivity
                Intent intent = new Intent(FizzyActivity.this, LabolatoryActivity.class);
                startActivity(intent);
            }
        });

        // Event klik untuk gambar "KST"
        kstImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke LabolatoryActivity
                Intent intent = new Intent(FizzyActivity.this, LabolatoryActivity.class);
                startActivity(intent);
            }
        });

        // Ikon Video
        ImageView videoIcon = findViewById(R.id.Video); // Pastikan ID sesuai
        videoIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FizzyActivity.this, VideoActivity.class);
                startActivity(intent);
            }
        });

        // Ikon Labolatorium
        ImageView labolatoriumIcon = findViewById(R.id.Labolatorium); // Pastikan ID sesuai
        labolatoriumIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FizzyActivity.this, LabolatoryActivity.class);
                startActivity(intent);
            }
        });

        // Ikon Bank
        ImageView BankIcon = findViewById(R.id.Bank); // Pastikan ID sesuai
        BankIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FizzyActivity.this, SoalActivity.class);
                startActivity(intent);
            }
        });

        // Event klik untuk gambar "Getaran"
        getaranImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke MateriActivity
                Intent intent = new Intent(FizzyActivity.this, MateriActivity.class);
                startActivity(intent);
            }
        });
    }

    
}
