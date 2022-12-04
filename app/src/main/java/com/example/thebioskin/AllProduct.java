package com.example.thebioskin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.adapter.MyVoucherAdapter;
import com.example.adapter.ProductAdapter;
import com.example.models.Product;

public class AllProduct extends AppCompatActivity {
    ImageView backProducttoAccount;
    ListView lvAllProduct;
    ProductAdapter allProductAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_product_activity);

        linkViews();
        addViews();
        addEvents();
    }

    private void addViews() {
        lvAllProduct = findViewById(R.id.lv_allProduct);
        allProductAdapter = new ProductAdapter(AllProduct.this, R.layout.item_list_product);
        allProductAdapter.add(new com.example.models.Product(R.drawable.nuoc_tay_trang_bioderma,"Nước Tẩy Trang Bioderma Dành Cho Da Nhạy Cảm Công Nghệ Micellar Sensibio H2O 500ml","396.000 đ","5/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.nuoc_tay_trang_effaclar,"Nước tẩy trang Effaclar Micellar Water Ultra Oily Skin cho da dầu, mụn nhạy cảm 400ml","465.000 đ","4/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.nuoc_tay_trang_mineral_micellar,"Nước Tẩy Trang Mineral Micellar Water Pureté Thermale Cho Da Nhạy Cảm 400ml","396.000 đ","4/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.nuoc_tay_trang_neutrogena,"Nước Tẩy Trang Neutrogena Deep Clean Micellar Purifying Water 400ml","220.000 đ","3/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.nuoc_tay_trang_gentle_touch,"Nước Tẩy Trang 2 trong 1 Dịu Nhẹ Gentle Touch Makeup Remover 127ml","569.000 đ","4/5", "45 ratings"));

        allProductAdapter.add(new com.example.models.Product(R.drawable.sua_rua_mat_bioderma,"Gel Rửa Mặt Bioderma Tạo Bọt Cho Da Nhạy Cảm Sensibio Gel Moussant 200ml","396.000 đ","5/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.sua_rua_mat_clear_pore,"Sữa Rửa Mặt Cho Da Mụn Và Thu Nhỏ Lỗ Chân Lông Clear Pore Normaling Cleanser 177ml","465.000 đ","4/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.sua_rua_mat_effaclar,"Effaclar Gel rửa mặt cho da dầu mụn nhạy cảm 200ml","396.000 đ","4/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.sua_rua_mat_skin_balancing,"Sữa Rửa Mặt Cân Bằng Độ Ẩm Và Giảm Dầu Skin Balancing Oil-Reducing Cleanser 237ml","220.000 đ","3/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.sua_rua_mat_vichy,"Sữa Rửa Mặt Vichy Dạng Gel Làm Sạch Sâu Giảm Bã Nhờn Normaderm Phytosolution Intensive Purifying Gel 200ml","569.000 đ","4/5", "45 ratings"));
        lvAllProduct.setAdapter(allProductAdapter);
    }

    private void addEvents() {
        backProducttoAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllProduct.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void linkViews() {
        backProducttoAccount = findViewById(R.id.backPtoAccount);
    }
}
