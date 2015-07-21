

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.ListView;

import modelo.dominio.Departments;
import modelo.persistencia.EmpleadoHibertDao;
import modelo.persistencia.InterfacRecuperable;
import modelo.persistencia.SesionManager;
import modelo.services.EmployessServices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Servlet implementation class ServletListaDepartamentos
 */

public class ServletListaDepartamentos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final Logger log = LogManager.getRootLogger();
	EmployessServices es = new EmployessServices();
       

    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	ServletContext sc = req.getServletContext();
    	SessionFactory sf = (SessionFactory) sc.getAttribute("sf");
    	Session session = sf.openSession();
    	log.trace("paso por la  sf.openSession()");
    	
    	String s_id = req.getParameter("id");
		int id = Integer.parseInt(s_id);
		
		InterfacRecuperable iRecuperable = new EmpleadoHibertDao();
		es.setiRecuperable(iRecuperable);
		
		Departments dep = (Departments) es.leerDepartamentos(id);
    	

    	}
    	
    

}
