import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 */

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class ClasseWeb1 extends HttpServlet{
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getParameter("nombre");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
			out.println("A llamado a doGet y paso mi nombre es ........."+req.getParameter("nombre"));
	System.out.println(req.getParameter("nombre"));
	
	}
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getParameter("nombre");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("A llamado a doPost y paso mi nombre es ........."+req.getParameter("nombre"));
		System.out.println(req.getParameter("nombre"));
		
		
	}
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#service(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("A llamado a service");
		super.service(arg0, arg1);
	}
}
