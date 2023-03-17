package com.example.CRUD.controller;

import com.example.CRUD.interfaces.ISearchCconsultation;
import com.example.CRUD.model.CConsultation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CSearchConsultationController {

    @Autowired
    private ISearchCconsultation iSearchCconsultation;

    @GetMapping("/search")
    public String searchByStack(@RequestParam(value = "stack", required = false)String stack, Model model){
       if (stack == null || stack.isEmpty()){
           return "redirect:/";
       }
        List<CConsultation> consultation = iSearchCconsultation.findByStack(stack);
        model.addAttribute("consultation", consultation);
        return "index";
    }
}
