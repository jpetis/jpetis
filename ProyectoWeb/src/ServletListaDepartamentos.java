

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.ListView;

import modelo.dominio.Departments;
import modelo.persistencia.SesionManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

/**
 * Servlet implementation class ServletListaDepartamentos
 */

public class ServletListaDepartamentos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final Logger log = LogManager.getRootLogger();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletListaDepartamentos() {
      super();
      
    }
    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    		Session session = SesionManager.obtenerSesionNueva();
    		List<Departments> l_d =  session.createSQLQuery("select * from Departments").addEntity(Departments.class).list();
    		Departments d = null;
    		PrintWriter pw = resp.getWriter();
    		pw.println("<select>");
    		Iterator it = l_d.iterator();
    		while (it.hasNext()) {
				d = (Departments) it.next();
				pw.println("<option value = "+ d.getDepartmentId()+">"+ d.getDepartmentName()+"</option>");
			}
    		pw.println("<select>");
    		resp.setContentType("text/html");
    		RequestDispatcher rd = req.getRequestDispatcher("/ServletSesionesActivas");
    		rd.include(req, resp);
    	}
    	
    

}
