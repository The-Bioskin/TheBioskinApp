package com.example.thebioskin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adapter.CategoryAdapter;
import com.example.adapter.HotProductAdapter;
import com.example.adapter.PhotoAdapter;
import com.example.models.HotProduct;
import com.example.models.Photo;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator3;

public class HomeActivity extends AppCompatActivity implements HotProductAdapter.ViewHolder.OnHotProductListener, CategoryAdapter.ViewHolder.OnCategoryListener {
    ConstraintLayout ct9, ct7, ct2, ct8;
    EditText searchProduct;
    TextView txtMore;
    //hot product
    RecyclerView rclHotProduct;
    ArrayList<HotProduct> hotProductsItems;
    HotProductAdapter hotProductAdapter;
    //category
    RecyclerView rclCategory;
    ArrayList<com.example.models.Category> categoryItems;
    CategoryAdapter categoryAdapter;
    //Notification
    ImageView imv_Notifications, imv_ShoppingCart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        linkViews();
        addEvents();
        addViews();
    }

    private void addViews() {
        //Hot product
        rclHotProduct = findViewById(R.id.rclPopularProduct);
        hotProductsItems = new ArrayList<>();
        hotProductsItems.add(new HotProduct(R.drawable.nuoc_tay_trang_effaclar, "465.000 đ", "Nước tẩy trang Effaclar Micellar Water Ultra Oily Skin cho da dầu, mụn nhạy cảm 400ml", "4/5", "128 ratings"));
        hotProductsItems.add(new HotProduct(R.drawable.tay_da_chet_bio_essence, "365.000 đ", "Gel Tẩy Tế Bào Chết Bio-essence Dưỡng Da Tươi Trẻ Bio-Essence Renew Exfoliating Gel 60g ", "4/5", "128 ratings"));
        hotProductsItems.add(new HotProduct(R.drawable.tinh_chat_kiehl, "565.000 đ", "Serum Mờ Thâm Mụn & Đồng Đều Màu Da Kiehl's Clearly Corrective Dark Spot Solution", "4/5", "128 ratings"));
        hotProductsItems.add(new HotProduct(R.drawable.sua_rua_mat_clear_pore, "765.000 đ", "Sữa Rửa Mặt Cho Da Mụn Và Thu Nhỏ Lỗ Chân Lông Clear Pore Normaling Cleanser 177ml", "4/5", "128 ratings"));
        hotProductsItems.add(new HotProduct(R.drawable.nuoc_tay_trang_gentle_touch, "465.000 đ", "Nước tẩy trang Effaclar Micellar Water Ultra Oily Skin cho da dầu, mụn nhạy cảm 400ml", "4/5", "128 ratings"));

        hotProductAdapter = new HotProductAdapter(getApplicationContext(),hotProductsItems,this);
        rclHotProduct.hasFixedSize();
        rclHotProduct.setAdapter(hotProductAdapter);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(HomeActivity.this, RecyclerView.HORIZONTAL, false);
        rclHotProduct.setLayoutManager(linearLayoutManager1);

        //Category
        rclCategory = findViewById(R.id.rclCatogories);
        categoryItems = new ArrayList<>();
        categoryItems.add(new com.example.models.Category(R.drawable.taytrang, "Tẩy trang", "50 Sản phẩm"));
        categoryItems.add(new com.example.models.Category(R.drawable.kem_duong_category, "Kem dưỡng", "123 Sản phẩm"));
        categoryItems.add(new com.example.models.Category(R.drawable.mat_na_category, "Mặt nạ", "31 Sản phẩm"));
        categoryItems.add(new com.example.models.Category(R.drawable.nuoc_can_bang_category, "Nước cân bằng", "45 Sản phẩm"));
        categoryItems.add(new com.example.models.Category(R.drawable.sua_rua_mat_category, "Sữa rửa mặt", "73 Sản phẩm"));

        categoryAdapter = new CategoryAdapter(getApplicationContext(), categoryItems, this);
        rclCategory.setAdapter(categoryAdapter);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(HomeActivity.this, RecyclerView.HORIZONTAL, false);
        rclCategory.setLayoutManager(linearLayoutManager2);

        //Add slide
        PhotoAdapter photoAdapter = new PhotoAdapter(HomeActivity.this, getlistPhoto());
        mviewPager2.setAdapter(photoAdapter);
        mcircleIndicator3.setViewPager(mviewPager2);
    }


    private void linkViews() {
        ct9 = findViewById(R.id.ct_9);
        ct7 = findViewById(R.id.ct_7);
        ct2 = findViewById(R.id.ct_2);
        ct8 = findViewById(R.id.ct_8);
        //Slide
        mviewPager2 = findViewById(R.id.idViewPager);
        mcircleIndicator3 = findViewById(R.id.circle_indicator3);
        //Search
        searchProduct = findViewById(R.id.edt_SearchedProduct);
        //More
        txtMore = findViewById(R.id.txt_More);
        //Notification
        imv_Notifications = findViewById(R.id.imv_Notifications);
        imv_ShoppingCart = findViewById(R.id.imv_ShoppingCart);
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
        txtMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Category.class);
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

    private ViewPager2 mviewPager2;
    private CircleIndicator3 mcircleIndicator3;
    private List<Photo> getlistPhoto() {
        List<Photo> list = new ArrayList<>();
        list.add(new Photo(R.drawable.banner2));
        list.add(new Photo(R.drawable.banner3));
        list.add(new Photo(R.drawable.banner2));

        return list;
    }

    @Override
    public void OnCategoryClick(int position) {

    }
}