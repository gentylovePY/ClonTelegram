package com.example.clontelegram.ui.fragments

import androidx.fragment.app.Fragment
import com.example.clontelegram.MainActivity
import com.example.clontelegram.R
import com.example.clontelegram.activities.RegisterActivity
import com.example.clontelegram.utilits.AUTH
import com.example.clontelegram.utilits.appTextWatcher
import com.example.clontelegram.utilits.replaceActivity
import com.example.clontelegram.utilits.showToast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthProvider
import kotlinx.android.synthetic.main.fragment_enter_code.*

/**
 * A simple [Fragment] subclass.
 */
class EnterCodeFragment(val PhoneNumber: String, val id: String) :
    Fragment(R.layout.fragment_enter_code) {

    private lateinit var mAuth: FirebaseAuth

    override fun onStart() {
        super.onStart()
        (activity as RegisterActivity ).title = PhoneNumber
        register_input_code.addTextChangedListener(appTextWatcher {

            val string = register_input_code.text.toString()
            if (string.length == 6) {
                enterCode()
            }


        })
    }

    private fun enterCode() {
        val code = register_input_code.text.toString()
        val credential = PhoneAuthProvider.getCredential(id,code)
        AUTH.signInWithCredential(credential).addOnCompleteListener{
            if (it.isSuccessful){
                showToast("Добро пожаловать")
                (activity as RegisterActivity).replaceActivity(MainActivity())
            }
            else showToast(it.exception?.message.toString())
        }
    }


}
