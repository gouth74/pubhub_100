package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.ConnectionUtil;

public class EmployeeDAODelete {

	    public static void delete(String name) throws Exception {
        String sql = "delete from employee where  name = ?";
	    Connection con = ConnectionUtil.getConnection();
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, name);
        int rows = pst.executeUpdate();
        System.out.println("no of rows"+ rows);
        }
}