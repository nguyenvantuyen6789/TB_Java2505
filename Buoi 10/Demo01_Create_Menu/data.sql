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