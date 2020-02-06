package com.example.cse438_rest_studio.data
//TODO #3: Generate a data class to represent a brewery based on the JSON output from the API

data class Brewery(
    val name: String,
    val type: String,
    val city: String,
    val state: String,
    val street: String,
    val phone: String
)

data class Payload (val response_code: Int, val results: List<Brewery>)
