package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.ConnectionUtil;

public class EmployeeDAOInsert {

	    public static void insert(String name) throws Exception {
        String sql = "insert into employee ( name ) values ( ? ) "; 
        Connection con = ConnectionUtil.getConnection();
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, name);
        int rows = pst.executeUpdate();
        System.out.println("no of rows"+ rows);
        }
}