package com.example.thebioskin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Payment extends AppCompatActivity {
    Button btnTT;
    ImageView imvBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);
        linkViews();
        addEvent();
    }

    private void addEvent() {
        btnTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Payment.this, "Thanh toán thành công!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Payment.this, Order.class);
                startActivity(intent);
            }
        });
        imvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Payment.this, Cart.class);
                startActivity(intent);
            }
        });
    }

    private void linkViews() {
        btnTT = findViewById(R.id.btn_thanhtoan);
        imvBack = findViewById(R.id.imv_ThanhToan);
    }
}
