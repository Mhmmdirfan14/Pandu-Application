package com.example.panduapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_Navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener {item ->
            var selectedFragment: Fragment? = null

            when (item.itemId) {
                R.id.nav_beranda -> selectedFragment = FragmentBeranda()
                R.id.nav_layanan -> selectedFragment = FragmentLayanan()
                R.id.nav_forum -> selectedFragment = FragmentForum()
                R.id.nav_akun -> selectedFragment = FragmentAkun()
            }

            if (selectedFragment != null) {
                val fragmentManager: FragmentManager = supportFragmentManager
                fragmentManager.beginTransaction()
                    .replace(R.id.container_fragment, selectedFragment)
                    .commit()
            }

            true
        }
    }
}