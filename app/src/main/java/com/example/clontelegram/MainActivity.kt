package com.example.clontelegram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.clontelegram.activities.RegisterActivity
import com.example.clontelegram.databinding.ActivityMainBinding
import com.example.clontelegram.ui.fragments.ChatsFragment
import com.example.clontelegram.ui.objects.AppDrawer
import com.example.clontelegram.utilits.AUTH
import com.example.clontelegram.utilits.replaceActivity
import com.example.clontelegram.utilits.replaceFragmeny
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mAppDrawer: AppDrawer
    private lateinit var mToolbar: Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        initFields()
        initFinc()

    }

    private fun initFinc() {
        if (AUTH.currentUser!=null) {
            setSupportActionBar(mToolbar)
            mAppDrawer.create()
            replaceFragmeny(ChatsFragment(),false)
        }else{
            replaceActivity(RegisterActivity())

        }
    }


    private fun initFields() {
        mToolbar = mBinding.mainToolbar
        mAppDrawer = AppDrawer(this, mToolbar)
        AUTH = FirebaseAuth.getInstance()
    }


}

