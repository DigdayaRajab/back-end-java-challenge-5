package com.binar.challenge5.service;

import com.binar.challenge5.entities.Users;
import com.binar.challenge5.service.Interface.UsersService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UsersServiceImplImplTest {
    @Autowired
    UsersService usersService;

    @Test
    void newUsers(){
        Users user = new Users();
        user.setUsername("Rajab");
        user.setAddress("Indonesia");
        user.setEmail("rajab33@gmail.com");
        user.setPassword("rajab");

        try {
//            usersService.newUsers(user);
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    @Test
    void deleteUsers(){
        Users user = new Users();
        user.setIdUser(1);

        try {
//            usersService.deleteUsers(user.getIdUser());
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}