package com.reception.receptionbackend.repository;

import com.reception.receptionbackend.model.NcInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NcInfoRepository extends JpaRepository<NcInfo,String> {
}
