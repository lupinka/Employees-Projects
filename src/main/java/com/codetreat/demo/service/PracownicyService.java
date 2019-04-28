package com.codetreat.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codetreat.demo.entity.PracownikEntity;
import com.codetreat.demo.repository.PracownikRepository;

@Service
public class PracownicyService {
    @Autowired
    PracownikRepository Repo;

    public List<PracownikEntity> getAll() {
        return Repo.getAll();
    }
}
