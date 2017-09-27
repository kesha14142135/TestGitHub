package com.klg.testgithub.data.api;

import com.klg.testgithub.data.api.model.OrganisationResponce;
import com.klg.testgithub.data.api.model.Repository;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface DataApi {

    @GET("search/users")
    Flowable<OrganisationResponce> getOrganisations(@Query(value = "q", encoded = true) String searchTerms, @Query("page") int page);

    @GET("users/{organisation}/repos")
    Flowable<List<Repository>> getRepositoties(@Path("organisation") String organisation);
}
