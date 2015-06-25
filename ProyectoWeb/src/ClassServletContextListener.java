import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSession;

import modelo.persistencia.SesionManager;

import org.apache.catalina.Session;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;

/**
 * 
 */

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class ClassServletContextListener implements ServletContextListener {
	private final Logger log = LogManager.getRootLogger();
	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		System.out.println("paso por - ServletContextListener - metodo - requestDestroyed -");
		
		ServletContext sc =   servletContextEvent.getServletContext();
		try {
			SessionFactory sf = (SessionFactory) sc.getAttribute("sf");
			if (sf!=null) {
				sf.close();	
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		
		System.out.println("paso por - ServletContextListener - metodo -contextInitialized -");
		log.trace("Han entrado paso por - ServletContextListener - metodo -contextInitialized -");
		Map<String, HttpSession> reg_sessions = new HashMap<String,HttpSession>();
		
		ServletContext sc =   servletContextEvent.getServletContext();
		SessionFactory sf = SesionManager.getSessionFactory();
		sc.setAttribute("sf", sf);
		
		int n_petis = 0;
		sc.setAttribute("contador", n_petis);
		sc.setAttribute("map_sesiones", reg_sessions);	
		
		
	}

}
