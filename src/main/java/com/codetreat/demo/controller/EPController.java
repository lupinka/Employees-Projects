package com.codetreat.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import com.codetreat.demo.service.EPService;

@Controller
public class EPController {
    @Autowired
    EPService Service;

    @RequestMapping("/")
    String findAllEmployees(Model model) {
        int whichProject=1;
        model.addAttribute("project", Service.findProjectById(whichProject));
        model.addAttribute("table", Service.findAllinProject(whichProject));
        return "table";
    }
}
