package com.example.thebioskin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.time.chrono.HijrahChronology;

public class SearchProductActivity extends AppCompatActivity {
//    ImageView imvBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_product);
//        linkViews();
//        addEvents();
    }

//    private void addEvents() {
//        imvBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(SearchProductActivity.this, HomeActivity.class);
//                startActivity(intent);
//            }
//        });
//    }
//
//    private void linkViews() {
//        imvBack = findViewById(R.id.imvBack);
//    }
}