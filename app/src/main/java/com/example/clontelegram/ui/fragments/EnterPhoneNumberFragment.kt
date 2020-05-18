package com.example.clontelegram.ui.fragments

import androidx.fragment.app.Fragment

import com.example.clontelegram.R
import com.example.clontelegram.utilits.replaceFragmeny
import com.example.clontelegram.utilits.showToast
import kotlinx.android.synthetic.main.fragment_enter_phone_number.*


class EnterPhoneNumberFragment : Fragment(R.layout.fragment_enter_phone_number) {

    override fun onStart() {
        super.onStart()
        register_btn_next.setOnClickListener{sendCode()}
    }

    private fun sendCode() {
        if (register_input_phone_number.text.toString().isEmpty()){
           showToast(getString(R.string.register_toast_enter_phone))
        }else{
            replaceFragmeny(EnterCodeFragment())

        }
    }
}
