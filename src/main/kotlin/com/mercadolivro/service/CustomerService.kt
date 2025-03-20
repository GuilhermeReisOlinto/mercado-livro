package com.mercadolivro.service

import com.mercadolivro.enums.Errors
import com.mercadolivro.exception.NotFoundException
import com.mercadolivro.model.CustomerModel
import com.mercadolivro.repository.CustomerRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable

@Service
class CustomerService(
    val customerRepository: CustomerRepository,
) {

    fun getAll(): MutableIterable<CustomerModel> {
        return customerRepository.findAll();
    }

    fun create(payload: CustomerModel) {
        customerRepository.save(payload);
    }

    fun getOneByID(id: Int): CustomerModel {
        return customerRepository.findById(id).orElseThrow{ NotFoundException(Errors.ML002.message.format(id), Errors.ML002.code) } ;
    };

    fun updateCustomer(payload: CustomerModel) {
        if(!customerRepository.existsById(payload.id!!)) {
            throw Exception();
        }

        customerRepository.save(payload);
    }

    fun delete(@PathVariable id: Int) {
        customerRepository.deleteById(id);
    }
}