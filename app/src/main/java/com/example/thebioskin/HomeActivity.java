package com.example.thebioskin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {
    ConstraintLayout ct9, ct7;
    EditText searchProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        linkViews();
        addEvents();
    }


    private void linkViews() {
        ct9 = findViewById(R.id.ct_9);
        ct7 = findViewById(R.id.ct_7);
        searchProduct = findViewById(R.id.edt_SearchedProduct);
    }

    private void addEvents() {
        ct9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Account.class);
                startActivity(intent);
            }
        });
        ct7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, AllProduct.class);
                startActivity(intent);
            }
        });
        searchProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, SearchProductActivity.class);
                startActivity(intent);
            }
        });
    }
}