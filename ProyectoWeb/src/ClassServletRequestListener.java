import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 */

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class ClassServletRequestListener implements ServletRequestListener{
	private final Logger log = LogManager.getRootLogger();
	/* (non-Javadoc)
	 * @see javax.servlet.ServletRequestListener#requestDestroyed(javax.servlet.ServletRequestEvent)
	 */
	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("paso por - ServletRequestListener - metodo - requestDestroyed -");
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletRequestListener#requestInitialized(javax.servlet.ServletRequestEvent)
	 */
	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("paso por - ServletRequestListener - metodo - requestInitialized -");
		
	}

}
