package com.example.lomba;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MateriActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi); // Pastikan ini layout yang benar

        // Menghubungkan tombol LABOLATORIUM
        Button labolatoriumButton = findViewById(R.id.materilabo);

        // Event klik untuk tombol LABOLATORIUM
        labolatoriumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke LabolatoryActivity
                Intent intent = new Intent(MateriActivity.this, LabolatoryActivity.class);
                startActivity(intent);
            }
        });
    }



}