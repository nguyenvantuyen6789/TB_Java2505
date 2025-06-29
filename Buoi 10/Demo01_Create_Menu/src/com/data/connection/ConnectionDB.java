package com.data.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/tb_dien_thoai?createDatabaseIfNotExist=true";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static Connection openConn() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            return conn;
        } catch (Exception e) {
            System.out.println("Lỗi kết nối CSDL!");
            e.printStackTrace();
        }

        return null;
    }
}
