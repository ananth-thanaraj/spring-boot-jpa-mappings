package com.jpa.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.model.Users;

public interface UserInterface extends JpaRepository<Users, Integer> {

}
