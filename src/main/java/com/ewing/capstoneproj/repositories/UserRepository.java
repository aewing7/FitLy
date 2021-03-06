package com.ewing.capstoneproj.repositories;

import com.ewing.capstoneproj.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.email = ?1")
        //find user by email
    User findByEmail(String email);
}
