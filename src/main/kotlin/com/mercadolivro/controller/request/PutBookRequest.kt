package com.mercadolivro.controller.request

data class PutBookRequest (
    var autor: String,

    var date_publish: String,

    var title: String,
)