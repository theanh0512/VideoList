package pham.honestbee.weatherforecastgojek.di

import javax.inject.Scope

/**
 * Created by Pham on 25/8/2018.
 */

/**
 * In Dagger, an un-scoped component cannot depend on a scoped component. As
 * [AppComponent] is a scoped component Singleton, we create a custom
 * scope to be used by all fragment components. Additionally, a component with a specific scope
 * cannot have a sub component with the same scope.
 */
@MustBeDocumented
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScoped