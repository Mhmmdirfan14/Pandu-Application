package com.example.panduapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class FragmentAdministratif : Fragment(), View.OnClickListener {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_administratif, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvLayanan: TextView = view.findViewById(R.id.tvPengaduan)
        tvLayanan.setOnClickListener(this)

        val btnPermintaan:Button = view.findViewById(R.id.btn_buat_permintaan)
        btnPermintaan.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.tvPengaduan){
            val fragmentlayanan = FragmentLayanan()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, fragmentlayanan, FragmentLayanan::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        if(v?.id == R.id.btn_buat_permintaan){
            val fragmentpermintaan1 = FragmentPermintaan1()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, fragmentpermintaan1, FragmentPermintaan1::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
    }

}