package com.apiumhub.kata.cinema.reservation.domain

data class Screen (
    val id: ScreenId,
    val seats : List<SeatId>,
)