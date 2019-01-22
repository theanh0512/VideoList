package pham.honestbee.videolist.api

import io.reactivex.Observable
import pham.honestbee.videolist.vo.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Pham on 26/8/2018.
 */
interface VideoService {
    @GET("playlistItems")
    fun getVideos(
            @Query("key") key: String,
            @Query("playlistId") playlistId: String,
            @Query("part") part: String,
            @Query("maxResults") maxResults: Int
    ): Observable<Response>
}