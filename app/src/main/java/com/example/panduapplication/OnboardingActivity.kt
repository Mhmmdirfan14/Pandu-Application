package com.example.panduapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class OnboardingActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val btnSKip: Button = findViewById(R.id.btn_skip)
        btnSKip.setOnClickListener(this)

        val btnNext: Button = findViewById(R.id.btn_next)
        btnNext.setOnClickListener(this)
    }


    override fun onClick(v: View) {
        when (v.id){

            R.id.btn_next -> {
                val intent = Intent (this@OnboardingActivity, FragmentOnboarding::class.java)
                startActivity(intent)
            }

            R.id.btn_skip -> {
                val intent = Intent (this@OnboardingActivity, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }

}