package com.codetreat.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import com.codetreat.demo.service.PracownicyService;

@Controller
public class PController {
    @Autowired
    PracownicyService Service;

    @RequestMapping("/")
    String findAllEmployees(Model model) {
        model.addAttribute("project", Service.findProjectById(2));
        model.addAttribute("table",Service.findAllinProject(2));
        return "table";
    }
}
