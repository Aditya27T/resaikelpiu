package com.example.resaikelpiu

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Club(
    val imgClub:Int,
    val nameClub: String,
    val descClub: String
) : Parcelable
