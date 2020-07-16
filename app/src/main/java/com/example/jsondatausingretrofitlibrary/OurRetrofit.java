package com.example.jsondatausingretrofitlibrary;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface OurRetrofit {

      @GET("832ee82a741d2ef9995d")
    Call<List<OurDataSet>> getDataSet();

}
