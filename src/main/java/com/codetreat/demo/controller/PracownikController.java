package com.codetreat.demo.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.codetreat.demo.model.ProjectModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codetreat.demo.model.PracownicyModel;
import com.codetreat.demo.service.PracownicyService;

@RestController
public class PracownikController {
    @Autowired
    PracownicyService pracownicyService;

    @RequestMapping("/")
    /*List<PracownicyModel> findAllEmployees() {
        return pracownicyService.findAllinProject(1);
    }*/
    ProjectModel findProject(){
        return pracownicyService.findProjectById(1);
    }
}
