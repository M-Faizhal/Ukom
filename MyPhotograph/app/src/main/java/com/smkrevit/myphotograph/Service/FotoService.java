package com.smkrevit.myphotograph.Service;

import com.smkrevit.myphotograph.Model.ModelPhotograph;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface FotoService {
    @GET("api/toko")
    Call<List<ModelPhotograph>> getData();

    @POST("api/toko")
    Call<ModelPhotograph> setData(@Body ModelPhotograph photograph);

    @DELETE("api/toko/{id}")
    Call<ModelPhotograph> deleteData(@Path("id") String id);

    @PUT("api/toko/{id}")
    Call<ModelPhotograph> updateData(@Path("id") String id, @Body ModelPhotograph photograph);
}
