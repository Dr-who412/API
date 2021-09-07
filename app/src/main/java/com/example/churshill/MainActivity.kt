package com.example.churshill

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    lateinit var bt_login: Button
    lateinit var email:EditText
    lateinit var pass: EditText
    var users= HashMap<String,String>()

    var t=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        users.put("user","senna412")
        users.put("pass","123456shr")
        bt_login=findViewById(R.id.bt1)
        email=findViewById(R.id.editTextTextEmailAddress)
        pass=findViewById(R.id.editTextTextPassword)
        bt_login.setOnClickListener{

            if ((email.text.toString().isNotEmpty()&&email.text.toString()==users["user"])
                && (pass.text.toString().isNotEmpty() && pass.text.toString()==users["pass"])){
                    Toast("done",this)
                 var intent=Intent(this,MainActivity2::class.java)
                  startActivity(intent)

            }else if(email.text.toString().isEmpty()&&pass.text.toString().isNotEmpty()){

                Toast("enter ur user name ",this)
            }else if(pass.text.toString().isEmpty()&&email.text.toString().isNotEmpty()){

                Toast("enter ur  pass ",this)
            }else if(email.text.toString()!=users["user"]&&pass.text.toString()!=users["pass"]){
                email.text=null
                pass.text= null
                Toast("email & pass  uncorrect"
                    ,this)

            }else if(email.text.toString()==users["user"]&&pass.text.toString()!=users["pass"]){
                email.text=null
                pass.text= null
                Toast(" pass uncorrect"
                    ,this)
            }else{Toast("enter email and pass again",this)}



        }

    }


}