package com.codegym.demo.converter;

import com.codegym.demo.model.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoToModel {
    static DaoToModel daoToModel;

    public static DaoToModel getInstance() {
        if (daoToModel == null) {
            daoToModel = new DaoToModel();
        }
        return daoToModel;
    }

//    public User userDaoToModel(ResultSet mResultSet) throws SQLException {
//        User user = new User();
//        user.setId(mResultSet.getInt("id"));
//        user.setName(mResultSet.getString("name"));
//        user.setStatus(mResultSet.getInt("status"));
//        user.setUserName(mResultSet.getString("userName"));
//        user.setPassword(mResultSet.getString("password"));
//        user.setAddress(mResultSet.getString("address"));
//        user.setTotalMoney(mResultSet.getFloat("totalMoney"));
//        return user;
//    }
//
//    public CategoryDetail categoryDetailDaoToModel(ResultSet mResultSet) throws SQLException {
//        CategoryDetail categoryDetail = new CategoryDetail();
//        categoryDetail.setId(mResultSet.getInt("id"));
//        categoryDetail.setName(mResultSet.getString("name"));
//        categoryDetail.setStatus(mResultSet.getInt("status"));
//        categoryDetail.setRole(mResultSet.getInt("role"));
//        Category category = new Category();
//        category.setId(mResultSet.getInt("categoryID"));
//        try {
//            category.setName(mResultSet.getString("category.name"));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        categoryDetail.setCategory(category);
//        return categoryDetail;
//    }
//
//    public Category categoryDaoToModel(ResultSet mResultSet) throws SQLException {
//        Category category = new Category();
//        category.setId(mResultSet.getInt("id"));
//        category.setName(mResultSet.getString("name"));
//        category.setStatus(mResultSet.getInt("status"));
//        return category;
//    }
//
//    public Money moneyDaoToModel(ResultSet mResultSet) throws SQLException {
//        Money money = new Money();
//        User user = new User();
//        user.setId(mResultSet.getInt("userId"));
//        money.setUser(user);
//        CategoryDetail categoryDetail = new CategoryDetail();
//        categoryDetail.setId(mResultSet.getInt("categoryDetailId"));
//        try {
//            categoryDetail.setName(mResultSet.getString("category_detail.name"));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        money.setCategoryDetail(categoryDetail);
//        money.setMoney(mResultSet.getFloat("money"));
//        money.setDescription(mResultSet.getString("description"));
//        Timestamp time = mResultSet.getTimestamp("date");
//        money.setDate(time.toLocalDateTime());
//        return money;
//    }

    public Customer customerDaoToModel(ResultSet mResultSet) throws SQLException {
        Customer customer = new Customer();
        customer.setId(mResultSet.getInt("id"));
        customer.setName(mResultSet.getString("name"));
        customer.setEmail(mResultSet.getString("email"));
        customer.setAddress(mResultSet.getString("address"));
        return customer;
    }
}
