package com.mercadolivro.repository

import com.mercadolivro.model.BookModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRespository: CrudRepository<BookModel, Int> {}