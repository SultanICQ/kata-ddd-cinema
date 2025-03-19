package com.apiumhub.kata.cinema.reservation.domain

import java.time.LocalDateTime

data class Showing private constructor(
    val id: ShowingId,
    val movie: MovieId,
    val screen: ScreenId,
    val availableSeats: List<SeatId>,
    val time: LocalDateTime,
) {

    fun create(
        val id: ShowingId,
        val movie: MovieId,
        val screen: ScreenId,
        val availableSeats: List<SeatId>,
        val time: LocalDateTime,
    ) {
        Showing(id, movie, screen, availableSeats, time)
    }

    fun areAvailable(seats: List<SeatId>): Boolean {

    }

    fun block(seats: List<SeatId>) {

    }
}