package com.reception.receptionbackend.repository;

import com.reception.receptionbackend.model.ExpectedSample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpectedSampleRepository extends JpaRepository<ExpectedSample,Integer> {
    ExpectedSample findById(int id);

   /* @Query("SELECT id,ces_id,sample_barcode,container_type,collection_type,collect_date,collect_time,time_elapsed,constances_id,late_status FROM sample WHERE ces_id > :param1")
    List<Sample> testQuery(@Param("param1") int ces_id);
    */
}
