package com.mercadolivro.extension

import com.mercadolivro.controller.request.PostBookRequest
import com.mercadolivro.controller.request.PostCustomerRequest
import com.mercadolivro.controller.request.PutBookRequest
import com.mercadolivro.controller.request.PutCustomerRequest
import com.mercadolivro.model.BookModel
import com.mercadolivro.model.CustomerModel

fun PostCustomerRequest.toCustomerModel(): CustomerModel {
    return CustomerModel(id = null, nome = this.nome, email = this.email);
}

fun PutCustomerRequest.toCustomerModel(id: Int): CustomerModel {
    return CustomerModel(id = id, nome = this.nome, email = this.email);
}

fun PostBookRequest.toBookModel(): BookModel {
    return BookModel(id = null, autor = this.autor, date_publish = this.date_publish, title = this.title);
}

fun PutBookRequest.toBookModel(id: Int): BookModel {
    return BookModel(id = id, autor = this.autor, date_publish = this.date_publish, title = this.title);
}