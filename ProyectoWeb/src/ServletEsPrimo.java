

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletEsPrimo
 */
@WebServlet("/ServletEsPrimo")
public class ServletEsPrimo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEsPrimo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
