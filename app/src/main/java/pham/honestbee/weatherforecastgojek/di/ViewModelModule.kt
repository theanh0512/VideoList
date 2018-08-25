package pham.honestbee.weatherforecastgojek.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import pham.honestbee.weatherforecastgojek.forecast.MainViewModel
import pham.honestbee.weatherforecastgojek.viewmodel.WeatherForecastViewModelFactory

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    internal abstract fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel

    @Binds
    internal abstract fun bindViewModelFactory(factory: WeatherForecastViewModelFactory): ViewModelProvider.Factory
}
