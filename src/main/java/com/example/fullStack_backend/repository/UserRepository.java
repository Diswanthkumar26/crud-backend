package com.example.fullStack_backend.repository;

import com.example.fullStack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
