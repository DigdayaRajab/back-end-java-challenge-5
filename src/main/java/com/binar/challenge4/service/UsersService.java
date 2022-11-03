package com.binar.challenge4.service;

import com.binar.challenge4.model.Users;
import com.binar.challenge4.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService implements UsersServiceImpl{
    @Autowired
    UsersRepository usersRepository;

    @Override
    public void newUsers(Users user){
        List<Users> usr = usersRepository.findUsersByName(user.getUsername());
        if(usr.size() > 0) {
//            throw new Exception("User telah terdaftar !");
            System.out.println("User telah terdaftar !");
        }
        usersRepository.save(user);
    }

    @Override
    public void deleteUsers(Users user){
        usersRepository.deleteById(user.getIdUser());
    }

    @Override
    public Users searchUserByName(String username) {
        return usersRepository.findUsersByName(username).get(0);
    }

}
