package com.example.thebioskin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.adapter.CategoryDetailAdapter;
import com.example.adapter.MyVoucherAdapter;

public class Category extends AppCompatActivity {
    ImageView imvBack;
    ListView lvCategory;
    CategoryDetailAdapter categoryDetailAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        linkViews();
        addEvent();
        addViews();
    }

    private void addViews() {
        lvCategory = findViewById(R.id.lv_Categories);
        categoryDetailAdapter = new CategoryDetailAdapter(Category.this, R.layout.item_list_categories);
        categoryDetailAdapter.add(new com.example.models.Category(R.drawable.taytrang, "Tẩy trang", "50 Sản phẩm"));
        categoryDetailAdapter.add(new com.example.models.Category(R.drawable.kem_duong_category_bg, "Kem dưỡng", "123 Sản phẩm"));
        categoryDetailAdapter.add(new com.example.models.Category(R.drawable.mat_na_category_bg, "Mặt nạ", "31 Sản phẩm"));
        categoryDetailAdapter.add(new com.example.models.Category(R.drawable.nuoc_can_bang_category_bg, "Nước cân bằng", "45 Sản phẩm"));
        categoryDetailAdapter.add(new com.example.models.Category(R.drawable.sua_rua_mat_category_bg, "Sữa rửa mặt", "73 Sản phẩm"));
        lvCategory.setAdapter(categoryDetailAdapter);
    }

    private void addEvent() {
        imvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Category.this, HomeActivity.class);
                startActivity(intent);
            }
        });

    }

    private void linkViews() {
        imvBack = findViewById(R.id.imvBack);
    }
}