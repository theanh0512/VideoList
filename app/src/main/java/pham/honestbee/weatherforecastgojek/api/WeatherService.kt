package pham.honestbee.weatherforecastgojek.api

import io.reactivex.Observable
import pham.honestbee.weatherforecastgojek.vo.Weather
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Pham on 26/8/2018.
 */
interface WeatherService {
    @GET("forecast.json")
    fun getWeather(
            @Query("key") key: String,
            @Query("q") city: String,
            @Query("days") days: String
    ): Observable<Weather>
}