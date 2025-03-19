package com.apiumhub.kata.cinema.reservation.domain

data class ScreenId(val id: String) {
    init {
        require(id.isNotBlank()) { "SeatId cannot be blank" }
    }
}