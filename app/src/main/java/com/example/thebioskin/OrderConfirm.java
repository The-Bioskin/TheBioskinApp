package com.example.thebioskin;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class OrderConfirm extends AppCompatActivity {
    ImageView imvBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_confirm);
        linkViews();
        addEvent();
    }
    private void addEvent() {
        imvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OrderConfirm.this, Order.class);
                startActivity(intent);
            }
        });
    }

    private void linkViews() {
        imvBack = findViewById(R.id.imvBackToOrder);
    }
}
