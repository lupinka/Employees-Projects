package com.codetreat.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codetreat.demo.entity.PracownikEntity;
import com.codetreat.demo.service.PracownicyService;

@RestController
public class PracownikController {
    @Autowired
    PracownicyService pracownicyService;

    @RequestMapping(value = "/")
    public List<PracownikEntity> pracownicy() {
        return pracownicyService.getAll();
    }


}
