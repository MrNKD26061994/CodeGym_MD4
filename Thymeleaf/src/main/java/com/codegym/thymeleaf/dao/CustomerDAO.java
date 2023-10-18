package com.codegym.thymeleaf.dao;

import com.codegym.thymeleaf.converter.DaoToModel;
import com.codegym.thymeleaf.model.Customer;
import com.codegym.thymeleaf.util.ConnectionUtil;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO extends ConnectionUtil {
    DaoToModel converter = DaoToModel.getInstance();

    public Customer findById(int id) {
        Customer customer = new Customer();
        String sql = "select * from customer where id = ?";
        try {
            open();
            mPreparedStatement = mConnection.prepareStatement(sql);
            mPreparedStatement.setInt(1, id);
            mResultSet = mPreparedStatement.executeQuery();
            while (mResultSet.next()) {
                customer = converter.customerDaoToModel(mResultSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customer;
    }

    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        try {
            open();
            String sql = "Select * from customer";
            mPreparedStatement = mConnection.prepareStatement(sql);
            mResultSet = mPreparedStatement.executeQuery();
            while (mResultSet.next()) {
                Customer category = converter.customerDaoToModel(mResultSet);
                customers.add(category);
            }
            close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return customers;
    }

    public void insert(Customer customer) {
        String sql = "INSERT INTO customer (`name`, `email`, `address`) VALUES (?, ?, ?)";

        try {
            open();
            mPreparedStatement = mConnection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            mPreparedStatement.setString(1, customer.getName());
            mPreparedStatement.setString(2, customer.getEmail());
            mPreparedStatement.setString(3, customer.getAddress());
            mPreparedStatement.executeUpdate();
            mResultSet = mPreparedStatement.getGeneratedKeys();
            close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void update(Customer customer) {
        String sql = "update customer set name = ?, email = ?, address = ? where id = ?";
        try {
            open();
            mPreparedStatement = mConnection.prepareStatement(sql);
            mPreparedStatement.setString(1, customer.getName());
            mPreparedStatement.setString(2, customer.getEmail());
            mPreparedStatement.setString(3, customer.getAddress());
            mPreparedStatement.setInt(4, customer.getId());
            mPreparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteById(int id) {
        String sql = "DELETE FROM customer where id = ?";
        try {
            open();
            mPreparedStatement = mConnection.prepareStatement(sql);
            mPreparedStatement.setInt(1, id);
            mPreparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
