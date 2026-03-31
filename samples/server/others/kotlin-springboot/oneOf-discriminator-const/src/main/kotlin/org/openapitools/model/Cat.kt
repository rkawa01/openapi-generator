package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * A pet cat
 * @param huntingSkill The measured skill for hunting
 * @param petType 
 * @param name 
 */
data class Cat(

    @get:JsonProperty("huntingSkill", required = true) val huntingSkill: Cat.HuntingSkill,

    @field:Valid
    @get:JsonProperty("petType") override val petType: kotlin.Any? = null
) : Pet {

    /**
    * The measured skill for hunting
    * Values: clueless,lazy,adventurous,aggressive
    */
    enum class HuntingSkill(@get:JsonValue val value: kotlin.String) {

        clueless("clueless"),
        lazy("lazy"),
        adventurous("adventurous"),
        aggressive("aggressive");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): HuntingSkill {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Cat'")
            }
        }
    }

}

