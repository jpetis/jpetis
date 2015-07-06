/**
 * 
 */
package modelo.persistencia.dao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.persistencia.InterfacRecuperable;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class EmpleadoJPADao implements InterfacRecuperable{
	
	/* (non-Javadoc)
	 * @see modelo.persistencia.InterfacRecuperable#leerEmpleado(int)
	 */
	@Override
	public Object leerEmpleado(int n) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see modelo.persistencia.InterfacRecuperable#leerDepartamentos(int)
	 */
	@Override
	public Object leerDepartamentos(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
