package com.binar.challenge5.repositories;

import com.binar.challenge5.entities.Users;
import com.binar.challenge5.model.request.UsersRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {


    //    Get All
    @Query(value = "select * from users by id_user", nativeQuery = true)
    List<Users> findAllUsers();

    // Get All with pagination
    @Query(value = "select * from users", nativeQuery = true)
    List<Users> findAllUsersWithPage(Pageable pageable);

    // By Id User
    @Query(value = "select * from users where id_user = :id_user", nativeQuery = true)
    Users findUsersById(@Param("id_user") Integer id_user);

    // By Name
    @Query(value = "select * from users where username = :username", nativeQuery = true)
    List<Users> findUsersByName(@Param("username") String nama);

}
