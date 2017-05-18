package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import model.Employee;
import util.ConnectionUtil;

public class EmployeeDAOFindAll {

	    	public static List<Employee>findAll() {
		        String sql = "select id, NAME from employee";
		        System.out.println("FindAll:" + sql);
		        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
				List<Employee> list = jdbcTemplate.query(sql, (rs, rowNum) -> {
		            Employee emp = new Employee();
		            emp.id = rs.getInt("id");
		            emp.name = rs.getString("name");
		            return emp;
		        });
		        return list;
            }
}