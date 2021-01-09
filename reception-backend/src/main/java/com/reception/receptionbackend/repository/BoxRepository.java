package com.reception.receptionbackend.repository;

import com.reception.receptionbackend.model.Box;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoxRepository extends JpaRepository<Box,Integer> {
    Box findById(int id);

    @Query(value = "SELECT ID, CES_ID, EXPECTED_DELIVERY_DATE, BOX_BARCODE, SCAN_DATETIME, SCAN_BY, STATUS, OPENED_BY, TEMP_STATUS, NB_FORMS, IMPORT_PROCESS_ID FROM CONREP_BOX  WHERE (CES_ID = :param1 OR :param1 IS NULL)  AND (BOX_BARCODE = :param2 OR :param2 IS NULL)",nativeQuery = true)
    List<Box> findByParam(@Param("param1") String cesId, @Param("param2") String barcode);
}
