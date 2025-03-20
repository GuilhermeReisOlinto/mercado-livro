package com.mercadolivro.enums

enum class Errors(
    val code: String,
    val message: String,
) {
    ML001("ML-001", "BOOK %s NOT EXIST"),
    ML002("ML-002", "CUSTOMER %s NOT EXIST")
}