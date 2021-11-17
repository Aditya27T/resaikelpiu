package com.example.resaikelpiu

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityManager
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

data class ClubAdapter(private val context: Context, private val club: List<Club>, val listener: (Club)-> Unit)
    :RecyclerView.Adapter<ClubAdapter.ClubViewHolder>() {

    class ClubViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgClub = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameClub = view.findViewById<TextView>(R.id.tv_item_name)
        val descClub = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(club: Club, listener: (Club) -> Unit){
            imgClub.setImageResource(club.imgClub)
            nameClub.text = club.nameClub
            descClub.text = club.descClub
            itemView.setOnClickListener{
                listener(club)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClubViewHolder {
        return ClubViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_epl_club, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ClubViewHolder, position: Int) {
        holder.bindView(club[position], listener)
    }

    override fun getItemCount(): Int = club.size
    }
