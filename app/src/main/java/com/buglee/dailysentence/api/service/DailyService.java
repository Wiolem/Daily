package com.buglee.dailysentence.api.service;

import com.buglee.dailysentence.api.entity.Sentence;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by LEE on 2017/7/18 0018.
 */

public interface DailyService {

    @GET("dsapi/")
    Observable<Sentence> getSentence(@Query("date") String date);
}
