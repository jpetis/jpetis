

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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



/**
 * 
 */

public class Conexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final Logger log = LogManager.getRootLogger();
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
		String valor = getServletConfig().getInitParameter("n2");
		System.out.println("Valor s config = " + valor);
		String valor2 = getServletContext().getInitParameter("9");
		System.out.println("Valor s context = " + valor2);
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
			}Pool.liberarRecursos(conn, stmt, rset);
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
