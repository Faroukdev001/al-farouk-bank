package com.faroukdev.alfaroukbank.repository;

import com.faroukdev.alfaroukbank.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    Boolean existsByEmail(String email);

}
