

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletError
 */

public class ServletError extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletError() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		Throwable excepcion = (Throwable) request.getAttribute("javax.servlet.error.exception");
	    Integer codigoHTTP = (Integer) request.getAttribute("javax.servlet.error.status_code");
	    String nombreServlet = (String) request.getAttribute("javax.servlet.error.servlet_name");
	    if (null == nombreServlet ) {nombreServlet = "Desconocido";}
	    String uriPedida = (String) request.getAttribute("javax.servlet.error.request_uri");
	    if (null== uriPedida ){uriPedida = "Desconocida";}
	    response.sendRedirect("/ProyectoWeb/PaginaErrores.html");
	    
	    
	    
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
