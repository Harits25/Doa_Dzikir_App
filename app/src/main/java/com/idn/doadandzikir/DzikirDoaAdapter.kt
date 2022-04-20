package com.idn.doadandzikir

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DzikirDoaAdapter(private val listDzikirDoa: ArrayList<DzikirDoa>) : // Constructor untuk mengatribusirkan data
    RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){
        // initializationView dari Layoutrow_item_dzikir.xml
        val tvDecs: TextView = view.findViewById(R.id.tv_desc)
        val tvLafaz: TextView = view.findViewById(R.id.tv_lafaz)
        val tvTerjemah: TextView = view.findViewById(R.id.tv_terjemah)
    }

    // menapilkan data sesuai dengan posisi layout yang di tentukan
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= MyViewHolder (
        LayoutInflater.from(parent.context).inflate(R.layout.row_item_dzikir_doa, parent, false)
    )

    // mengatribusikan data dengan tampilan
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvDecs.text = listDzikirDoa[position].desc
        holder.tvLafaz.text = listDzikirDoa[position].lafaz
        holder.tvTerjemah.text = listDzikirDoa[position].terjemah
    }

    // menentukan jumlah data yang akan di tampilkan
    override fun getItemCount() = listDzikirDoa.size
    }