package com.example.clontelegram.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.clontelegram.R
import com.example.clontelegram.databinding.ActivityRegisterBinding
import com.example.clontelegram.ui.fragments.EnterPhoneNumberFragment
import com.example.clontelegram.utilits.replaceFragmeny

class RegisterActivity : AppCompatActivity() {
    private lateinit var mBinding:ActivityRegisterBinding
    private lateinit var mToolbar:Toolbar
    private lateinit var nTooks:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        mToolbar = mBinding.registerToolbar
        setSupportActionBar(mToolbar)
        title= getString(R.string.register_title_your_phone)
       replaceFragmeny(EnterPhoneNumberFragment(),false)
    }
}
