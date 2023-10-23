package com.example.test3.domain.user.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //requestbody를 받을 수 있음
@RequestMapping("/user")
public class UserController {
    @GetMapping("/find")
    public void findUser(){

    }

}
