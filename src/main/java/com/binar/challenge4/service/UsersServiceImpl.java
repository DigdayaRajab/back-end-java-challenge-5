package com.binar.challenge4.service;

import com.binar.challenge4.model.Users;
import org.springframework.stereotype.Service;

@Service
public interface UsersServiceImpl {

    void newUsers(Users user);
    void deleteUsers(Users user);
    Users searchUserByName(String username);
}
