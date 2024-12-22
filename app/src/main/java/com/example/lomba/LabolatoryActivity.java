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

public class LabolatoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laboratorium);

        // Menangani klik ikon Book
        ImageView bookIcon = findViewById(R.id.Book);  // Ganti ID sesuai dengan yang Anda gunakan
        bookIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LabolatoryActivity.this, FizzyActivity.class);
                startActivity(intent);
            }
        });

        // Menangani klik ikon Video
        ImageView videoIcon = findViewById(R.id.Video);  // Ganti ID sesuai dengan yang Anda gunakan
        videoIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke LabolatoryActivity
                Intent intent = new Intent(LabolatoryActivity.this, VideoActivity.class);
                startActivity(intent);
            }
        });

        // Ikon Bank
        ImageView BankIcon = findViewById(R.id.Bank); // Pastikan ID sesuai
        BankIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LabolatoryActivity.this, SoalActivity.class);
                startActivity(intent);
            }
        });
    }

    // Method yang dipanggil ketika materi ditekan
    public void openLink(View view) {
        // Peta URL berdasarkan ID
        Map<Integer, String> urlMap = new HashMap<>();
        urlMap.put(R.id.materi1, "https://app.vectary.com/viewer/v1/?model=9f730840-9103-485c-8d79-94d09b18125f&env=studio3");
        urlMap.put(R.id.materi2, "https://app.vectary.com/viewer/v1/?model=3663f562-083a-496c-b073-6a2eb34c8a8e&env=studio3");

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