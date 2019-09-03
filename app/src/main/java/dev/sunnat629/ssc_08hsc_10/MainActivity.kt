package dev.sunnat629.ssc_08hsc_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.sunnat629.ssc_08hsc_10.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

}
