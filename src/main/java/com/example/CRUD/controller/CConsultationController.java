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

public class CConsultationController {
    @Autowired
    private IConsultation iConsultation;

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("consultation", iConsultation.findAll());
        return "index";
    }
    @GetMapping("/form")
    public String form(Model model) {
        return "form";
    }
}
