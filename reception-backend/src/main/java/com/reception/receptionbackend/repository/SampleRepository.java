package com.reception.receptionbackend.repository;

import com.reception.receptionbackend.model.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<Sample,Integer> {
    Sample findById(int id);
}
