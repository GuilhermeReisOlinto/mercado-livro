package com.mercadolivro.model

import jakarta.persistence.*
@Entity
@Table(name = "book")
data class BookModel (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int?,

    @Column
    var title: String,

    @Column
    var autor: String,

    @Column
    var date_publish: String,
)