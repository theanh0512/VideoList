package pham.honestbee.videolist

import android.databinding.DataBindingUtil
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import pham.honestbee.videolist.binding.AppDataBindingComponent
import pham.honestbee.videolist.di.DaggerAppComponent

/**
 * Created by Pham on 25/8/2018.
 */
class VideoListApplication : DaggerApplication() {
    override fun onCreate() {
        super.onCreate()
        DataBindingUtil.setDefaultComponent(AppDataBindingComponent())
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }
}
