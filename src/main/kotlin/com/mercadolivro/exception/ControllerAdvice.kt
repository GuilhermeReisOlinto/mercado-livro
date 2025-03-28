package com.mercadolivro.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import com.mercadolivro.controller.response.ErrorResponse
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.context.request.WebRequest

@ControllerAdvice
class ControllerAdvice {

    @ExceptionHandler(NotFoundException::class)
    fun handleException(ex: NotFoundException, request: WebRequest): ResponseEntity<ErrorResponse> {
       val error = ErrorResponse(
            HttpStatus.NOT_FOUND.value(),
            ex.message,
            ex.errorCode,
            null
       )

        return ResponseEntity(error, HttpStatus.NOT_FOUND);
    }
}