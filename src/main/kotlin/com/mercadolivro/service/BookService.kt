package com.mercadolivro.service

import com.mercadolivro.enums.Errors
import com.mercadolivro.exception.NotFoundException
import com.mercadolivro.model.BookModel
import com.mercadolivro.repository.BookRespository
import org.springframework.stereotype.Service

@Service
class BookService(
    val bookRepository: BookRespository
) {

    fun createBook(payload: BookModel) {
        bookRepository.save(payload);
    }

    fun getAll(): MutableIterable<BookModel> {
        return bookRepository.findAll();
    }

    fun getById(id: Int): BookModel {
        return bookRepository.findById(id).orElseThrow{ NotFoundException(Errors.ML001.message.format(id), Errors.ML001.code) };
    }

    fun delete(id: Int) {
        bookRepository.deleteById(id);
    }

    fun update(payload: BookModel) {
        if(!bookRepository.existsById(payload.id!!)) {
            throw Exception();
        }
        bookRepository.save(payload);
    }
}