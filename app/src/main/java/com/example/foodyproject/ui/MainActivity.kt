package com.example.foodyproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.foodyproject.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController

        var appBarConfiguration:AppBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.recipeFragment,
                R.id.favoriteFragment,
                R.id.jokesFragment
            )
        )

        val bottomNavigationView:BottomNavigationView = findViewById(R.id.bottomNavigationView)

        bottomNavigationView.setupWithNavController(navController)

        setupActionBarWithNavController(navController, appBarConfiguration)
    }
}