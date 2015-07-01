
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dominio.Departments;
import modelo.persistencia.SesionManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.pattern.IntegerPatternConverter;
import org.hibernate.Session;

/**
 * Servlet implementation class Servletx
 */

public class Servletx extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final Logger log = LogManager.getRootLogger();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servletx() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		int num_primo = 0;
		PrintWriter pw = response.getWriter();
		String tex_fil = request.getParameter("numero");


		// while ((contador!=num_primo)&&(contador<=num_primo)){

		if (isNumeric(tex_fil) == true) {
			
			num_primo = Integer.parseInt(tex_fil);

			if (esPrimo(num_primo) == false) {
				int contador = 2;
				contador++;
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				String titulo = "Tu si eres un primo";
				out.println("<html>\n"
						+ "<head><title>"
						+ titulo
						+ "</title></head>\n"
						+ "<body bgcolor=\"#f0f0f0\">\n"
						+ "<h1 align=\"center\">"
						+ titulo
						+ "</h1>\n"
						+ "<<img alt=\"Mal..Mal..mal..\" src=\"locas-imagenes-1.jpg\">");

			} else {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				String titulo = "Es primo";
				out.println("<html>\n"
						+ "<head><title>"
						+ titulo
						+ "</title></head>\n"
						+ "<body bgcolor=\"#f0f0f0\">\n"
						+ "<h1 align=\"center\">"
						+ titulo
						+ "</h1>\n"
						+ "<img alt=\"Bien..Bien..bien\" src=\"bebe.jpg.525.408.thumb.jpg\">");
			}
		}//NO ES UN NÚMERO
		else {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String titulo = "te  voy a poner dos velas negras";
			String respuesta = "Pon números pedazo de tigreton";
			out.println("<html>\n" + "<head><title>" + titulo
					+ "</title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n"
					+ "<h1 align=\"center\">" + titulo + "</h1>\n"
					+ "<h1 align=\"center\">" + respuesta + "</h1>\n"
					+ "<<img alt=\"Mal..Mal..mal..\" src=\"La brja lola.jpg\">");
		}
		
		/**-------------------------COOKIES---------------------------------*/
		/**Eviamos una cookie para controlar el número de veces que el mismo
		 * cliente entra y no dejarle pasar mas de tres veces, con un limite diariario
		 * de uso de solo tre veces al día
		**/
	
//		Cookie cookie = new Cookie(“micokie",“21/12/14 15:35"); 
//		cookie.setMaxAge(60*60); //1 hora
//		response.addCookie(cookie);  //MANDO UNA COOKIE
//		/**----------------------------------------------------------------*/
//		Cookie[] cookies = request.getCookies(); //LA RECUPERO
//		        if (cookies != null) {
//		             if (cookies[0].getName().equals(“micokie")) {
//		                    loginCookie = cookie;
//		                }
//		            }
//		        }
//		/**------------------------------------------------------------------------*/
//		         //ASÍ, HAGO QUE EL NAVEGADOR LA ELIMINE
//		            cookie.setMaxAge(0); //Y NO ME LA VUELVA A MANDAR
//		            response.addCookie(cookie);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	
		
	}
	

	public static boolean esPrimo(int numero) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != numero)) {
			if (numero % contador == 0)
				primo = false;
			contador++;
		}
		return primo;
	}

	/**
	 * 
	 */
	private boolean isNumeric(String caja_texto) {
		try {
			Integer.parseInt(caja_texto);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}
}
