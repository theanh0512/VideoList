package pham.honestbee.weatherforecastgojek.vo

import com.google.gson.annotations.SerializedName

/**
 * Created by Pham on 26/8/2018.
 */

class Location {

    @SerializedName("name")
    var name: String? = null
    @SerializedName("region")
    var region: String? = null

}
