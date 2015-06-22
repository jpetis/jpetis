

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dominio.Employees;
import modelo.persistencia.EmpleadoHibertDao;
import modelo.persistencia.InterfacRecuperable;
import modelo.persistencia.SesionManager;
import modelo.services.EmployessServices;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sun.media.sound.SF2GlobalRegion;

/**
 * 
 */

public class ConexionHibernate extends HttpServlet {
	private static final long serialVersionUID = 1L;
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
		String s_id = request.getParameter("numero");
		int id = Integer.parseInt(s_id);
		EmployessServices es = new EmployessServices();
		InterfacRecuperable iRecuperable = new EmpleadoHibertDao();
		es.setiRecuperable(iRecuperable);
		
		Employees emp = (Employees)es.leerEmpleado(id);
		response.setContentType("text/NewFile.html");
		PrintWriter pw = response.getWriter();
		pw.println(emp.getFirstName());
		
	
	
		
	}

	/**
	 *
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc =  request.getServletContext();
		SessionFactory sf = (SessionFactory) sc.getAttribute("sf");
		Session session = null;
		session = sf.openSession();
	}

	/**
	 *
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
