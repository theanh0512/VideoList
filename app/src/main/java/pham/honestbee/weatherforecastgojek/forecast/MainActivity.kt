package pham.honestbee.weatherforecastgojek.forecast

import android.databinding.DataBindingUtil
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import pham.honestbee.weatherforecastgojek.R
import pham.honestbee.weatherforecastgojek.databinding.ActivityMainBinding

class MainActivity : DaggerAppCompatActivity() {

    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
}