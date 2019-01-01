package co.artsync.artsync.dagger

import android.content.Context
import co.artsync.artsync.ArtSyncApp
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun context(context: Context): Builder
        fun build(): AppComponent
    }

    fun inject(app: ArtSyncApp)
}