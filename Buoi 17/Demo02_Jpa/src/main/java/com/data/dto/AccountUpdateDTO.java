package com.data.dto;


import lombok.Data;

@Data
public class AccountUpdateDTO {
    private String username;

    private String password;

    private String fullName;

    private String email;

    private String phone;
}
