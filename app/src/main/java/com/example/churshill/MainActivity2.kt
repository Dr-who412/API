package com.example.churshill

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity2 : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val url="https://android-training.appssquare.com/api/"
        val retrofit=Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val Api:API=retrofit.create(API::class.java)
        val call=Api.getData()
        val item=call.enqueue(object :Callback<data>{
            override fun onResponse(call: Call<data>, response: Response<data>) {
                var datax: ArrayList<Items_data> = response.body()?.datalt!!
                var recycler :RecyclerView= findViewById(R.id.recyclerView)
                recycler.layoutManager= GridLayoutManager(this@MainActivity2,2)
                recycler.adapter=CustomAdapter(datax,this@MainActivity2)
            }

            override fun onFailure(call: Call<data>, t: Throwable) {
                Toast(" can't connect to server",this@MainActivity2)
            }

        })

    }
    fun ritdata(){

    }
}