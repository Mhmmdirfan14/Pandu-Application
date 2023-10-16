package com.example.panduapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class FragmentPengaduan1 : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pengaduan1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ivArrowBack:ImageView = view.findViewById(R.id.ivarrow_back)
        ivArrowBack.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.ivarrow_back){
            val fragmentlayanan = FragmentLayanan()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, fragmentlayanan, FragmentLayanan::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
    }


}