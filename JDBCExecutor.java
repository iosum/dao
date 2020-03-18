package com.frankmoley.lil.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExecutor {

    public static void main(String... args){
        DatabaseConnectionManager dcm = new DatabaseConnectionManager();
        dcm.getConnection();

            Connection connection = dcm.getConnection();
            // instantiate customer dao w/ the connectino
            CustomerDAO customerDAO = new CustomerDAO(connection);
            Customer customer = new Customer();
            customer.setFirstName("apple");
            customer.setLastName("bread");
            customer.setEmail("bread@test.com");
            customer.setPhone("(222)333-1234");
            customer.setAddress("101 Apple Drive");
            customer.setCity("Fruit");
            customer.setState("Banana");
            customer.setZipCode("12345");
            customerDAO.create(customer);
    }
}
