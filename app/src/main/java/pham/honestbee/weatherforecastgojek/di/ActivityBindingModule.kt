package pham.honestbee.weatherforecastgojek.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import pham.honestbee.weatherforecastgojek.forecast.MainModule
import pham.honestbee.weatherforecastgojek.forecast.MainActivity

/**
 * Created by Pham on 25/8/2018.
 */
@Module
abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = arrayOf(MainModule::class))
    abstract fun mainActivity(): MainActivity
}