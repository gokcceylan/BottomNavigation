package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //dinamik geçiş için fragman sınıfından bir nesne oluşturmalıyız
    private lateinit var tempFragment:Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.fragment_tutucu, FragmentBirinci()).commit()

        bottom_nav.setOnNavigationItemSelectedListener { menuItem ->
            if(menuItem.itemId == R.id.action_bir){
                tempFragment = FragmentBirinci()
            }
            if(menuItem.itemId == R.id.action_iki){
                tempFragment = FragmentIkinci()
            }

            //supportFragmentManager.beginTransaction().add(R.id.fragment_tutucu, tempFragment).commit()
            //bu kod hatalı - üst üste biner
            supportFragmentManager.beginTransaction().replace(R.id.fragment_tutucu, tempFragment).commit()

            true
        }
    }

}