package com.data;

import com.data.connection.ConnectionDB;
import com.data.model.Product;

import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ProductDAOImpl productDAO = new ProductDAOImpl();
        // menu
        showMenu();

        System.out.println("====");
        System.out.println("Nhập chức năng tương ứng:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n < 1 || n > 5) {
            System.out.println("Số chức năng chưa đúng!. Vui lòng nhập lại:");
            n = sc.nextInt();
        }

        switch (n) {
            case 1:
                System.out.println("=== Chức năng Quản lý điện thoại");
                showMenuProduct();

                int numChucNang = 0;
                sc = new Scanner(System.in);
                numChucNang = sc.nextInt();

                while (numChucNang < 1 || numChucNang > 5) {
                    System.out.println("Số chức năng chưa đúng!. Vui lòng nhập lại:");
                    numChucNang = sc.nextInt();
                }

                if (numChucNang == 1) {
                    // gọi thẳng câu sql query
//                    List<Product> products = productDAO.getListProduct();
                    // CALL procedure find_all_product()
                    List<Product> products = productDAO.getListProductProcedure();
                    productDAO.show(products);

                } else if (numChucNang == 2) {
                    System.out.println("==== Nhập tên sản phẩm:");
                    sc = new Scanner(System.in);
                    String productName = sc.nextLine();

                    System.out.println("==== Nhập giá tiền:");
                    int price = sc.nextInt();

                    System.out.println("==== Nhập tên thương hiệu:");
                    sc = new Scanner(System.in);
                    String brand = sc.nextLine();

                    System.out.println("==== Nhập tồn kho:");
                    int stock = sc.nextInt();

                    Product product = new Product(0,  productName, price, brand, stock);

                    productDAO.save(product);
                } else if (numChucNang == 4) {
                    // hiển thị danh sách để chọn id
                    List<Product> products = productDAO.getListProduct();
                    productDAO.show(products);

                    System.out.println("Nhập id điện thoại cần xoá:");
                    int id = 0;
                    sc = new Scanner(System.in);
                    id = sc.nextInt();

                    int numAffect = productDAO.delete(id);
                    if (numAffect > 0) {
                        System.out.println("Xoá điện thoại thành công, id = " + id);
                    } else {
                        System.out.println("Xoá không thành công, id không tồn tại");
                    }
                }
                break;
            case 2:
                System.out.println("Chức năng Quản lý khách hàng");
                // sv lam chuc nang them san pham,
                // cap nhat san pham: 30p
                // lafm xong chup len zlo nhe
                break;
            case 3:
                System.out.println("Chức năng Quản lý hoá đơn");
                break;
            case 4:
                System.out.println("Chức năng Quản lý doanh thu");
                break;
            default:
                System.out.println("Chức năng Đăng xuất");
        }
    }

    private static void showMenu() {
        // thực hành tạo menu
        System.out.println("==== Chương trình quản lý điện thoại ====");
        System.out.println("1. Quản lý điện thoại");
        System.out.println("2. Quản lý khách hàng");
        System.out.println("3. Quản lý hoá đơn");
        System.out.println("4. Quản lý doanh thu");
        System.out.println("5. Đăng xuất");
    }

    private static void showMenuProduct() {
        System.out.println("==== Chọn chức năng bên dưới: ====");
        System.out.println("1. Xem danh sách điện thoại");
        System.out.println("2. Thêm mới điện thoại");
        System.out.println("3. Cập nhật điện thoại");
        System.out.println("4. Xoá điện thoại theo id");
        System.out.println("5. Trở về");

    }
}
