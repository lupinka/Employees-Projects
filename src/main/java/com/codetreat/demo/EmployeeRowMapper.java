package com.codetreat.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.codetreat.demo.model.EmployeeModel;

public class EmployeeRowMapper implements RowMapper<EmployeeModel>{

    @Override
    public EmployeeModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        EmployeeModel pracownik = new EmployeeModel();
        pracownik.setEmployeeID(rs.getInt("EmployeeID"));
        pracownik.setEmployeeName(rs.getString("EmployeeName"));
        return pracownik;
    }
}
