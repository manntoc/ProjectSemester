package com.example.projectsemester.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projectsemester.R
import com.example.projectsemester.model.Produk

class AdapterProduk( var data : ArrayList<Produk>) : RecyclerView.Adapter<AdapterProduk.Holder>() {

    class Holder(view: View):RecyclerView.ViewHolder(view){
        val nama = view.findViewById<TextView>(R.id.nama)
        val harga = view.findViewById<TextView>(R.id.harga)
        val imgProduk = view.findViewById<ImageView>(R.id.img_produk)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_produk, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.nama.text = data[position].nama
        holder.harga.text = data[position].harga
        holder.imgProduk.setImageResource(data[position].gambar)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    
}