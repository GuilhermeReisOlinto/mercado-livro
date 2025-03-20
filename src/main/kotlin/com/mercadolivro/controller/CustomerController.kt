package com.mercadolivro.controller

import com.mercadolivro.controller.request.PostCustomerRequest
import com.mercadolivro.controller.request.PutCustomerRequest
import com.mercadolivro.extension.toCustomerModel
import com.mercadolivro.model.CustomerModel
import com.mercadolivro.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customer")
class CustomerController (
    val customerService: CustomerService
){

    @GetMapping
    fun getAll(): MutableIterable<CustomerModel> {
        return this.customerService.getAll();
    };

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody payload: PostCustomerRequest) {
            customerService.create(payload.toCustomerModel());
    }

    @GetMapping("/{id}")
    fun getOneByID(@PathVariable id: Int): CustomerModel {
        return customerService.getOneByID(id);
    };

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun updateCustomer(@PathVariable id: Int, @RequestBody payload: PutCustomerRequest) {
        customerService.updateCustomer(payload.toCustomerModel(id));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Int) {
        return customerService.delete(id);
    }
}