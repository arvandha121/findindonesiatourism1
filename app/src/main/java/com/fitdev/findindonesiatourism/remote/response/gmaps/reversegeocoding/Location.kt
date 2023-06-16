package com.fitdev.findindonesiatourism.remote.response.gmaps.reversegeocoding

import com.google.gson.annotations.SerializedName

data class Location(

	@field:SerializedName("lng")
	val lng: Any? = null,

	@field:SerializedName("lat")
	val lat: Any? = null
)