package com.reception.receptionbackend.repository;

import com.reception.receptionbackend.model.NcData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NcDataRepository extends JpaRepository<NcData,Long> {
}
