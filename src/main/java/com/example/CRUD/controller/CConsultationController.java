package com.example.CRUD.controller;

import com.example.CRUD.interfaces.IConsultation;
import com.example.CRUD.model.CConsultation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
        model.addAttribute("consult", new CConsultation());
        return "form";
    }
    @PostMapping("/form")
    public String saveConsult(@ModelAttribute CConsultation consult, RedirectAttributes redirectAttrs) {
        iConsultation.save(consult);
        redirectAttrs
                .addFlashAttribute("mensaje", "Agregado correctamente")
                .addFlashAttribute("clase", "success");
        return "redirect:/";
    }

    @PostMapping( "/delete")
    public String deleteConsult(@ModelAttribute CConsultation consultation, RedirectAttributes redirectAttrs) {
        redirectAttrs
                .addFlashAttribute("mensaje", "Eliminado correctamente")
                .addFlashAttribute("clase", "warning");
        iConsultation.deleteById(consultation.getId());
        return "redirect:/";
    }
}
