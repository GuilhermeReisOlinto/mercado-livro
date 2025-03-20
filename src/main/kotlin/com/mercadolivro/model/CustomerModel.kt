package com.mercadolivro.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "customer")
data class CustomerModel (

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int?,

    @Column
    var nome: String,

    @Column
    var email: String,
)