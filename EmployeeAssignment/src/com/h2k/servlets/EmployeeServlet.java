package com.h2k.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	


    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Float salary = (Float.parseFloat(request.getParameter("salary")));
		
		PrintWriter out = response.getWriter();
		
		try {
			  Class.forName("com.mysql.jdbc.Driver");

			Connection mycon;
			mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "sairam123");
			
			//create a statement
			Statement myStmt = mycon.createStatement();
			
			//Execute SQL query
			ResultSet rs = myStmt.executeQuery("select * from employees where salary>" + salary);
			out.println("<html> <body>");
			out.println("<table border=1");
			out.println("<tr>");
			out.println("<th>Employee Id </th>");
			out.println("<th>First Name</th>");
			out.println("<th>Last Name</th>");
			out.println("</tr>");
			//process the result set
			while (rs.next()){
				out.println("<tr><td>" + rs.getInt("id") + "</td><td>"+
						rs.getString("first_name")+"</td><td>"+rs.getString("last_name") + "</td></tr>");
				
			}
			
			out.println("</table></body></html>");
			
			rs.close();
			myStmt.close();

			mycon.close();
					
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}
	

}
