

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Elige_tu_camino
 */

public class ServletAnalizarNumPrimo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAnalizarNumPrimo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num_primo = 0;
		PrintWriter pw = response.getWriter();
		String tex_fil = request.getParameter("numero");
         if (isNumeric(tex_fil) == true) {
			
			num_primo = Integer.parseInt(tex_fil);

			if (esPrimo(num_primo) == false) {
				response.sendRedirect("ServletNoPrimo");
			

			} else {
				response.sendRedirect("ServletEsPrimo");
			
			}
		}//NO ES UN NÚMERO
		else {
			response.sendRedirect("ServletErrorFormato");
	
		}
		}

		
	public static boolean esPrimo(int numero) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != numero)) {
			if (numero % contador == 0)
				primo = false;
			contador++;
		}
		return true;
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
