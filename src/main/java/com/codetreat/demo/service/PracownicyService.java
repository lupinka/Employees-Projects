package com.codetreat.demo.service;
import java.util.List;

import com.codetreat.demo.PracownicyRowMapper;
import com.codetreat.demo.ProjectRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codetreat.demo.model.PracownicyModel;
import com.codetreat.demo.model.ProjectModel;

@Service
public class PracownicyService {
        @Autowired
        private JdbcTemplate jdbcTemplate;

        @Transactional(readOnly = true)
        public List<PracownicyModel> findAllinProject(int id) {
            return jdbcTemplate.query("select EmployeeID,EmployeeName\n" +
                            "from Project,Employee where Project.ProjectID=Employee.ProjectID and\n" +
                            "Project.ProjectID=?",
                    new Object[]{id}, new PracownicyRowMapper());
        }
        @Transactional(readOnly = true)
        public ProjectModel findProjectById(int id){
            return jdbcTemplate.queryForObject(
                    "select * from Project where ProjectID=?",
                    new Object[]{id}, new ProjectRowMapper());
        }
        @Transactional(readOnly = true)
        public PracownicyModel findEmployeeById(int id) {
            return jdbcTemplate.queryForObject(
                    "select * from Employee where EmployeeID=?",
                    new Object[]{id}, new PracownicyRowMapper());
        }
    }