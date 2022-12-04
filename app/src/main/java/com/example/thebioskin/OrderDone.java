package com.example.thebioskin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class OrderDone extends AppCompatActivity {
    ImageView imvBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_done);
        linkViews();
        addEvent();
    }
    private void addEvent() {
        imvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OrderDone.this, Order.class);
                startActivity(intent);
            }
        });
    }

    private void linkViews() {
        imvBack = findViewById(R.id.imv_back);
    }

}
