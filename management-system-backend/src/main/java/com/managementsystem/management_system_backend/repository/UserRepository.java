package com.managementsystem.management_system_backend.repository;

import com.managementsystem.management_system_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {



}
