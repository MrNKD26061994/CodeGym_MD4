package com.codegym.springcontroller.service;

import com.codegym.springcontroller.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    void save(Customer customer);
}
