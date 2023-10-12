package com.codegym.demo.dao;

import com.codegym.demo.converter.DaoToModel;
import com.codegym.demo.model.Customer;
import com.codegym.demo.util.ConnectionUtil;

import java.sql.SQLException;
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
}
