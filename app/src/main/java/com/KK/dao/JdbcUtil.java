package com.KK.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUtil {
    public void createConnection(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kktestmodel?CharacterEncoding=utf-8","root","123456");
            String sql = "insert into jopseeker values (null,\"pan\",\"18684301016\",\"9@qq.com\");";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            int i = preparedStatement.executeUpdate();
            System.out.println(i);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
