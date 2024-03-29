package com.example.rick_and_morty.data.remote.dto

import com.example.rick_and_morty.domain.models.Character
import com.example.rick_and_morty.domain.models.ResultById

data class ResultDto(
    val created: String?,
    val episode: List<String>?,
    val gender: String?,
    val id: Int?,
    val image: String?,
    val location: LocationDto?,
    val name: String?,
    val origin: OriginDto?,
    val species: String?,
    val status: String?,
    val type: String?,
    val url: String?
) {
    fun toResult(): Character {
        return Character(
            id = id,
            image = image,
            location = location?.toLocation(),
            name = name,
            species = species,
            status = status,
            origin = origin?.toOrigin()
        )
    }

    fun toResultById(): ResultById {
        return ResultById(
            id = id,
            image = image,
            name = name,
            species = species,
            status = status,
            gender = gender,
            origin = origin?.toOrigin(),
            location = location?.toLocation(),
            type = type,
            episode = episode,
        )
    }

}