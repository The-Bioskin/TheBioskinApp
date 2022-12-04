package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.models.MyVoucher;
import com.example.thebioskin.R;

import java.util.ArrayList;
import java.util.List;

public class MyVoucherAdapter extends ArrayAdapter {
    Activity context;
    int resource;

    public MyVoucherAdapter(@NonNull Context context, int resource) {
        super(context, resource);
        this.context = (Activity) context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View customView = this.context.getLayoutInflater().inflate(this.resource,null);
        TextView txtName = customView.findViewById(R.id.txtVoucherName);
        TextView txtValue = customView.findViewById(R.id.txtVoucherValue);
        TextView txtUseVoucher = customView.findViewById(R.id.txtUseVoucher);
        ImageView imvVoucher = customView.findViewById(R.id.imvDiscount);

        MyVoucher vc = (MyVoucher) getItem(position);
        imvVoucher.setImageResource(vc.getThumb());
        txtName.setText(vc.getVoucherName());
        txtValue.setText(vc.getVoucherValue());
        txtUseVoucher.setText(vc.getUseVoucher());

        return customView;
    }

}
