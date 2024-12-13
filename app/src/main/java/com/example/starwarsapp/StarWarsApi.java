package com.example.starwarsapp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface StarWarsApi {
    @GET("people/")
    Call<StarWarsResponse> getCharacters();
}

