package com.example.CRUD.interfaces;

import com.example.CRUD.model.CConsultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISearchCconsultation extends JpaRepository<CConsultation, Long> {

    @Query(value = "SELECT * FROM consultation WHERE consultation.stack = %:q% AND consultation.activo =true", nativeQuery = true)
    List<CConsultation>findByTitle(@Param("q")String q);
}
