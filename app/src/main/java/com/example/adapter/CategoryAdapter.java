package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.models.Category;
import com.example.models.HotProduct;
import com.example.thebioskin.R;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    Context context;
    List<Category> categoryItems;
    private ViewHolder.OnCategoryListener mOnCategoryListener;

    public CategoryAdapter(Context context, List<Category> categoryItems, ViewHolder.OnCategoryListener onCategoryListener) {
        this.context = context;
        this.categoryItems = categoryItems;
        this.mOnCategoryListener = onCategoryListener;
    }

    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list_product_homeinterface, parent, false);
        return new CategoryAdapter.ViewHolder(view, mOnCategoryListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Category c = categoryItems.get(position);
        holder.imgCategory.setImageResource(c.getImage());
        holder.txtNameCategory.setText(c.getCategoryName());
        holder.txtQuantityCategory.setText(c.getCategoryQuantity());

    }

    @Override
    public int getItemCount() {
        return categoryItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgCategory;
        TextView txtNameCategory, txtQuantityCategory;
        CategoryAdapter.ViewHolder.OnCategoryListener onCategoryListener;

        public ViewHolder(@NonNull View itemView, CategoryAdapter.ViewHolder.OnCategoryListener onCategoryListener) {
            super(itemView);
            imgCategory = itemView.findViewById(R.id.image_item_category);
            txtNameCategory = itemView.findViewById(R.id.txt_NameofCatogories);
            txtQuantityCategory = itemView.findViewById(R.id.txt_Quantity);

            this.onCategoryListener = onCategoryListener;

            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            onCategoryListener.OnCategoryClick(getAdapterPosition());
        }


        public interface OnCategoryListener {
            void OnCategoryClick(int position);
        }
    }
}
