package com.example.churshill
import android.app.Activity
import android.widget.Toast

class Toast(toasttext:String, context: Activity){
    init {
        Toast.makeText(context, toasttext, Toast.LENGTH_SHORT).show()

    }


}