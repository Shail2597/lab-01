package com.example.petshop

class Happy(date: String) : Mood(date) {
    override fun moods(): String {
        return "happy"
    }
}
