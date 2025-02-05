package com.example.springsecurity2.repo;

import com.example.springsecurity2.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String name);
}