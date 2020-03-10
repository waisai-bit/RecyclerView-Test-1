package com.example.nike_recyclerview.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nike_recyclerview.Model.Boot
import com.example.nike_recyclerview.R
import kotlinx.android.synthetic.main.item_boot.view.*

class BootAdapter(var bootlist: ArrayList<Boot>):
    RecyclerView.Adapter<BootAdapter.BootViewHolder>() {
    inner class BootViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        //create obj
        fun bindBoot(boot: Boot){
            itemView.txtId.text=boot.id
            itemView.txtModelName.text = boot.modelname
            itemView.txtCategory.text = boot.category
            itemView.txtPrice.text = boot.price

            itemView.Image.setImageResource(boot.Img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BootViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.item_boot,parent,false)
        return BootViewHolder(view)
    }

    override fun getItemCount(): Int {
        return bootlist.size
    }


    override fun onBindViewHolder(holder: BootViewHolder, position: Int) {
        holder.bindBoot(bootlist[position])
    }

}
