package pham.honestbee.weatherforecastgojek.vo

import com.google.gson.annotations.SerializedName

/**
 * Created by Pham on 26/8/2018.
 */
class Weather {

    @SerializedName("location")
    var location: Location? = null
    @SerializedName("current")
    var current: Current? = null
    @SerializedName("forecast")
    var forecast: Forecast? = null
}
