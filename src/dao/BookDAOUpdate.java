package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.ConnectionUtil;

public class EmployeeDAOUpdate {

	    public static void update(int id, String name) throws Exception {
        String sql = "update employee set name = ? where id = ?";	
        Connection con = ConnectionUtil.getConnection();
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(2, id);
        pst.setString(1, name);
        int rows = pst.executeUpdate();
        System.out.println("no of rows"+ rows);
        }
}