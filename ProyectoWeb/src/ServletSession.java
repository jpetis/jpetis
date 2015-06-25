

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class ServletSession
 */

public class ServletSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final Logger log = LogManager.getRootLogger();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSession() {
        super();
        // TODO Auto-generated constructor stub
    }
    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    try {
    	HttpSession s1 = req.getSession(false);
    		
    	if (null==s1) {
    		s1 = req.getSession();
    		log.trace("Peticion sin sesesion asociada");
		}else {
			log.trace("La sesion ya existe");
		}
    	
	} catch (Exception e) {
		
	}	
    	
    	
    }

}
