

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.FilterChain;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dominio.Employees;
import modelo.persistencia.EmpleadoHibertDao;
import modelo.persistencia.InterfacRecuperable;

import modelo.services.EmployessServices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;




/**
 * 
 */

public class ConexionHibernate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final Logger log = LogManager.getRootLogger();
	EmployessServices es = new EmployessServices();
       
    /**
     *
     */
    public ConexionHibernate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 *
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	}

	/**
	 *
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Antes de doGet(HttpServletRequest request");
		ServletContext sc =  request.getServletContext();
		SessionFactory sf = (SessionFactory) sc.getAttribute("sf");
		Session session = sf.openSession();
		log.trace("paso por la  sf.openSession()");
		
		int n_petis = (int) sc.getAttribute("contador");
		n_petis++;
		sc.setAttribute("contador", n_petis);

		String s_id = request.getParameter("numero");
		int id = Integer.parseInt(s_id);
		EmployessServices es = new EmployessServices();
		InterfacRecuperable iRecuperable = new EmpleadoHibertDao();
		es.setiRecuperable(iRecuperable);
		
		Employees emp = (Employees)es.leerEmpleado(id);
		if (emp!=null) {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			pw.println(emp.getFirstName());	
		}else{log.error("El número o carazter introducido es incorrecto");}
			
		
//		ServletContextEvent servletContextEvent = null;
//		ServletContext contador = servletContextEvent.getServletContext();
		
		
	}

	/**
	 *
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
