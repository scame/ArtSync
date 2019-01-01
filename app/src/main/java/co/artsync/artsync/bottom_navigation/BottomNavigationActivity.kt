package co.artsync.artsync.bottom_navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import co.artsync.artsync.R
import dagger.android.AndroidInjection

class BottomNavigationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
