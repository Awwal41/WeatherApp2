package bgtap.babbangona.weatherapp2.models

import java.io.Serializable

data class Wind(
    val speed: Double,
    val deg: Int
) : Serializable