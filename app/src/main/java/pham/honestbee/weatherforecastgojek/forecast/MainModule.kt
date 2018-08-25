package pham.honestbee.weatherforecastgojek.forecast

import dagger.Module
import dagger.android.ContributesAndroidInjector
import pham.honestbee.weatherforecastgojek.di.FragmentScoped

/**
 * Created by Pham on 25/8/2018.
 */
@Module
abstract class MainModule {
    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun mainFragment(): MainFragment
}