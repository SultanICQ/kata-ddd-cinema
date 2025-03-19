package com.apiumhub.kata.cinema.reservation.domain

data class ReservationId(val id: String) {
    init {
        require(id.isNotBlank()) { "SeatId cannot be blank" }
    }
}