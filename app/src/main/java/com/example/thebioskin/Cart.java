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

import androidx.appcompat.app.AppCompatActivity;

import com.example.adapter.CartAdapter;

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
        setContentView(R.layout.);

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
        btnCheckoutItem = findViewById(R.id.btnCheckOutItem);
        btnReturnOutCart = findViewById(R.id.btnReturnOutCart);
        btnAdd = findViewById(R.id.btnAdd);
        btnMinus = findViewById(R.id.btnMinus);
        txtSelectVoucherCart = findViewById(R.id.txtSelectVoucherCart);
        txtNumberProduct = findViewById(R.id.txtNumberProduct);
    }

    /*private void configRecyclerView() {
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        lvProduct.setLayoutManager(manager);
    }*/

    private void initData() {
        products = new ArrayList<>();
        products.add(new CartProduct(R.drawable.img_caingot, "Cải ngọt", 17000, 1, 1));
        products.add(new CartProduct(R.drawable.img_strawberry, "Dâu tây", 102000, 0.5, 1));
        products.add(new CartProduct(R.drawable.img_banana, "Chuối", 27000, 1, 2));
        products.add(new CartProduct(R.drawable.img_raspberry, "Mâm xôi đỏ", 220000, 0.5, 1));
        products.add(new CartProduct(R.drawable.img_tomato, "Cà chua", 30000, 1, 2));
        products.add(new CartProduct(R.drawable.img_cherry, "Cherry", 179000, 0.5, 1));
        products.add(new CartProduct(R.drawable.img_peach, "Đào", 67000, 1, 4));
        products.add(new CartProduct(R.drawable.img_blueberry, "Việt quất", 325000, 5, 1));
        adapter = new CartProductAdapter(Cart.this, R.layout.cart_itemlayout, products);
        lvProduct.setAdapter(adapter);


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

        txtSelectVoucherCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cart.this, MyVoucher.class);
                startActivity(intent);
            }
        });
    }
}