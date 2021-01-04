package com.example.fp.hoodie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fp.R
import kotlinx.android.synthetic.main.hoodie_item.view.*

class HoodieAdapter(val HoodieItemList: List<DataHoodie>, val clickListener: (DataHoodie) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.hoodie_item, parent, false)
        return PartViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(HoodieItemList[position],clickListener)
    }
    override fun getItemCount() = HoodieItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(Hoodie: DataHoodie, clickListener: (DataHoodie) -> Unit) {
            itemView.imageView2.setImageResource(Hoodie.HoodiePhoto)
            itemView.nama_hoodie.text = Hoodie.HoodieNama.toString()
            itemView.hargaHoodie.text = Hoodie.HoodieHarga.toString()
            itemView.setOnClickListener{ clickListener(Hoodie)}
        }
    }
}
