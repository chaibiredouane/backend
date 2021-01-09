package com.reception.receptionbackend.repository;

import com.reception.receptionbackend.model.NcData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NcDataRepository extends JpaRepository<NcData,Long> {
    List<NcData> findById(long id);

   @Query(value = "SELECT ID, SAMPLE_ID, NC_CODE, STATUS, USER_COMMENT, CREATE_DATE, CREATE_BY FROM CONREP_NON_CONFORMITY  WHERE (SAMPLE_ID = :param1 OR :param1=0)  AND (NC_CODE = :param2 OR :param2 IS NULL)",nativeQuery = true)
   List<NcData>  findByParam(@Param("param1") long sample_id,@Param("param2") String ncCode);

}
