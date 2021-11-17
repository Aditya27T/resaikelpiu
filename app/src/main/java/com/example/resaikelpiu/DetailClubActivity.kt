package com.example.resaikelpiu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class DetailClubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_club)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val club = intent.getParcelableExtra<Club>(MainActivity.INTENT_PARCELABLE)

        val imgClub = findViewById<ImageView>(R.id.img_item_photo)
        val nameClub = findViewById<TextView>(R.id.tv_item_name)
        val descClub = findViewById<TextView>(R.id.tv_item_description)

        imgClub.setImageResource(club?.imgClub!!)
        nameClub.text = club.nameClub
        descClub.text = club.descClub


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}