package com.data.dto;


import lombok.Data;

@Data
public class AccountCreateDTO {
    private String username;

    private String password;

    private String fullName;

    private String email;

    private String phone;
}
