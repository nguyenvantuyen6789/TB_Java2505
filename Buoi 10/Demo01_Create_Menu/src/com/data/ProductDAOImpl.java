package com.data;

import com.data.connection.ConnectionDB;
import com.data.model.Product;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl {

    public List<Product> getListProduct() {
        Connection conn = null;
        List<Product> products = new ArrayList<>();

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

                Product product = new Product(id, productName, price, brand, stock);
                products.add(product);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy dữ liệu!");
        }

        return products;
    }

    public List<Product> getListProductProcedure() {
        Connection conn = null;
        List<Product> products = new ArrayList<>();

        try {
            conn = ConnectionDB.openConn();
//            Statement st = conn.createStatement();
            CallableStatement callSt = conn.prepareCall("CALL find_all_product");

            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String productName = rs.getString("product_name");
                int price = rs.getInt("price");
                String brand = rs.getString("brand");
                int stock = rs.getInt("stock");

                Product product = new Product(id, productName, price, brand, stock);
                products.add(product);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy dữ liệu!");
        }

        return products;
    }

    public void show(List<Product> products) {
        System.out.println("==== Danh sách sản phẩm ====");

        System.out.println("---------------------------------");
        System.out.println("|  Id  |  Product Name  |  Price  | Brand | Stock |");
        products.forEach(product -> {
            StringBuilder row = new StringBuilder();
            row.append("|  " + product.getId());
            row.append("|  " + product.getProductName());
            row.append("|  " + product.getPrice());
            row.append("|  " + product.getBrand());
            row.append("|  " + product.getStock() + "   |");

            System.out.println(row);
        });
    }


    public int save(Product product) {
        Connection conn = null;
        int countAffect = 0;
        try {
            conn = ConnectionDB.openConn();
            CallableStatement callSt = conn.prepareCall("{CALL save_product(?, ?, ?, ?)}");
            callSt.setString(1, product.getProductName());
            callSt.setInt(2, product.getPrice());
            callSt.setString(3, product.getBrand());
            callSt.setInt(4, product.getStock());

            countAffect = callSt.executeUpdate();

            System.out.println("Tạo sản phm thành công, tên sp: " + product.getProductName());
        } catch (Exception e) {
            System.out.println("Lỗi lấy dữ liệu!");
        }

        return countAffect;
    }
    public int delete(int id) {
        Connection conn = null;
        int countAffect = 0;
        try {
            conn = ConnectionDB.openConn();
            Statement st = conn.createStatement();

            countAffect = st.executeUpdate("DELETE FROM product WHERE id = " + id);
        } catch (Exception e) {
            System.out.println("Lỗi lấy dữ liệu!");
        }

        return countAffect;
    }
}
