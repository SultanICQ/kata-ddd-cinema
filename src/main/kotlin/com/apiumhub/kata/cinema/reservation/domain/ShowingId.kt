package com.apiumhub.kata.cinema.reservation.domain

class ShowingId(val id: String) {
    init {
        require(id.isNotBlank()) { "SeatId cannot be blank" }
    }
}