package com.book.manager.infrastructure.database.record.custom

import java.time.LocalDate
import java.time.LocalDateTime

data class BookWithRentalRecord(
    val id: Long? = null,
    val title: String? = null,
    val author: String? = null,
    val releaseDate: LocalDate? = null,
    val userId: Long? = null,
    val rentalDateTime: LocalDateTime? = null,
    val returnDateTime: LocalDateTime? = null
)