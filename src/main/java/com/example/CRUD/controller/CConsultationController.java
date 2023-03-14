package com.example.CRUD.controller;

import com.example.CRUD.interfaces.IConsultation;
import com.example.CRUD.model.CConsultation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

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
        model.addAttribute("consultation", new CConsultation());
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
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        Optional<CConsultation> consultation = iConsultation.findById(id);
        model.addAttribute("consultation", consultation);
        return "edit";
    }
    @PostMapping("/edit/{id}")
    public String updateConsultation(@PathVariable("id") int id, @ModelAttribute("consultation") CConsultation consultation) {
        iConsultation.save(consultation);
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String deleteConsultation(@PathVariable("id") int id) {
        iConsultation.deleteById(id);
        return "redirect:/";
    }
}
