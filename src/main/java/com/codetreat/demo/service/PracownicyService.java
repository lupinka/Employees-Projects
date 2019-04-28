package com.codetreat.demo.service;
import java.util.List;

import com.codetreat.demo.PracownicyRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codetreat.demo.model.PracownicyModel;

@Service
public class PracownicyService {
        @Autowired
        private JdbcTemplate jdbcTemplate;

        @Transactional(readOnly = true)
        public List<PracownicyModel> findAll() {
            return jdbcTemplate.query("select * from Employee",
                    new PracownicyRowMapper());
        }

        @Transactional(readOnly = true)
        public PracownicyModel findEmployeeById(int id) {
            return jdbcTemplate.queryForObject(
                    "select * from Employee where EmployeeID=?",
                    new Object[]{id}, new PracownicyRowMapper());
        }
    }