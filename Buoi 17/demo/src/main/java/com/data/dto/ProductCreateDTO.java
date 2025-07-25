package com.data.dto;

import lombok.Data;

import java.util.Date;

@Data // getter, setter, toString
public class ProductCreateDTO {

    private int id;

    private String productName;

    private int price;

    private Date createdDate;

}
