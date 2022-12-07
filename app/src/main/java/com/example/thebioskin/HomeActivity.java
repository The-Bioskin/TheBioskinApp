package com.example.thebioskin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adapter.HotProductAdapter;
import com.example.models.HotProduct;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements HotProductAdapter.ViewHolder.OnHotProductListener {
    ConstraintLayout ct9, ct7, ct2, ct8;
    EditText searchProduct;
    ImageView imv_Notifications, imv_ShoppingCart;
    RecyclerView rclHotProduct;
    ArrayList<HotProduct> hotProductsItems;
    HotProductAdapter hotProductAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        linkViews();
        addEvents();
        addViews();
    }

    private void addViews() {
        rclHotProduct = findViewById(R.id.rclPopularProduct);
        hotProductsItems = new ArrayList<>();
        hotProductsItems.add(new HotProduct(R.drawable.nuoc_tay_trang_effaclar, "465.000 đ", "Nước tẩy trang Effaclar Micellar Water Ultra Oily Skin cho da dầu, mụn nhạy cảm 400ml", "4/5", "128 ratings"));
        hotProductsItems.add(new HotProduct(R.drawable.nuoc_tay_trang_effaclar, "465.000 đ", "Nước tẩy trang Effaclar Micellar Water Ultra Oily Skin cho da dầu, mụn nhạy cảm 400ml", "4/5", "128 ratings"));
        hotProductsItems.add(new HotProduct(R.drawable.nuoc_tay_trang_effaclar, "465.000 đ", "Nước tẩy trang Effaclar Micellar Water Ultra Oily Skin cho da dầu, mụn nhạy cảm 400ml", "4/5", "128 ratings"));
        hotProductsItems.add(new HotProduct(R.drawable.nuoc_tay_trang_effaclar, "465.000 đ", "Nước tẩy trang Effaclar Micellar Water Ultra Oily Skin cho da dầu, mụn nhạy cảm 400ml", "4/5", "128 ratings"));
        hotProductsItems.add(new HotProduct(R.drawable.nuoc_tay_trang_effaclar, "465.000 đ", "Nước tẩy trang Effaclar Micellar Water Ultra Oily Skin cho da dầu, mụn nhạy cảm 400ml", "4/5", "128 ratings"));

        hotProductAdapter = new HotProductAdapter(getApplicationContext(),hotProductsItems,this);
        rclHotProduct.hasFixedSize();
        rclHotProduct.setAdapter(hotProductAdapter);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(HomeActivity.this, RecyclerView.HORIZONTAL, false);
        rclHotProduct.setLayoutManager(linearLayoutManager1);
    }


    private void linkViews() {
        ct9 = findViewById(R.id.ct_9);
        ct7 = findViewById(R.id.ct_7);
        ct2 = findViewById(R.id.ct_2);
        ct8 = findViewById(R.id.ct_8);
        imv_Notifications = findViewById(R.id.imv_Notifications);
        imv_ShoppingCart = findViewById(R.id.imv_ShoppingCart);
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
        ct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, MoreHotProduct.class);
                startActivity(intent);
            }
        });
        ct8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, StoreList.class);
                startActivity(intent);
            }
        });
        imv_Notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, NotificationActivity.class);
                startActivity(intent);
            }
        });
        imv_ShoppingCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Cart.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void OnHotProductClick(int position) {

    }
}