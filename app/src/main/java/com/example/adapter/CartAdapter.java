package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.models.CartProduct;
import com.example.thebioskin.R;

import java.util.ArrayList;

public class CartAdapter extends BaseAdapter {

    Context context;
    int cart_product_item_layout;
    ArrayList<CartProduct> products;

    public CartAdapter(Context context, int cart_product_item_layout, ArrayList<CartProduct> products) {
        this.context = context;
        this.cart_product_item_layout = cart_product_item_layout;
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private static class viewHolder {
        ImageView imvThumb;
        TextView txtName, txtPrice, txtNumberProduct;
        ImageButton btnAdd, btnMinus;
    }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            viewHolder holder = null;
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if(view==null)
            {
                holder = new viewHolder();
                view=inflater.inflate(cart_product_item_layout,null);

                holder.imvThumb = view.findViewById(R.id.img_productcart);
                holder.txtName = view.findViewById(R.id.txtProductCartName);
                holder.txtPrice = view.findViewById(R.id.txtPeoductCardPrice);
                holder.txtNumberProduct = view.findViewById(R.id.cart_num);

                holder.btnAdd = view.findViewById(R.id.btn_add);
                holder.btnMinus = view.findViewById(R.id.btn_minus);

                view.setTag(holder);
            }
            else{
                holder = (viewHolder) view.getTag();
            }
            CartProduct product = products.get(i);
            holder.imvThumb.setImageResource(products.get(i).getProductThumb());
            holder.txtName.setText(products.get(i).getProductName());
            holder.txtPrice.setText(String.valueOf(products.get(i).getProductPrice()));
            holder.txtNumberProduct.setText(String.valueOf(products.get(i).getProductNumber()));

            viewHolder finalHolder = holder;
            holder.btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int sl = Integer.parseInt((finalHolder.txtNumberProduct).getText().toString());
                    if(sl>1 || sl==1)
                    {
                        sl = sl + 1;
                        finalHolder.txtNumberProduct.setText(String.valueOf(sl));;
                    }
                }
            });

            holder.btnMinus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int sl = Integer.parseInt((finalHolder.txtNumberProduct).getText().toString());
                    if(sl>1)
                    {
                        sl = sl -1;
                        finalHolder.txtNumberProduct.setText(String.valueOf(sl));;
                    }
                }
            });

            return view;
        }

}

