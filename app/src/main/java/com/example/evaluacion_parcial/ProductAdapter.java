package com.example.evaluacion_parcial;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ProductAdapter extends BaseAdapter {
    private Context context;
    private List<Product> productList;

    public ProductAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
    }

    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Object getItem(int position) {
        return productList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.product_item, parent, false);
        }

        TextView title = convertView.findViewById(R.id.productTitle);
        TextView price = convertView.findViewById(R.id.productPrice);
        ImageView image = convertView.findViewById(R.id.productImage);

        Product product = productList.get(position);

        title.setText(product.getTitle());
        price.setText("$" + product.getPrice());
        Glide.with(this.context).load(product.getImage()).into(image);

        return convertView;
    }
}
