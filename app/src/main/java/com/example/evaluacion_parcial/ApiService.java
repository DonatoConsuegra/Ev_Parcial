package com.example.evaluacion_parcial;

import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface ApiService {
        @GET("products")
        Call<List<Product>> getProducts();
    }
