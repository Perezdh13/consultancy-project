package com.example.CRUD.controller;

import com.example.CRUD.interfaces.IConsultation;
import com.example.CRUD.model.CConsultation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping
public class CConsultationController {
    @Autowired
    private IConsultation iConsultation;

    private List<CConsultation> list() {
        return (List<CConsultation>) iConsultation.findAll();
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<CConsultation> consultations = list();
        model.addAttribute("consultations", consultations);
        return "index";
    }
}


