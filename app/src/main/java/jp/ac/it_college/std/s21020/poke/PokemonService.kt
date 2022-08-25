package jp.ac.it_college.std.s21020.poke

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonService {
     @GET("pokemon/{id}/")
     fun fetchPokemon(@Path("id") id: Int): Call<PokemonInfo>
}