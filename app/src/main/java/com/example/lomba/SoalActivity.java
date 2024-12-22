package com.example.lomba;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SoalActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);

        // Menangani klik ikon Book
        ImageView bookIcon = findViewById(R.id.Book);  // Ganti ID sesuai dengan yang Anda gunakan
        bookIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SoalActivity.this, FizzyActivity.class);
                startActivity(intent);
            }
        });

        // Menangani klik ikon Video
        ImageView videoIcon = findViewById(R.id.Video);  // Ganti ID sesuai dengan yang Anda gunakan
        videoIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke LabolatoryActivity
                Intent intent = new Intent(SoalActivity.this, VideoActivity.class);
                startActivity(intent);
            }
        });

        // Ikon Labolatorium
        ImageView labolatoriumIcon = findViewById(R.id.Labolatorium); // Pastikan ID sesuai
        labolatoriumIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SoalActivity.this, LabolatoryActivity.class);
                startActivity(intent);
            }
        });

        Button soal1Button = findViewById(R.id.soal1);
        soal1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke LabolatoryActivity
                Intent intent = new Intent(SoalActivity.this, Soal1Activity.class);
                startActivity(intent);
            }
        });

    }

}
