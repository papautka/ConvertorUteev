package com.uteev.convertoruteev.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uteev.convertoruteev.R
import com.uteev.convertoruteev.model.cash.SpecificCurrency



class StartAdapter : RecyclerView.Adapter<StartAdapter.StartViewHolder>() {
    var listStart = emptyList<SpecificCurrency>()


    class StartViewHolder(val view : View) : RecyclerView.ViewHolder (view) {
        val itemName = view.findViewById<TextView>(R.id.item_name)
        val itemValues = view.findViewById<TextView>(R.id.item_values)
        val itemPrevious = view.findViewById<TextView>(R.id.item_previous)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return StartViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listStart.size
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemName.text = listStart[position].Name
        holder.itemValues.text = listStart[position].Value.toString()
        holder.itemPrevious.text = listStart[position].Previous.toString()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun setList(list: List<SpecificCurrency>) {
        listStart = list
        notifyDataSetChanged()
    }

}