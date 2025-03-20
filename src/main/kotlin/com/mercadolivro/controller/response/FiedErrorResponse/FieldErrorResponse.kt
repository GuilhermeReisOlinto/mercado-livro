package com.mercadolivro.controller.response

data class FieldErrorResponse(
    var httpCode: Int,
    var message: String,
    var internalCode: String,
    var Errors: List<FieldErrorResponse>?
)
