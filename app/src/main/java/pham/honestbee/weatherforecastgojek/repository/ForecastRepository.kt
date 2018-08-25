package pham.honestbee.weatherforecastgojek.repository

import android.content.Context
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Pham on 25/8/2018.
 */
@Singleton
class ForecastRepository @Inject constructor(val context: Context) {


    companion object {
        private val TAG = "WeatherForecast"
    }
}