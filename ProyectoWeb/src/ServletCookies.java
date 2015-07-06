

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class ServletCookies
 */

public class ServletCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final Logger log = LogManager.getRootLogger();   
	
	
	/**
	 * compruebo sii la request trae la cookie que yo busco
	 * @param req
	 * @return devuelvo la cookie antigua si existia en la petición 
	 * y sino envio una nueva con valor 0
	 */
	private Cookie  existe_cookie(HttpServletRequest req,String nomCookie) {
		Cookie cookie = null;
		Cookie[] array_cookie = null;
		return cookie;
		
	} 
	/**CÓDIGO ERRONEO DE RECOGIDA DE COOKIES*/
//		int i = 0;
//		Cookie cookie_actu = null; 
//		String nomCookie = "micookie";
//		String valorCookie = "0";
//		//Busco existe alguna Cookie
//	
//			Cookie[] cookies = req.getCookies();//Si hay la recupero
//			//Recorro el Array de Cookies con un while para comprobar que trae cookie
//			while (i<cookies.length) {
//					i++;
//					cookie_actu = cookies[i];//si trae cookie la guardo en la variable
//					log.trace(" Nombre Cookie  " + cookie_actu.getName());
//					//me creo una cookie 
//					Cookie miCookie = new Cookie(nomCookie, valorCookie);
//				//si encuentra alguna la comparo y
//				//pregunto si la cookie -miCookie- es igual a la actual
//				if (miCookie.equals(cookie_actu)) {
//					Integer.parseInt(valorCookie);
//					valorCookie = valorCookie+1;
//					cookie_actu.getValue();
//				}else {
//					return miCookie;
//				}
//				
//				
//					
////			for (Cookie cookie : cookies) {
////				log.trace(cookie_actu.getName());
////			}
////			return ;
//			
//		}
//			return cookie_actu;
	
		/**METODO DE FIN CÓDIGO ERRONEO*/
			
		 
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public ServletCookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		existe_cookie(request).getName();
		existe_cookie(request).getValue();
		out.println(existe_cookie(request).getValue()+existe_cookie(request).getName());
		log.trace("Ver valores de la cookie",existe_cookie(request).getValue());

	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	/**
	 * 
	 */
	public Cookie exite(String nombre,String valor) {
		
		return null;
		// TODO Auto-generated method stub

	}

}
