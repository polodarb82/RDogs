package com.pdb82.rdogsv.ui.recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pdb82.rdogsv.R
import com.pdb82.rdogsv.data.model.Breeds

class MainRV(
    private val context: Context,
    private val dataset: List<Breeds>
) : RecyclerView.Adapter<MainRV.MainViewHolder>() {

    class MainViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_main_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.main_item, parent, false)
        return MainViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    override fun getItemCount() = dataset.size

}