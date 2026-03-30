package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Pet
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
 * A representation of a dog
 * @param packSize the size of the pack the dog is from
 */
data class Dog(

    @get:Min(value=0)
    @get:JsonProperty("packSize", required = true) val packSize: kotlin.Int = 0,

    @get:JsonProperty("name", required = true) override val name: kotlin.String,

    @get:JsonProperty("petType", required = true) override val petType: kotlin.String
) : Pet {

}

