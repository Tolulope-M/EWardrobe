package com.morenike.ew_ardrobe.repository;

import com.morenike.ew_ardrobe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
        User findByEmail(String email);
}
