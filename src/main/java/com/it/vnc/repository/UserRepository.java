package com.it.vnc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.vnc.models.User;

public interface UserRepository extends JpaRepository<User, String> {

}
