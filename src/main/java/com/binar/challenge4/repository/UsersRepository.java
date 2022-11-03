package com.binar.challenge4.repository;

import com.binar.challenge4.model.Users;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface UsersRepository extends JpaRepository<Users, Integer> {

    //    Get All
    @Query(value = "select * from users", nativeQuery = true)
    List<Users> findAllUsers();

    // Get All with pagination
    @Query(value = "select * from users", nativeQuery = true)
    List<Users> findAllUsersWithPage(Pageable pageable);

    // By Id User
    @Query(value = "select * from users where id_user = :id_user", nativeQuery = true)
    List<Users> findUsersById(@Param("id_user") Integer id_user);

    // By Name
    @Query(value = "select * from users where username = :username", nativeQuery = true)
    List<Users> findUsersByName(@Param("username") String nama);


}
