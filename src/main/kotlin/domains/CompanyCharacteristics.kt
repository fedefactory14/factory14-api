package com.factory14.domains

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable
import org.json.JSONObject

@Serializable
data class CompanyCharacteristics(
    @JsonProperty("category")
    private val category:CategoryEnum
    ) {
    fun toJson(): JSONObject =
        JSONObject()
            .put("category", category)
}

enum class CategoryEnum{
    HOME_AND_KITCHEN,
    HOME_IMPROVEMENT
}