package pham.honestbee.videolist.vo

import com.google.gson.annotations.SerializedName


/**
 * Created by Allen on 2019-01-22.
 */

class Response {
    @SerializedName("items")
    var videos: List<Video>? = null
}