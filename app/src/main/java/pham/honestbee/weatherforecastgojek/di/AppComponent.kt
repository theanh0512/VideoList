package pham.honestbee.weatherforecastgojek.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import pham.honestbee.weatherforecastgojek.WeatherForecastGoJekApplication
import pham.honestbee.weatherforecastgojek.repository.ForecastRepository
import javax.inject.Singleton

/**
 * Created by Pham on 25/8/2018.
 */

/**
 *[AndroidSupportInjectionModule]
 *is the module from Dagger.Android that helps with the generation
 *and location of sub-components.
 * */
@Singleton
@Component(modules = [ApplicationModule::class, ActivityBindingModule::class, AndroidSupportInjectionModule::class])
interface AppComponent : AndroidInjector<WeatherForecastGoJekApplication> {

    val forecastRepository: ForecastRepository

    // Syntactic sugar to do DaggerAppComponent.builder().application(this).build().inject(this);
    // never having to instantiate any modules or say which module we are passing the application to.
    // Application will just be provided into our app graph now.
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent
    }
}