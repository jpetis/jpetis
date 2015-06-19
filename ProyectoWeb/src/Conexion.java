

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * 
 */

public class Conexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn = null;
	ResultSet rset = null;
	Statement stmt = null;
    /**
     *
     */
    public Conexion() {
        super();
       
    }

	/**
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s_id = request.getParameter("numero");
		int id = Integer.parseInt(s_id);
		String nombre = null;
		PrintWriter pw= null;
		try {
			conn = Pool.getConnection();
			stmt = conn.createStatement();
			rset = stmt.executeQuery("SELECT * FROM EMPLOYEES WHERE  EMPLOYEE_ID = "+id);
			if (rset.next()) {
				nombre = rset.getString("first_name");
				
			}else {
				nombre = "No existe";
			}
		response.setContentType("text/html");
		pw = response.getWriter();
		pw.println(nombre);
			
		} catch (SQLException e) {
			pw.println("Hay un error en la consulta");
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 *
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	

}
