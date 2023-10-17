package com.codegym.springcontroller.service;

import com.codegym.springcontroller.dao.CustomerDAO;
import com.codegym.springcontroller.model.Customer;

import java.util.List;

public class CustomerService implements ICustomerService{
    private final CustomerDAO customerDAO = new CustomerDAO();

    public List<Customer> findAll() {
        return customerDAO.findAll();
    }

    public Customer findById(int id) {
        return customerDAO.findById(id);
    }

    public void save(Customer customer) {
        if(customer.getId() != 0) {
            customerDAO.update(customer);
        } else {
            customerDAO.insert(customer);
        }
    }
}
