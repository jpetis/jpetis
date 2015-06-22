import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import modelo.persistencia.SesionManager;

import org.hibernate.Session;
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
		ServletContext sc =   servletContextEvent.getServletContext();
		SessionFactory sf = SesionManager.getSessionFactory();
		sc.setAttribute("sf", sf);
		
	}

}
