package com.data;

import com.data.connection.ConnectionDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductDAOImpl {

    public static void getListProduct() {
        Connection conn = null;
        try {
            conn = ConnectionDB.openConn();
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM product");
            while (rs.next()) {
                int id = rs.getInt("id");
                String productName = rs.getString("product_name");
                int price = rs.getInt("price");
                String brand = rs.getString("brand");
                int stock = rs.getInt("stock");

                System.out.println(id);
                System.out.println(productName);
                System.out.println(price);
                System.out.println(brand);
                System.out.println(stock);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy dữ liệu!");
        }
    }
}
