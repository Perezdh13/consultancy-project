package com.example.CRUD.interfaces;

import com.example.CRUD.model.CConsultation;
import org.springframework.data.repository.CrudRepository;

public interface IConsultation extends CrudRepository<CConsultation, Integer> {
    CConsultation findByName(String s);

}
