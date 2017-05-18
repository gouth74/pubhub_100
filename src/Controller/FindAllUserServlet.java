package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.EmployeeDAO;
import dao.EmployeeDAOFindAll;
import dao.EmployeeDAOInsert;
import model.Employee;

@WebServlet("/FindAllAddEmployeeServlet")
public class FindAllEmployeeServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        PrintWriter out = response.getWriter();
	        out.append("Served at: ").append(request.getContextPath());
		        try {
			       List<Employee> list = EmployeeDAOFindAll.findAll();
			    for (Employee employee : list) {
				   out.println(employee.id + " " + employee.name );
			     }
		         } catch (Exception e) {
			       // TODO Auto-generated catch block
			       e.printStackTrace();
		}
		
	}
}
	
