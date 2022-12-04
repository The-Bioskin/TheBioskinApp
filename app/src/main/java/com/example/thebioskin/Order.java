package com.example.thebioskin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Order extends AppCompatActivity {

    ImageView imvBack;
    LinearLayout lnWaiting, lnShipping, lnDone, lnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        linkViews();
        addEvents();
    }

    private void addEvents() {
        imvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Order.this, Account.class);
                startActivity(intent);
            }
        });

        lnWaiting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Order.this, OrderConfirm.class);
                startActivity(intent);
            }
        });

        lnShipping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Order.this, OrderShipping.class);
                startActivity(intent);
            }
        });

        lnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Order.this, OrderDone.class);
                startActivity(intent);
            }
        });

        lnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Order.this, OrderCancel.class);
                startActivity(intent);
            }
        });
    }

    private void linkViews() {
        imvBack = findViewById(R.id.imvBack);
        lnWaiting = findViewById(R.id.lnWaiting);
        lnShipping = findViewById(R.id.lnDelivery);
        lnDone = findViewById(R.id.lnDone);
        lnCancel = findViewById(R.id.lnCancelled);
    }
}