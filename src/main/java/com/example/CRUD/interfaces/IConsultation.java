package com.example.CRUD.interfaces;

import com.example.CRUD.model.CConsultation;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IConsultation extends CrudRepository<CConsultation, Integer> {

}
