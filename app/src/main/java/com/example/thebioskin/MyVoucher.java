package com.example.thebioskin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.adapter.MyVoucherAdapter;

import java.util.ArrayList;

public class MyVoucher extends AppCompatActivity {
    ImageView backtoAccount;
    ListView lvVoucher;
    MyVoucherAdapter myVoucherAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_voucher);

        linkViews();
        addViews();
        addEvents();

    }

    private void addViews() {
        lvVoucher = findViewById(R.id.lvMyVoucher);
        myVoucherAdapter = new MyVoucherAdapter(MyVoucher.this, R.layout.item_myvoucher);
        myVoucherAdapter.add(new com.example.models.MyVoucher(R.drawable.discount_logo,"Giảm ngay 50.000đ cho người mới","Đơn hàng tối thiểu 299K","Dùng ngay"));
        myVoucherAdapter.add(new com.example.models.MyVoucher(R.drawable.discount_logo,"Giảm ngay 40.000đ cho người mới","Đơn hàng tối thiểu 199K","Dùng ngay"));
        myVoucherAdapter.add(new com.example.models.MyVoucher(R.drawable.discount_logo,"Giảm ngay 30.000đ cho người mới","Đơn hàng tối thiểu 499K","Dùng ngay"));
        myVoucherAdapter.add(new com.example.models.MyVoucher(R.drawable.discount_logo,"Giảm ngay 20.000đ cho người mới","Đơn hàng tối thiểu 399K","Dùng ngay"));
        myVoucherAdapter.add(new com.example.models.MyVoucher(R.drawable.discount_logo,"Giảm ngay 10.000đ cho người mới","Đơn hàng tối thiểu 199K","Dùng ngay"));
        lvVoucher.setAdapter(myVoucherAdapter);
    }



    private void linkViews() {
//        lvVoucher = findViewById(R.id.lvMyVoucher);
        backtoAccount = findViewById(R.id.imvBackToAccount);
    }

    private void addEvents() {
        backtoAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyVoucher.this, Account.class);
                startActivity(intent);
            }
        });
    }
}