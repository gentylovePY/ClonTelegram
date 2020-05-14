package com.example.clontelegram.ui.fragments

import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.clontelegram.R
import kotlinx.android.synthetic.main.fragment_enter_code.*

/**
 * A simple [Fragment] subclass.
 */
class EnterCodeFragment : Fragment(R.layout.fragment_enter_code) {

    override fun onStart() {
        super.onStart()
        register_input_code.addTextChangedListener(object :TextWatcher{
            override fun afterTextChanged(s: Editable?) {
               val string = register_input_code.text.toString()
                if (string.length==6){
                    verificateCode()
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
        })
    }

    fun verificateCode(){
        Toast.makeText(activity,"OK",Toast.LENGTH_SHORT).show()
    }


}
