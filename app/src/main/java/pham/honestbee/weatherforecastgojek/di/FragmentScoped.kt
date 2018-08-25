package pham.honestbee.weatherforecastgojek.di

import javax.inject.Scope

/**
 * Created by Pham on 25/8/2018.
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
annotation class FragmentScoped