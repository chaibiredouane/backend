package com.reception.receptionbackend.repository;

import com.reception.receptionbackend.model.Box;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoxRepository extends JpaRepository<Box,Integer> {
    Box findById(int id);
}
