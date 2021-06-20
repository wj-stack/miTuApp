package com.mitu.mituapp.controller;


import com.mitu.mituapp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mitu.mituapp.repository.UserRepository;

import java.util.List;


@RestController
public class HelloController {



    @RequestMapping("/hello")
    public String Handle1(){

        StringBuilder str = new StringBuilder();
        List<User> all = userRepository.findAll();
        for(User user:all){
            str.append(user.toString()).append('\n');
        }
        return str.toString();
    }

    @Autowired
    private UserRepository userRepository;


}
