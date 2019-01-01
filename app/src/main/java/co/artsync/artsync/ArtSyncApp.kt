package co.artsync.artsync

import android.app.Activity
import android.app.Application
import co.artsync.artsync.dagger.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class ArtSyncApp: Application(), HasActivityInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        injectDependencies()
    }

    private fun injectDependencies() {
        DaggerAppComponent
            .builder()
            .context(this)
            .build()
            .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector
}