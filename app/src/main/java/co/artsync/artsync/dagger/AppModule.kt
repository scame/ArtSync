package co.artsync.artsync.dagger

import co.artsync.artsync.bottom_navigation.BottomNavigationActivity
import co.artsync.artsync.bottom_navigation.dagger.BottomNavigationActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Module(includes = [AndroidSupportInjectionModule::class])
interface AppModule {

    @FeatureScope
    @ContributesAndroidInjector(modules = [BottomNavigationActivityModule::class])
    fun bottomNavigationActivityInjector(): BottomNavigationActivity
}