package com.example.fp.celana

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fp.R
import kotlinx.android.synthetic.main.celana_item.view.*

class CelanaAdapter(val CelanaItemList: List<DataCelana>, val clickListener: (DataCelana) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.celana_item, parent, false)
        return PartViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(CelanaItemList[position],clickListener)
    }
    override fun getItemCount() = CelanaItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(Atasan: DataCelana, clickListener: (DataCelana) -> Unit) {
            itemView.imageView.setImageResource(Atasan.CelanaPhoto)
            itemView.nama_celana.text = Atasan.CelanaNama.toString()
            itemView.hargaCelana.text = Atasan.CelanaHarga.toString()
            itemView.setOnClickListener{ clickListener(Atasan)}
        }
    }
}
