package com.mercadolivro.controller.request

data class PostBookRequest (
    var id: Int?,

    var autor: String,

    var date_publish: String,

    var title: String,
)