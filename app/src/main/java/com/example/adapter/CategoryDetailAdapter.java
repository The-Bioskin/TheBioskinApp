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

import com.example.models.Category;
import com.example.models.MyVoucher;
import com.example.thebioskin.R;

public class CategoryDetailAdapter extends ArrayAdapter {
    Activity context;
    int resource;

    public CategoryDetailAdapter(@NonNull Context context, int resource) {
        super(context, resource);
        this.context = (Activity) context;
        this.resource = resource;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View categoryView = this.context.getLayoutInflater().inflate(this.resource,null);
        TextView txtNameCategory = categoryView.findViewById(R.id.txtTayTrang);
        TextView txtQuantityCategory = categoryView.findViewById(R.id.txtAmount1);
        ImageView imvCategory = categoryView.findViewById(R.id.imvTayTrang);

        Category ctd = (Category) getItem(position);
        imvCategory.setImageResource(ctd.getImage());
        txtNameCategory.setText(ctd.getCategoryName());
        txtQuantityCategory.setText(ctd.getCategoryQuantity());

        return categoryView;
    }
}
