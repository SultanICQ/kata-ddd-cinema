package com.apiumhub.kata.cinema.reservation.domain

data class Reservation private constructor(
    val id: ReservationId,
    val customerId: CustomerId,
    val seats: List<SeatId>
) {
    companion object {
        fun create(
            id: ReservationId,
            customerId: CustomerId,
            showing: Showing,
            seats: List<SeatId>
        ) {
            if ( !showing.areAvailable(seats) ) {
                throw IllegalArgumentException("Seats are not available")
            }
            showing.block(seats)
            Reservation(id, customerId, seats)
        }
    }
}