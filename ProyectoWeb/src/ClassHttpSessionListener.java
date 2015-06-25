import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;
import com.sun.org.apache.xpath.internal.axes.HasPositionalPredChecker;

/**
 * 
 */

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class ClassHttpSessionListener implements HttpSessionListener {
	private final Logger log = LogManager.getRootLogger();
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionListener#sessionCreated(javax.servlet.http.HttpSessionEvent)
	 * LE PASO AL METODO EL MAPA DE HttpSession creado en ServletContex
	 */
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		//OBTENGO LA SESIÓN
		HttpSession sesion = arg0.getSession();
		//COJO UNA REFERENCIA DEL ServletContext 
		//DECLARO UN ServletContext Y LE PASO LA SESIÓN OSEA LA METO EN EL ServletContext 
		ServletContext sc = sesion.getServletContext();
		//SACO DEL ServletContext LA sesion Y LA METO EN EL HAS 
		HashMap<String,HttpSession> hmp = (HashMap<String, HttpSession>) sc.getAttribute("map_sesiones");
		hmp.put(sesion.getId(), sesion);
		log.trace("Peticion sin sesesion asociada"+sesion.getId());
		System.out.println("paso por - HttpSessionListener - metodo - sessionCreated -");
//		log.trace("se a generado una session con el id" + arg0.getSession().getId());
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionListener#sessionDestroyed(javax.servlet.http.HttpSessionEvent)
	 */
	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		//OBTENGO LA SESIÓN
		HttpSession sesion = arg0.getSession();
		//CREO UNA VARIABLE PARA RECOGER EL id DE LA session
		String id = sesion.getId();
		//CREO UN MAPA DE sessiones COMO EL QUE TENGO EN ServletContex Y LE PASO
		HashMap<String, HttpSession> map =
				(HashMap<String, HttpSession>) sesion.getServletContext().getAttribute("map_sesiones");
		map.remove(id);
		System.out.println("paso por - HttpSessionListener - metodo -sessionDestroyed -");
//		log.trace("Se ha destruido la sesion con el id"+ arg0.getSession().getId());
		
	}

}
