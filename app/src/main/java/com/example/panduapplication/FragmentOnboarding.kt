package com.example.panduapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class FragmentOnboarding : Fragment(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val btnLogin: Button = findViewById(R.id.btn_next)
//        btnLogin.setOnClickListener(this)

    }

//    private fun findViewById(btnNext: Int): Button {
//
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_onboarding, container, false)
    }

    override fun onClick(v: View?) {
//        when (v.id){
//            R.id.btn_next -> {
//                val intent = Intent(this@LoginActivity, MainActivity::class.java)
//                startActivity(intent)
//
//            }
//        }
    }


}