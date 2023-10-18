package com.codegym.thymeleaf.service;

import com.codegym.thymeleaf.dao.CustomerDAO;
import com.codegym.thymeleaf.model.Customer;

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

    @Override
    public void remove(int id) {
        customerDAO.deleteById(id);
    }
}
