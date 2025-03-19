package com.apiumhub.kata.cinema.reservation.domain

import java.time.LocalDateTime

data class Showing private constructor(
    val id: ShowingId,
    val movie: MovieId,
    val screen: ScreenId,
    val availableSeats: List<SeatId>,
    val time: LocalDateTime,
) {

    fun areAvailable(seats: List<SeatId>): Boolean {
        return true
    }

    fun block(seats: List<SeatId>) {

    }

    companion object {
        fun create(
            id: ShowingId,
            movie: MovieId,
            screen: ScreenId,
            availableSeats: List<SeatId>,
            time: LocalDateTime,
        ) = Showing(id, movie, screen, availableSeats, time)
    }
}