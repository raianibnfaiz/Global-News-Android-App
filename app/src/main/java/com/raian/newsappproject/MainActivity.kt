package com.raian.newsappproject

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.PeriodicWorkRequest
import androidx.work.WorkManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.raian.newsappproject.databinding.ActivityMainBinding
import com.raian.newsappproject.fragment.BookmarkFragment
import com.raian.newsappproject.fragment.HomeFragment
import com.raian.newsappproject.worker.FetchingDataWorker
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setPeriodicWorkRequest()
        val navView: BottomNavigationView = binding.navView
        navController = findNavController(R.id.nav_host_fragment_activity_main)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment2, R.id.bookmarkFragment2
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
    private fun setPeriodicWorkRequest() {
        val workManager = WorkManager.getInstance(applicationContext)
        val dataLoad =
            PeriodicWorkRequest
                .Builder(FetchingDataWorker::class.java, 300, TimeUnit.MINUTES)
                .setInitialDelay(1, TimeUnit.MINUTES)
                .addTag("apiCall")
                .build()
        workManager.enqueueUniquePeriodicWork(
            "apiCall",
            ExistingPeriodicWorkPolicy.REPLACE,
            dataLoad
        )
    }

}