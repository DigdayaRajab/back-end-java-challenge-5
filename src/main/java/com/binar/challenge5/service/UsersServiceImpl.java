package com.binar.challenge5.service;

import com.binar.challenge5.entities.Users;
import com.binar.challenge5.model.response.UsersResponse;
import com.binar.challenge5.model.request.UsersRequest;
import com.binar.challenge5.repositories.UsersRepository;
import com.binar.challenge5.service.Interface.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    UsersRepository usersRepository;

    @Override
    public UsersResponse newUser(UsersRequest usersRequest) {
        Users user = new Users();
        user.setIdUser(0);
        user.setUsername(usersRequest.getUsername());
        user.setAddress(usersRequest.getAddress());
        user.setEmail(usersRequest.getEmail());
        user.setPassword(usersRequest.getPassword());
        usersRepository.save(user);

        UsersResponse usersResponse = new UsersResponse();
        usersResponse.setIdUser(user.getIdUser());
        usersResponse.setUsername(user.getUsername());
        usersResponse.setAddress(user.getAddress());
        usersResponse.setEmail(user.getEmail());
        usersResponse.setPassword(user.getPassword());

        return usersResponse;
    }

    @Override
    public UsersResponse updateUser(UsersRequest usersRequest) {
        Users user = new Users();
        user.setIdUser(usersRequest.getIdUser());
        user.setUsername(usersRequest.getUsername());
        user.setAddress(usersRequest.getAddress());
        user.setEmail(usersRequest.getEmail());
        user.setPassword(usersRequest.getPassword());
        usersRepository.save(user);

        UsersResponse usersResponse = new UsersResponse();
        usersResponse.setIdUser(user.getIdUser());
        usersResponse.setUsername(user.getUsername());
        usersResponse.setAddress(user.getAddress());
        usersResponse.setEmail(user.getEmail());
        usersResponse.setPassword(user.getPassword());

        return usersResponse;
    }

    @Override
    public void deleteUser(Integer id_user) {
        usersRepository.deleteById(id_user);
    }

    @Override
    public List<Users> findAllUser() {
        return usersRepository.findAllUsers();
    }

    @Override
    public Users searchUserById(Integer id_user) {
        return usersRepository.findUsersById(id_user);
    }

    @Override
    public List<Users> searchUserByName(String username) {
        return usersRepository.findUsersByName(username);
    }

}
