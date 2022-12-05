package com.example.thebioskin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Filter extends AppCompatActivity {
    ImageView imvBackToSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        linkViews();
        addEvent();
    }

    private void addEvent() {
        imvBackToSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Filter.this, SearchProductActivity.class);
                startActivity(intent);
            }
        });
    }

    private void linkViews() {
        imvBackToSearch = findViewById(R.id.imvBackToSearch);
    }
}