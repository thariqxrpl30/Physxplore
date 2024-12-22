package com.example.lomba;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        // Menangani klik ikon Labolatorium
        ImageView labolatoriumIcon = findViewById(R.id.Labolatorium);  // Ganti ID sesuai dengan yang Anda gunakan
        labolatoriumIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke LabolatoryActivity
                Intent intent = new Intent(VideoActivity.this, LabolatoryActivity.class);
                startActivity(intent);
            }
        });

        // Menangani klik ikon Book
        ImageView bookIcon = findViewById(R.id.Book);  // Ganti ID sesuai dengan yang Anda gunakan
        bookIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideoActivity.this, FizzyActivity.class);
                startActivity(intent);
            }
        });

        // Ikon Bank
        ImageView BankIcon = findViewById(R.id.Bank); // Pastikan ID sesuai
        BankIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideoActivity.this, SoalActivity.class);
                startActivity(intent);
            }
        });
    }

    // Method yang dipanggil ketika materi ditekan
    public void openLink(View view) {
        // Peta URL berdasarkan ID
        Map<Integer, String> urlMap = new HashMap<>();
        urlMap.put(R.id.video1, "https://youtu.be/GtzDkODdR9Q?si=7I8aKAJjBX_oPX1t");
        urlMap.put(R.id.video2, "https://youtu.be/VuYWHr8N_wE?si=T-OxQOmNckS0eo9c");

        // Ambil URL berdasarkan ID view yang diklik
        String url = urlMap.get(view.getId());

        if (url != null && !url.isEmpty()) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        } else {
            Toast.makeText(this, "Link tidak ditemukan", Toast.LENGTH_SHORT).show();
        }

    }

}