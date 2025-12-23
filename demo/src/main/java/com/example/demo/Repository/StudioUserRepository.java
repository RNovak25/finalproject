package com.example.demo.Repository;

import com.example.demo.Entity.StudioUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudioUserRepository extends JpaRepository<StudioUser, Long> {
    StudioUser findByUsername(String username);
}
