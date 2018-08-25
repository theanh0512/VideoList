package pham.honestbee.weatherforecastgojek

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import pham.honestbee.weatherforecastgojek.di.DaggerAppComponent

/**
 * Created by Pham on 25/8/2018.
 */
class WeatherForecastGoJekApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }
}
