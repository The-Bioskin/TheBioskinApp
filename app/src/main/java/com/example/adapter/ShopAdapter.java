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

import com.example.models.Product;
import com.example.models.Shop;
import com.example.thebioskin.R;

import java.util.ArrayList;

public class ShopAdapter extends ArrayAdapter {
    Activity context;
    int resource;

    public ShopAdapter(@NonNull Context context, int resource) {
        super(context, resource);
        this.context = (Activity) context;
        this.resource = resource;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View shopView = this.context.getLayoutInflater().inflate(this.resource,null);
        TextView txtShopName = shopView.findViewById(R.id.txtLocationStore);
        TextView txtShopLocation = shopView.findViewById(R.id.txtDetailStore);
        TextView txtShopTime = shopView.findViewById(R.id.txtTime);
        TextView txtShopPhone = shopView.findViewById(R.id.txtPhone);
        ImageView imvShop = shopView.findViewById(R.id.imvLocation);

        Shop s = (Shop) getItem(position);
        imvShop.setImageResource(s.getImgShop());
        txtShopName.setText(s.getShopName());
        txtShopLocation.setText(s.getShopLocation());
        txtShopTime.setText(s.getShopTime());
        txtShopPhone.setText(s.getShopPhone());

        return shopView;
    }
}
