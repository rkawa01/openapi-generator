package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * 
 * @param discriminator 
 * @param anotherDiscriminator 
 * @param propertyB 
 * @param sameNameProperty 
 */
data class Robobird(

    @get:JsonProperty("discriminator", required = true) override val discriminator: kotlin.String,

    @get:JsonProperty("another_discriminator", required = true) override val anotherDiscriminator: kotlin.String,

    @get:JsonProperty("propertyB") val propertyB: kotlin.String? = null,

    @get:JsonProperty("sameNameProperty") val sameNameProperty: kotlin.String? = null
) : Animal, AnotherAnimal {

}

