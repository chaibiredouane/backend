package com.reception.receptionbackend.repository;

import com.reception.receptionbackend.model.DictionaryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DictionaryRepository extends JpaRepository<DictionaryModel,String> {
    @Query(value = "SELECT NC_CODE value, NC_DISPLAY label FROM CONREP_NC_INFO WHERE IS_ACTIVE=1  ",nativeQuery = true)
    List<DictionaryModel> getNcCode();

    @Query(value = "SELECT NC_CODE value, NC_DISPLAY label FROM CONREP_NC_INFO WHERE IS_ACTIVE=1 EXCEPT SELECT I.NC_CODE value ,I.NC_DISPLAY label  FROM CONREP_NON_CONFORMITY as NC JOIN CONREP_NC_INFO as I ON NC.NC_CODE=I.NC_CODE WHERE SAMPLE_ID= :param1 OR :param1=0 ",nativeQuery = true)
    List<DictionaryModel> getNcCodeWithId(@Param("param1") long sample_id);
}
