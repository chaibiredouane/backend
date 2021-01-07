package com.reception.receptionbackend.repository;

import com.reception.receptionbackend.model.NcCondition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NcConditionRepository extends JpaRepository<NcCondition,String> {
}
