package com.example.thebioskin;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.adapter.MyVoucherAdapter;
import com.example.adapter.ProductAdapter;
import com.example.models.ItemDetail;
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

        allProductAdapter.add(new com.example.models.Product(R.drawable.tay_da_chet_skin_perfecting,"Dung Dịch Loại Bỏ Tế Bào Chết Skin Perfecting 2% BHA Liquid Exfoliant 118ml","396.000 đ","5/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.tay_da_chet_bio_essence,"Gel Loại Bỏ Tế Bào Chết Hoá Học Skin Perfecting 8% AHA Gel Exfoliant 100ml","465.000 đ","4/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.tay_da_chet_exfoliant_peel,"Tinh Chất Thay Da Sinh Học 25% AHA + 2% BHA Exfoliant Peel 30ml","396.000 đ","4/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.tay_da_chet_neutrogena,"Tẩy Da Chết Neutrogena Visibly Clear Daily Scrub 150ml","220.000 đ","3/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.tay_da_chet_gel_exfoliant,"Gel Tẩy Tế Bào Chết Bio-essence Dưỡng Da Tươi Trẻ Bio-Essence Renew Exfoliating Gel 60g ","569.000 đ","4/5", "45 ratings"));

        allProductAdapter.add(new com.example.models.Product(R.drawable.nuoc_can_bang_laroche,"Nước Cân Bằng La Roche-Posay Cho Da Thường, Nhạy Cảm 200ml Soothing Lotion Sensitive Skin","370.000đ","4/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.nuoc_can_bang_vichy,"Nước Cân Bằng Vichy Giảm Bóng Dầu, Se Lỗ Chân Lông 200ml Normaderm Purifying Pore-Tightening Lotion","470.000đ","4/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.nuoc_can_bang_bioderma,"Nước Hoa Hồng Bioderma Dành Cho Da Nhạy Cảm 250ml Sensibio Tonique","350.000đ","4/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.nuoc_can_bang_neutrogena,"Nước Hoa Hồng Neutrogena Không Chứa Cồn 150ml Alcohol Free Toner","150.000đ","4/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.tinh_chat_laroche_possay,"Tinh Chất La Roche-Posay Phục Hồi Độ Ẩm, Săn Chắc Da 30ml Hyalu B5 Serum","850.000đ","4/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.tinh_chat_vichy,"Serum Vichy Khoáng Phục Hồi Chuyên Sâu Mineral 89 50ml Mineral 89 Serum","750.000đ","4/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.tinh_chat_neutrogena,"Tinh chất dưỡng ẩm Neutrogena Hydro Boost Hydrating Serum 30ml","400.000đ","4/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.tinh_chat_kiehl,"Serum Mờ Thâm Mụn & Đồng Đều Màu Da Kiehl's Clearly Corrective Dark Spot Solution","1.700.000đ","4/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.xit_co_the_lavadin,"Kem Dưỡng La Roche-Posay Cicaplast Baume B5 Soothing Repairing Balm 40ml ","285000","4/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.xit_co_the_bi_dao,"Paula's choice Clear Oil-Free Moisturizer 60ml","809000","4/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.xit_co_the_angel,"Kem dưỡng ẩm Neutrogena Hydro Boost Water Gel 50g","274000","4/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.xit_co_the_bacha,"Kem dưỡng Bioderma Sebium Sensitive 30ml","410000","4/5", "45 ratings"));
        allProductAdapter.add(new com.example.models.Product(R.drawable.xit_co_the_pepermint,"Kem Dưỡng Kiehl’s Ultra Facial Oil-Free Gel-Cream 50ml","750000","4/5", "45 ratings"));

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

        lvAllProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Product p = (Product) allProductAdapter.getItem(position);
                Intent intent = new Intent(AllProduct.this, ShowProductDetail.class);
                intent.putExtra("name", p.getProductName());
                intent.putExtra("price", p.getProductPrice());
                intent.putExtra("image", p.getImgProduct());
                startActivity(intent);
            }
        });
    }

//    private void showProductDetail(Product p) {
//        final Dialog dialog = new Dialog(AllProduct.this);
//        dialog.setContentView(R.layout.activity_show_product_detail);
//        dialog.show();
//
//        ImageView imgHinh = dialog.findViewById(R.id.imv_tinhdaubuoi);
//        TextView txtNameDetail = dialog.findViewById(R.id.txt_NameDetailProduct);
//        TextView txtPriceDetail = dialog.findViewById(R.id.txt_PriceDetailProduct);
//        TextView txtDescript = dialog.findViewById(R.id.txt_DescribeinDetail);
//        TextView txtFunction = dialog.findViewById(R.id.txt_Functionindetail);
//        TextView txtHowtouse = dialog.findViewById(R.id.txt_Howtouseindetail);


//        txtNameDetail.setText(p.getProductName());
//        txtPriceDetail.setText(p.getProductPrice());
//        txtDescript.setText(p.getProductDetailDescript());
//        txtFunction.setText(p.getProductDetailFunction());
//        txtHowtouse.setText(p.getProductDetailH2U());
//        imgHinh.setImageResource(p.getImgProduct());
//    }


    private void linkViews() {
        backProducttoAccount = findViewById(R.id.backPtoAccount);
    }
}
