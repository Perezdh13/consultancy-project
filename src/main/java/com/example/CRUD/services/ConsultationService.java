package com.example.CRUD.services;
import com.example.CRUD.interfaces.ISearchCconsultation;
import com.example.CRUD.model.CConsultation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationService {
    @Autowired
    ISearchCconsultation iSearchCconsultation;

   public  List<CConsultation> findByStack(String stack){
       return iSearchCconsultation.findByStack(stack);
   };
}
