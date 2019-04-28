package com.codetreat.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.codetreat.demo.model.PracownicyModel;

public class PracownicyRowMapper implements RowMapper<PracownicyModel>{

    @Override
    public PracownicyModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        PracownicyModel pracownik = new PracownicyModel();
        pracownik.setEmployeeID(rs.getInt("EmployeeID"));
        pracownik.setEmployeeName(rs.getString("EmployeeName"));
        pracownik.setProjectID(rs.getInt("ProjectID"));
        return pracownik;
    }
}
