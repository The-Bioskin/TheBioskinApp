package com.example.thebioskin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import com.example.adapter.CartAdapter;
import com.example.models.CartProduct;

import java.util.ArrayList;

public class Cart extends AppCompatActivity {
    ListView lvCart;
    ArrayList<CartProduct> products;
    CartAdapter adapter;

    ImageView btnReturnOutCart;
    Button btnCheckoutItem;
    TextView txtSelectVoucherCart, txtNumberProduct;
    ImageButton btnAdd, btnMinus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart_show);

        linkViews();
        initData();
        addEvent();

        lvCart.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        lvCart.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

    }


    private void linkViews() {

        lvCart = findViewById(R.id.lvCart);
        btnCheckoutItem = findViewById(R.id.btn_Order);
        btnReturnOutCart = findViewById(R.id.btnBackCartToHome);
//        btnAdd = findViewById(R.id.btnAdd);
//        btnMinus = findViewById(R.id.btnMinus);
//        txtSelectVoucherCart = findViewById(R.id.txtSelectVoucherCart);
//        txtNumberProduct = findViewById(R.id.txtNumberProduct);
    }

    /*private void configRecyclerView() {
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        lvProduct.setLayoutManager(manager);
    }*/

    private void initData() {
        products = new ArrayList<>();
        products.add(new CartProduct(R.drawable.sua_rua_mat_bioderma, 2 , "Gel Rửa Mặt Bioderma Tạo Bọt Cho Da Nhạy Cảm Sensibio Gel Moussant 200ml", 465.000));
        products.add(new CartProduct(R.drawable.sua_rua_mat_effaclar, 3 , "Effaclar Gel rửa mặt cho da dầu mụn nhạy cảm 200ml", 335.000));
        products.add(new CartProduct(R.drawable.nuoc_tay_trang_effaclar, 1, "Nước tẩy trang Effaclar Micellar Water Ultra Oily Skin cho da dầu, mụn nhạy cảm 400ml", 335.000));
        products.add(new CartProduct(R.drawable.nuoc_can_bang_laroche, 1, "Nước Cân Bằng La Roche-Posay Cho Da Thường, Nhạy Cảm 200ml Soothing Lotion Sensitive Skin", 335.000));
        products.add(new CartProduct(R.drawable.tinh_chat_kiehl, 2, "Serum Mờ Thâm Mụn & Đồng Đều Màu Da Kiehl's Clearly Corrective Dark Spot Solution", 335.000));
        adapter = new CartAdapter(Cart.this,R.layout.item_cart, products);
        lvCart.setAdapter(adapter);


    }

    private void addEvent() {
        btnReturnOutCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnCheckoutItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cart.this, Payment.class);
                startActivity(intent);
            }
        });

    }
}