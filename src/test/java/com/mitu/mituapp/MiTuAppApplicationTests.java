package com.mitu.mituapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.mitu.mituapp.repository.UserRepository;

@SpringBootTest
class MiTuAppApplicationTests {

    @Autowired
    private UserRepository studentRepository;

    @Test
    void contextLoads() {
        System.out.println(studentRepository.findAll());

    }

}
