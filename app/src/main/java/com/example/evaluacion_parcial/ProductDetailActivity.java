package com.example.evaluacion_parcial;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ProductDetailActivity extends AppCompatActivity {
    private ImageView productImageView;
    private TextView productTitleTextView;
    private TextView productCategoryTextView;
    private TextView productDescriptionTextView;
    private TextView productPriceTextView;
    private Button payButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        productImageView = findViewById(R.id.productImageView);
        productTitleTextView = findViewById(R.id.productTitleTextView);
        productCategoryTextView = findViewById(R.id.productCategoryTextView);
        productDescriptionTextView = findViewById(R.id.productDescriptionTextView);
        productPriceTextView = findViewById(R.id.productPriceTextView);
        payButton = findViewById(R.id.payButton);

        Product product = (Product) getIntent().getSerializableExtra("product");


        if (product != null) {
            Glide.with(this).load(product.getImage()).into(productImageView);
            productTitleTextView.setText(product.getTitle());
            productCategoryTextView.setText("Category: " + product.getCategory());
            productDescriptionTextView.setText("$" + product.getPrice());
            productPriceTextView.setText(product.getPrice());
        }

        payButton.setOnClickListener(v -> {

        });
    }
}