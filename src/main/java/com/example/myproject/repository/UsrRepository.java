package com.example.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.myproject.entity.Usr;

public interface UsrRepository extends JpaRepository<Usr, Long> {
    
}
