package com.apiumhub.kata.cinema.reservation.domain

data class SeatId(val id: String) {
    init {
        require(id.isNotBlank()) { "SeatId cannot be blank" }
    }
}