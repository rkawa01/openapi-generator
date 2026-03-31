package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
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
 * A pet dog
 * @param petType 
 * @param packSize the size of the pack the dog is from
 * @param name 
 */
data class Dog(

    @field:Valid
    @get:JsonProperty("petType", required = true) override val petType: kotlin.Any?,

    @get:Min(value=0)
    @get:JsonProperty("packSize", required = true) val packSize: kotlin.Int = 0
) : Pet {

}

