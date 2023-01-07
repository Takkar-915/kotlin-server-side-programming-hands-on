package com.book.manager.presentation.controller

import com.book.manager.domain.model.Book
import com.book.manager.application.service.AdminBookService
import com.book.manager.presentation.request.RegisterBookRequest
import com.book.manager.presentation.request.UpdateBookRequest
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("admin/book")
@CrossOrigin(origins = ["http://localhost:8081"], allowCredentials = "true")

class AdminBookController(
    val adminBookService: AdminBookService
) {
    @PostMapping("/register")
    fun register(@RequestBody request: RegisterBookRequest){
        adminBookService.register(
            Book(
                request.id,
                request.title,
                request.author,
                request.releaseDate
            )
        )
    }

    @PutMapping("/update")
    fun update(@RequestBody request: UpdateBookRequest){
        adminBookService.update(request.id, request.title, request.author, request.releaseDate)
    }

}