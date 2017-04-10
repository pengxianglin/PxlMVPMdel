package com.example.pengxl.pxlmvpmdel.base.http;


import com.example.pengxl.pxlmvpmdel.mvp.model.entity.Test;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by pengxl on 2017-2-15.
 */
public interface HttpApiService {

    @GET("top250")
    Observable<HttpResult<List<Test>>> getTopMovie(@Query("start") int start, @Query("count") int count);
}
