package com.example.clontelegram.utilits

import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.clontelegram.R
import com.example.clontelegram.ui.fragments.ChatsFragment

fun Fragment.showToast(messenge: String){
    Toast.makeText(this.context,messenge,Toast.LENGTH_SHORT).show()
}


fun AppCompatActivity.replaceActivity(activity: AppCompatActivity){
    val intent = Intent(this, activity::class.java)
    startActivity(intent)
}


fun AppCompatActivity.replaceFragmeny(fragment: Fragment,  addStack:Boolean=true) {
    if (addStack) {
        supportFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(
                R.id.dataContainer,
                fragment
            ).commit()
    }else{
        supportFragmentManager.beginTransaction()

            .replace(
                R.id.dataContainer,
                fragment
            ).commit()
    }
}


fun Fragment.replaceFragmeny(fragment: Fragment){
    fragmentManager?.beginTransaction()
        ?.addToBackStack(null)
        ?.replace(
            R.id.dataContainer,
            fragment
        )?.commit()
}