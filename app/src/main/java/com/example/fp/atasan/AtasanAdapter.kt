package com.example.fp.atasan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fp.R
import kotlinx.android.synthetic.main.atasan_list_item.view.*

class AtasanAdapter(val AtasanItemList: List<DataAtasan>, val clickListener: (DataAtasan) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.atasan_list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(AtasanItemList[position],clickListener)
    }

    override fun getItemCount() = AtasanItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(Atasan: DataAtasan, clickListener: (DataAtasan) -> Unit) {
            itemView.imageView2.setImageResource(Atasan.AtasanPhoto)
            itemView.nama_atasan.text = Atasan.AtasanNama.toString()
            itemView.hargaAtasan.text = Atasan.AtasanHarga.toString()
            itemView.setOnClickListener{ clickListener(Atasan)}
        }
    }
}
