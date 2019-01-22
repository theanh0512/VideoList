package pham.honestbee.videolist.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import pham.honestbee.videolist.videos.MainActivity

/**
 * Created by Pham on 25/8/2018.
 */
@Module
abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity
}