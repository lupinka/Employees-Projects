package com.codetreat.demo.service;
import java.util.List;

import com.codetreat.demo.EmployeeRowMapper;
import com.codetreat.demo.ProjectRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codetreat.demo.model.EmployeeModel;
import com.codetreat.demo.model.ProjectModel;

@Service
public class EPService {
        @Autowired
        private JdbcTemplate jdbcTemplate;

        @Transactional(readOnly = true)
        public List<EmployeeModel> findAllinProject(int id) {
            return jdbcTemplate.query("select EmployeeID,EmployeeName\n" +
                            "from Project,Employee where Project.ProjectID=Employee.ProjectID and\n" +
                            "Project.ProjectID=?",
                    new Object[]{id}, new EmployeeRowMapper());
        }
        @Transactional(readOnly = true)
        public ProjectModel findProjectById(int id){
            return jdbcTemplate.queryForObject(
                    "select * from Project where ProjectID=?",
                    new Object[]{id}, new ProjectRowMapper());
        }
        @Transactional(readOnly = true)
        public List<ProjectModel> ProjectbyEmployeeById(int id) {
            return jdbcTemplate.query(
                    "select Project.ProjectID,ProjectName,startDate,endDate\n" +
                            "from Employee, Project where Project.ProjectID=Employee.ProjectID\n" +
                            "and Employee.EmployeeID=?",
                    new Object[]{id}, new ProjectRowMapper());
        }
    }