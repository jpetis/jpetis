

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
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
 * Servlet implementation class ServlteEmpleadoJSP
 */

public class ServlteEmpleadoJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final Logger log = LogManager.getRootLogger();
	EmployessServices es = new EmployessServices();
       
 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
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

		String s_id = request.getParameter("id");
		int id = Integer.parseInt(s_id);
		EmployessServices es = new EmployessServices();
		InterfacRecuperable iRecuperable = new EmpleadoHibertDao();
		es.setiRecuperable(iRecuperable);
		
		Employees emp = (Employees)es.leerEmpleado(id);
		if (emp!=null) {
			response.setContentType("text/html");
			request.setAttribute("empleadoBean", emp);
			request.getRequestDispatcher("/MostrarEmpleado.jsp").forward(request, response);
		}else{log.error("El número o carazter introducido es incorrecto");}
	}



}
