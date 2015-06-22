/**
 * 
 */
package modelo.persistencia.dao;

import org.hibernate.Session;



/**
 * @author Jaime Gpetis
 *
 * 
 */
public class SuperClassDao {
	/**
	 * 
	 */
	private static Session session;
	/**
	 * @return the session
	 */
	public Session getSession() {
		return session;
	}
	/**
	 * @param session the session to set
	 */
	public void setSession(Session session) {
		this.session = session;
	}

}
