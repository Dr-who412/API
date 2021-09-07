package com.example.churshill

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import retrofit2.Callback

class CustomAdapter(val product_list:ArrayList<Items_data>, var mainA2:MainActivity2):RecyclerView.Adapter<CustomAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val vv=LayoutInflater.from(parent.context).inflate(R.layout.list_row,parent,false)
        return  ViewHolder(vv)
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        val datak=product_list[position]
        holder.name.text="name:${datak.name}"
        holder.quentity.text="amount:${datak.Quantity}"
        Glide.with(mainA2).load(datak.image).into(holder.img)
    }

    override fun getItemCount(): Int {
      return  product_list.size
    }
    class ViewHolder(itemV:View):RecyclerView.ViewHolder(itemV){
        val name:TextView=itemV.findViewById(R.id.name)
        val quentity:TextView=itemV.findViewById(R.id.textView2)
        val img:ImageView=itemV.findViewById(R.id.item_img)



    }
}