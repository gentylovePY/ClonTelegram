package com.example.clontelegram.utilits

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

lateinit var AUTH:FirebaseAuth

lateinit var REF_DATA_ROOT:DatabaseReference

const val NODE_USERS = "users"

fun initFirebase(){
    AUTH = FirebaseAuth.getInstance()
    REF_DATA_ROOT = FirebaseDatabase.getInstance().reference
}