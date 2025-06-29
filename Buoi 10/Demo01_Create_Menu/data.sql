CREATE DATABASE tb_dien_thoai;

use tb_dien_thoai;

create table product (
    id INT PRIMARY KEY AUTO_INCREMENT,
    product_name varchar(200) UNIQUE NOT NULL,
    -- INT mặc định: - 2 tỷ -> 2 tỷ
    -- INT INSIGNED(k nhận gt âm): 0 -> 4 tỷ
    price INT UNSIGNED,
    brand varchar(200) DEFAULT NULL,
    stock INT UNSIGNED
);

-- c1:
-- DELIMITER //
DELIMITER $$
CREATE PROCEDURE save_product(
    product_name_in VARCHAR(200),
    price_in INT,
    brand_in varchar(200),
    stock_in INT
)
BEGIN
    INSERT INTO product (product_name, price, brand, stock)
    VALUES (product_name_in, price_in, brand_in, stock_in);

    -- c1:
    -- END //
END $$

-- c1:
-- DELIMITER //
DELIMITER ;

-- DDL: tạo thêm 1 cột
ALTER TABLE product
ADD COLUMN created_at DATETIME;
-- DDL: sửa dữ liệu cột created at sang int
ALTER TABLE product
MODIFY COLUMN created_at int;
-- DDL: đổi tên cột cột created at sang created by
ALTER TABLE product
RENAME COLUMN created_at TO created_by;
-- DDL: xoá 1 cột
ALTER TABLE product
DROP COLUMN created_by;

-- thực hành bài tập
CREATE TABLE khoa (
    id int PRIMARY KEY AUTO_INCREMENT,
    tenkhoa VARCHAR(30) NOT NULL UNIQUE,
    dienthoai VARCHAR(15) NULL CHECK (LENGTH(dienthoai) >= 10 AND LENGTH(dienthoai) <= 15)
);

CREATE TABLE sinhvien(
    id int PRIMARY KEY AUTO_INCREMENT,
    masv VARCHAR(5) NOT NULL UNIQUE CHECK (LENGTH(masv) = 5),
    hoten VARCHAR(50) NOT NULL,
    makhoaid INT,
    namsinh INT UNSIGNED,

    FOREIGN KEY (makhoaid) REFERENCES khoa(id)
);

INSERT INTO khoa(tenkhoa, dienthoai)
VALUES
    ('TOAN', '0999 000111'),
    ('VAN', '0888 000111'),
    ('HOA', '0777 000111');

INSERT INTO sinhvien (masv, hoten, makhoaid, namsinh)
VALUES
    ('SV001', 'Nguyen Van A', 1, 2001),
    ('SV002', 'Tran Thi B', 2, 2002),
    ('SV003', 'Le Van C', 1, 2000),
    ('SV004', 'Pham Thi D', 3, 2003),
    ('SV005', 'Hoang Van E', 2, 2001),
    ('SV006', 'Do Thi F', 1, 2004),
    ('SV007', 'Bui Van G', 3, 2002);

-- lấy ra mã sv, họ tên, tên khoa
SELECT *
FROM
    -- INNER JOIN (JOIN): Nối 2 bảng theo giá trị của 2 cột trong 2 bảng
    -- LEFT JOIN: Nối 2 bảng theo giá trị của 2 cột trong 2 bảng
    --              hàng mà k join được cũng lấy giá trị bên trái
    -- RIGHT JOIN: Nối 2 bảng theo giá trị của 2 cột trong 2 bảng
    --              hàng mà k join được cũng lấy giá trị bên phải
    -- FULL OUTER JOIN: LEFT JOIN + RIGHT JOIN
#     sinhvien JOIN khoa ON sinhvien.makhoaid = khoa.id;
#     sinhvien LEFT JOIN khoa ON sinhvien.makhoaid = khoa.id;
    sinhvien RIGHT JOIN khoa ON sinhvien.makhoaid = khoa.id;
-- lấy ra sv chưa được gán bất kì khoa nào
SELECT *
FROM sinhvien
WHERE makhoaid IS NULL;

-- câu lệnh full outer join

SELECT *
FROM
    sinhvien LEFT JOIN khoa ON sinhvien.makhoaid = khoa.id
UNION
# UNION ALL
SELECT *
FROM
    sinhvien RIGHT JOIN khoa ON sinhvien.makhoaid = khoa.id