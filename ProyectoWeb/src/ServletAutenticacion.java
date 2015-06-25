

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class ServletAutenticacion
 */
public class ServletAutenticacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final Logger log = LogManager.getRootLogger();
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	log.debug("enteo en post");
	String nombre = req.getParameter("username");
	String psw = req.getParameter("psw");
	
	
	
	Connection conn = null;
	ResultSet rset = null;
	Statement stmt = null;
	String consulta = null;
	PrintWriter pw= null;
	try {
		consulta = "select * from users WHERE USER_NAME = '"+nombre+"' AND USER_PASS = '"+psw+"'";
		log.trace("consulta" + consulta);
		conn = Pool.getConnection();
		stmt = conn.createStatement();
		rset = stmt.executeQuery(consulta);
		System.out.println("que pasa con la sql" +nombre);
		if (rset.next())
		{ 	
			System.out.println("que pasa con rset.getString(nombre)");
			nombre = rset.getString(nombre);
			
			//psw = rset.getString("user_pass");
			
			log.trace("El usuario esta autenticado");
			//el usuario existe
		} else {
			nombre = "No existe";
			//el usuario no existe
			//TODO AÑADIR EL CÓDIGO NECSARIO PARA GENERAR EL MENSAJE DE SALIDA EN AMBOS CASOS
		}
		resp.setContentType("text/html");
		pw = resp.getWriter();
		pw.println(nombre);
//		pw.println(psw);
		Pool.liberarRecursos(conn, stmt, rset);

	} catch (Exception e) {
		log.error("fallo Exception ");
		e.printStackTrace();
	}
	
	
	
	
	}
	
       

}
