package com.example.thebioskin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.adapter.ProductAdapter;
import com.example.adapter.ShopAdapter;
import com.example.models.Shop;

public class StoreList extends AppCompatActivity {
    ImageView imvBacktoHomePage;
    ListView lvListStore;
    ShopAdapter shopAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_list);
        linkViews();
        addEvents();
        addViews();
    }

    private void addViews() {
        lvListStore = findViewById(R.id.lvListStore);
        shopAdapter = new ShopAdapter(StoreList.this, R.layout.item_list_store);
        shopAdapter.add(new Shop(R.drawable.ic_location_on_24, "Cửa hàng The Bioskin Quang Trung", "256 Quang Trung, phường 12, quận Gò Vấp, TP.HCM", "Thời gian hoạt động: 9:00 - 22:00", "Số điện thoại: 19004499"));
        shopAdapter.add(new Shop(R.drawable.ic_location_on_24, "Cửa hàng The Bioskin Quang Trung", "256 Quang Trung, phường 12, quận Gò Vấp, TP.HCM", "Thời gian hoạt động: 9:00 - 22:00", "Số điện thoại: 19004499"));
        shopAdapter.add(new Shop(R.drawable.ic_location_on_24, "Cửa hàng The Bioskin Quang Trung", "256 Quang Trung, phường 12, quận Gò Vấp, TP.HCM", "Thời gian hoạt động: 9:00 - 22:00", "Số điện thoại: 19004499"));
        shopAdapter.add(new Shop(R.drawable.ic_location_on_24, "Cửa hàng The Bioskin Quang Trung", "256 Quang Trung, phường 12, quận Gò Vấp, TP.HCM", "Thời gian hoạt động: 9:00 - 22:00", "Số điện thoại: 19004499"));
        lvListStore.setAdapter(shopAdapter);
    }

    private void addEvents() {
        imvBacktoHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StoreList.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void linkViews() {
        imvBacktoHomePage = findViewById(R.id.imvBackToHomePage);
    }
}