package jp.ac.it_college.std.s21020.poke

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonInfo(
    val sprites: Sprites
)

@JsonClass(generateAdapter = true)
data class Sprites(
    val other: Other
)

@JsonClass(generateAdapter = true)
data class Other(
    @Json(name = "official-artwork") val officialArtwork: officialArtwork
)

@JsonClass(generateAdapter = true)
data class officialArtwork(
    @Json(name = "front_default") val frontDefault: String
)