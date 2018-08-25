package pham.honestbee.weatherforecastgojek.forecast

import android.arch.lifecycle.ViewModel
import pham.honestbee.weatherforecastgojek.repository.ForecastRepository
import javax.inject.Inject

/**
 * Created by Pham on 11/2/2018
 */
class MainViewModel @Inject constructor(val forecastRepository: ForecastRepository) : ViewModel() {

}
