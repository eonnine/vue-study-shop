package com.vue.shop.test.controller;

import java.util.ArrayList;
import java.util.List;

import com.vue.shop.test.dto.ResponseDTO;
import com.vue.shop.test.dto.TestUserDTO;
import com.vue.shop.test.service.TestUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class TestUserController {

    @Autowired
    private TestUserService userService;

    @GetMapping
    public ResponseDTO<?> getUsers(){
        ResponseDTO<List<TestUserDTO>> resp = new ResponseDTO<>();

        List<TestUserDTO> list = new ArrayList<TestUserDTO>();
        list.add(new TestUserDTO("테스트", "010-1111-2222"));
        list.add(new TestUserDTO("테스트2", "010-3333-4444"));
        list.add(new TestUserDTO("테스트3", "010-5555-6666"));

        String message = userService.getTestSelect();

        resp.setResponse(list);
        resp.setMessage(message);
        return resp;
    }

    @GetMapping("/{id}")
    public ResponseDTO<?> getUser(@PathVariable int id){
        ResponseDTO<TestUserDTO> resp = new ResponseDTO<>();

        List<TestUserDTO> list = new ArrayList<TestUserDTO>();
        list.add(new TestUserDTO("테스", "010-1111-2222"));
        list.add(new TestUserDTO("테스2", "010-3333-4444"));
        list.add(new TestUserDTO("테스3", "010-5555-6666"));

        resp.setResponse(list.get(id));
        return resp;
    }
}