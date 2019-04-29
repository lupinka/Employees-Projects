package com.codetreat.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.codetreat.demo.model.ProjectModel;
import org.springframework.jdbc.core.RowMapper;

public class ProjectRowMapper implements RowMapper<ProjectModel> {
    @Override
    public ProjectModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        ProjectModel projekt = new ProjectModel();
        projekt.setProjectID(rs.getInt("ProjectID"));
        projekt.setProjectName(rs.getString("ProjectName"));
        projekt.setStartDate(rs.getString("StartDate"));
        projekt.setEndDate(rs.getString("EndDate"));
        return projekt;
    }
}
