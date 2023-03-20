package com.example.CRUD.controller;

import com.example.CRUD.interfaces.IConsultation;
import com.example.CRUD.model.CConsultation;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.time.LocalDate;
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
        Optional<CConsultation> updateConsultation = iConsultation.findById(id);
        updateConsultation.ifPresent(c -> {
            c.setName(consultation.getName());
            c.setStack(consultation.getStack());
            c.setTitle(consultation.getTitle());
            c.setDescription(consultation.getDescription());
            iConsultation.save(c);
        });
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String deleteConsultation(@PathVariable("id") int id) {
        iConsultation.deleteById(id);
        return "redirect:/";
    }


}
