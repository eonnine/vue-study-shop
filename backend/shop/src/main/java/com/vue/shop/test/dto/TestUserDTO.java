package com.vue.shop.test.dto;

import lombok.Data;

@Data
public class TestUserDTO{
    private String name;
    private String phone;

    public TestUserDTO(String arg_name, String arg_phone){
        this.name = arg_name;
        this.phone = arg_phone;
    }
}