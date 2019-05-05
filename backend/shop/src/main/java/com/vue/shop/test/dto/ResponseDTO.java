package com.vue.shop.test.dto;

import lombok.Data;

@Data
public class ResponseDTO<T>{
    private String message;
    private boolean check = true;
    private T response;

}