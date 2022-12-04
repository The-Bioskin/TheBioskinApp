package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.models.MyVoucher;
import com.example.models.Product;
import com.example.thebioskin.R;

public class ProductAdapter extends ArrayAdapter {
    Activity context;
    int resource;
    public ProductAdapter(@NonNull Context context, int resource) {
        super(context, resource);
        this.context = (Activity) context;
        this.resource = resource;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View productView = this.context.getLayoutInflater().inflate(this.resource,null);
        TextView txtProductName = productView.findViewById(R.id.txtProductName);
        TextView txtProductPrice = productView.findViewById(R.id.txtProductPrice);
        TextView txtProductRating = productView.findViewById(R.id.txtRating);
        TextView txtProductRatingNum = productView.findViewById(R.id.txtUseVoucher);
        ImageView imvProduct = productView.findViewById(R.id.imvProduct);

        Product p = (Product) getItem(position);
        imvProduct.setImageResource(p.getImgProduct());
        txtProductName.setText(p.getProductName());
        txtProductPrice.setText(p.getProductPrice());
        txtProductRating.setText(p.getProductRating());
        txtProductRatingNum.setText(p.getProductRataNum());

        return productView;
    }
}
