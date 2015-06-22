import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 
 */

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class ClassHttpSessionListener implements HttpSessionListener {

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionListener#sessionCreated(javax.servlet.http.HttpSessionEvent)
	 */
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("paso por - HttpSessionListener - metodo - sessionCreated -");
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionListener#sessionDestroyed(javax.servlet.http.HttpSessionEvent)
	 */
	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("paso por - HttpSessionListener - metodo -sessionDestroyed -");
		
	}

}
