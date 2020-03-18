package com.frankmoley.lil.jdbc;

import java.sql.*;
import java.util.Properties;

public class DatabaseConnectionManager {
    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learningjdbc", "root", "root");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return connection;
    }
    public void dbDisconnect(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {
        if (connection != null)
            connection.close();
        if (statement != null)
            statement.close();
        if (resultSet != null)
            resultSet.close();
    }
}
