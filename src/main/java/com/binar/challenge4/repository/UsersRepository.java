package com.binar.challenge4.repository;

import com.binar.challenge4.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resource;

@Resource
public interface UsersRepository extends JpaRepository<Users, Integer> {
}
