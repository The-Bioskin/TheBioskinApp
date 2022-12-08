package com.example.thebioskin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.models.HotProduct;

public class ShowProductDetail extends AppCompatActivity {
    ImageView imvBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        linkView();
        addEvent();
        setContentView(R.layout.activity_show_product_detail);
        ImageView img = findViewById(R.id.imv_tinhdaubuoi);
        TextView name = findViewById(R.id.txt_NameDetailProduct);
        TextView price = findViewById(R.id.txt_PriceDetailProduct);

        Bundle bundle = getIntent().getExtras();
        img.setImageResource(bundle.getInt("image"));
        name.setText(bundle.getString("name"));
        price.setText(bundle.getString("price"));


    }

    private void addEvent() {
//        imvBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent1 = new Intent(getApplicationContext(), AllProduct.class);
//                startActivity(intent1);
//            }
//        });
    }

    private void linkView() {
        imvBack = findViewById(R.id.imv_BackToAllProduct);
    }
}