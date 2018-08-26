package pham.honestbee.weatherforecastgojek.vo

import com.google.gson.annotations.SerializedName

/**
 * Created by Pham on 26/8/2018.
 */

class Forecast {

    @SerializedName("forecastday")
    var forecastdays: List<Forecastday>? = null
}
