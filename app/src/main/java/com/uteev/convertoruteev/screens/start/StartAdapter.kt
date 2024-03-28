package com.uteev.convertoruteev.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uteev.convertoruteev.R
import com.uteev.convertoruteev.model.cash.Currency
import com.uteev.convertoruteev.model.cash.CurrencyResponse

class StartAdapter : RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    private var currencyMap = emptyMap<String, Currency>()
    inner class StartViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val itemName : TextView = itemView.findViewById(R.id.item_name)
        val itemValues : TextView = itemView.findViewById(R.id.item_values)
        val itemPrevious : TextView = itemView.findViewById(R.id.item_previous)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_money_layout, parent, false)
        return StartViewHolder(view)
    }

    override fun getItemCount(): Int {
        return currencyMap.size
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        val currencyCode = currencyMap.keys.elementAt(position)
        val currency = currencyMap[currencyCode]
        holder.itemName.text = currency?.Name ?: ""
        holder.itemValues.text = currency?.Value.toString()
        holder.itemPrevious.text = currency?.Previous.toString()
    }
    @SuppressLint("NotifyDataSetChanged")
    fun setMap(currencyResponse: CurrencyResponse) {
        currencyMap = currencyResponse.Valute
        notifyDataSetChanged()
    }

}