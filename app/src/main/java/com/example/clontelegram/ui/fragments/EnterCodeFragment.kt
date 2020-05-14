package com.example.clontelegram.ui.fragments

import androidx.fragment.app.Fragment
import com.example.clontelegram.R
import com.example.clontelegram.utilits.appTextWatcher
import com.example.clontelegram.utilits.showToast
import kotlinx.android.synthetic.main.fragment_enter_code.*

/**
 * A simple [Fragment] subclass.
 */
class EnterCodeFragment : Fragment(R.layout.fragment_enter_code) {

    override fun onStart() {
        super.onStart()
        register_input_code.addTextChangedListener(appTextWatcher {

            val string = register_input_code.text.toString()
            if (string.length == 6) {
                verificateCode()
            }


        })
    }

    fun verificateCode() {
      showToast("ок")
    }


}
