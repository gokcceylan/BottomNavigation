package com.example.bottomnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_birinci.view.*
import kotlinx.android.synthetic.main.fragment_ikinci.view.*

class FragmentIkinci : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val tasarim = inflater.inflate(R.layout.fragment_ikinci, container, false)
        //false çünkü yeni tasarım eklemeyeceğiz
        tasarim.buttonIki.setOnClickListener {
            Snackbar.make(tasarim.buttonIki, "Button iki tıklandı", Snackbar.LENGTH_SHORT).show()
        }

        return tasarim
    }
}