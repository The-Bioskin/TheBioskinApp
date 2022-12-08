package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.models.HotProduct;
import com.example.models.Product;
import com.example.thebioskin.R;

import java.util.List;

public class HotProductAdapter extends RecyclerView.Adapter<HotProductAdapter.ViewHolder> {

    Context context;
    List<HotProduct> hotProductItems;
    private ViewHolder.OnHotProductListener mOnHotProductListener;

    public HotProductAdapter(Context context, List<HotProduct> hotProductItems, ViewHolder.OnHotProductListener onHotProductListener) {
        this.context = context;
        this.hotProductItems = hotProductItems;
        this.mOnHotProductListener = onHotProductListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.related_products_item, parent, false);
        return new ViewHolder(view, mOnHotProductListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HotProduct hp = hotProductItems.get(position);
        holder.imgHotProduct.setImageResource(hp.getImage());
        holder.txtPrice.setText(hp.getHotProductPrice());
        holder.txtName.setText(hp.getHotProductName());
        holder.txtRate.setText(hp.getHotProductRating());
        holder.txtRateNum.setText(hp.getHotProductRateNum());
    }

    @Override
    public int getItemCount() {
        return hotProductItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgHotProduct;
        TextView txtPrice, txtName, txtRate, txtRateNum;
        OnHotProductListener onHotProductListener;


        public ViewHolder(@NonNull View itemView, OnHotProductListener onHotProductListener) {
            super(itemView);
            imgHotProduct = itemView.findViewById(R.id.imv_Image);
            txtPrice = itemView.findViewById(R.id.txt_Price);
            txtName = itemView.findViewById(R.id.txt_Name);
            txtRate = itemView.findViewById(R.id.txt_Rating);
            txtRateNum = itemView.findViewById(R.id.txt_NumberofRating);

            this.onHotProductListener = onHotProductListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onHotProductListener.OnHotProductClick(getAdapterPosition());
        }


        public interface OnHotProductListener {
            void OnHotProductClick(int position);
        }
    }
}
