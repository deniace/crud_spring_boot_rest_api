package com.deni.rest1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deni.rest1.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
