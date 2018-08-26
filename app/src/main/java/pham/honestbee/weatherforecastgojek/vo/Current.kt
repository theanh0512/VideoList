package pham.honestbee.weatherforecastgojek.vo

import com.google.gson.annotations.SerializedName

/**
 * Created by Pham on 26/8/2018.
 */

class Current {

    @SerializedName("last_updated_epoch")
    var lastUpdatedEpoch: Long? = null
    @SerializedName("temp_c")
    var temperature: Float? = null
    @SerializedName("condition")
    var condition: Condition? = null
    @SerializedName("humidity")
    var humidity: Int? = null
    @SerializedName("feelslike_c")
    var feelslike: Float? = null

    val temperatureDisplay: String
        get() = String.format("Temperatura actual: %sCº (sensación de %sCº)", temperature, feelslike)
}
