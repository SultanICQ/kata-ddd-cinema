package com.apiumhub.kata.cinema.reservation.domain

data class Reservation private constructor(
    val id: ReservationId,
    val customerId: CustomerId,
    val seats: List<SeatId>
) {
    fun reserve(
        id: ReservationId,
        customerId: CustomerId,
        showing: Showing,
        seats: List<SeatId>
    ) {
        if ( !showing.areAvailable(seats) ) {
            throw IllegalArgumentException("Seats are not available")
        }
        Reservation(id, customerId, seats)
        showing.block(seats)
    }
}