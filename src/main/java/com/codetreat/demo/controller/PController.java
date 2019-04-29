package com.codetreat.demo.controller;

import com.codetreat.demo.model.ProjectModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import com.codetreat.demo.model.PracownicyModel;
import com.codetreat.demo.service.PracownicyService;

@Controller
public class PController {
    @Autowired
    PracownicyService Service;

    @RequestMapping("/")
    String findAllEmployees(Model model) {
        model.addAttribute("table",Service.findAllinProject(1));
        //return Service.findProjectById(1);
        return "table";
    }
    /*List<PracownicyModel> findAllEmployees() {
        return Service.findAllinProject(1);
    }*/
    ProjectModel findProject(Model model) {
        model.addAttribute("table",Service.findProjectById(1));
        return Service.findProjectById(1);
    }
}
