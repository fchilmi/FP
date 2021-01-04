package com.example.fp.rok

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fp.R
import kotlinx.android.synthetic.main.rok_item.view.*

class RokAdapter(val RokItemList: List<DataRok>, val clickListener: (DataRok) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.rok_item, parent, false)
        return PartViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(RokItemList[position],clickListener)
    }
    override fun getItemCount() = RokItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(Rok: DataRok, clickListener: (DataRok) -> Unit) {
            itemView.imageView2.setImageResource(Rok.RokPhoto)
            itemView.nama_rok.text = Rok.RokNama.toString()
            itemView.hargaRok.text = Rok.RokHarga.toString()
            itemView.setOnClickListener{ clickListener(Rok)}
        }
    }
}
