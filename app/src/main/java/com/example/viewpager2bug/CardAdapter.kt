package com.example.viewpager2bug

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CardAdapter : RecyclerView.Adapter<CardAdapter.CardHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return CardHolder(view)
    }

    override fun getItemCount(): Int = 4

    override fun onBindViewHolder(holder: CardHolder, position: Int) {

    }

    class CardHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}