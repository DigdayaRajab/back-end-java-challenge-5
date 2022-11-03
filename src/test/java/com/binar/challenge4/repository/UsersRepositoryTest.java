package com.binar.challenge4.repository;

import com.binar.challenge4.model.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UsersRepositoryTest {

    @Autowired
    UsersRepository usersRepository;

    @Test
    void tesAddData(){
        Users user = new Users();
//        user.setIdUser(01L);
        user.setUsername("Rajab");
        user.setAddress("Indonesia");
        user.setEmail("rajab@gmail.com");
        user.setPassword("rajab");
        user.setState(true);

        usersRepository.save(user);
    }
}