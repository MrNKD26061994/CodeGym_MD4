package com.codegym.demo.service;

import com.codegym.demo.dao.CustomerDAO;
import com.codegym.demo.model.Customer;

import java.sql.SQLException;
import java.util.List;

public class CustomerService implements ICustomerService{
    static CustomerService customerService;

    public static CustomerService getInstance() {
        if (customerService == null) {
            customerService = new CustomerService();
        }
        return customerService;
    }
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
