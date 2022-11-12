package com.binar.challenge5.repositories;

import com.binar.challenge5.entities.Users;
import com.binar.challenge5.model.response.UsersResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import java.util.List;

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
    @Test
    void tesGetUserById() {
//        List<Users> usersList = usersRepository.findUsersById(1);
//        usersList.forEach(usr -> {
//            System.out.println(usr.getUsername());
//        });
        Users users = usersRepository.findUsersById(1);
        System.out.println(users.getUsername());

    }

    @Test
    void tesGetUserByName() {
        List<Users> usersList = usersRepository.findUsersByName("Rajab");
        usersList.forEach(usr -> {
            System.out.println(usr.getIdUser());
        });
    }

    @Test
    void testGetAllUsers() {
        List<UsersResponse> usersList0 = usersRepository.findAllUsers();
        usersList0.forEach(usr -> {
            System.out.println(usr.getUsername());
        });
    }

    @Test
    void testGetAllUsersPageable() {
        System.out.println("Data User  page 0");
        List<Users> usersList0 = usersRepository.findAllUsersWithPage(PageRequest.of(0, 2));
        usersList0.forEach(usr -> {
            System.out.println(usr.getUsername());
        });
        System.out.println("\nData User page 1");
        List<Users> usersList1 = usersRepository.findAllUsersWithPage(PageRequest.of(1, 2));
        usersList1.forEach(usr -> {
            System.out.println(usr.getUsername());
        });
        System.out.println("\nData User  page 2");
        List<Users> usersList2 = usersRepository.findAllUsersWithPage(PageRequest.of(2, 2));
        usersList2.forEach(usr -> {
            System.out.println(usr.getUsername());
        });
    }
}