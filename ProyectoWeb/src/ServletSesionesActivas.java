

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;

/**
 * Servlet implementation class ServletSesionesActivas
 */

public class ServletSesionesActivas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final Logger log = LogManager.getRootLogger();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSesionesActivas() {
        super();
        // TODO Auto-generated constructor stub
    }
    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	PrintWriter pw = resp.getWriter();
    	ServletContext sc = getServletContext();
    	log.trace("por que no entra doGet ServletSesionesActivas");
    	try {
    	  	HashMap map = (HashMap) sc.getAttribute("map_sesiones");
        	HttpSession s = null;
        	
        	Iterator it = map.entrySet().iterator();
        	Map.Entry e = null;
        	while (it.hasNext()) {
    			e = (Entry) it.next();
    			log.trace("Entro en el while" + e.getKey()+e.getValue());
    			log.debug((Marker) e.getKey(), e.getValue());
    			log.trace((Marker) e.getKey(),e.getValue());
    		}
        	if(map.isEmpty()){
        		pw.println("No hay sesiones activas");
        	}
			
		} catch (Exception e) {
			log.error("catch (Exception e");
		}
  
//    	Iterator its = map.values().iterator();
//    	while (its.hasNext()) {
//			s = (HttpSession) it.next();
//			s.getId();
//			s.getAttribute("nombre");
//		}
    	
    	
    }

}
