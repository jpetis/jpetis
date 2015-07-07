/**
 * 
 */
package modelo.persistencia;

import modelo.dominio.Departments;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class DepartamentosHibernateDao implements InterfacRecuperable{

	/**
	 * 
	 */
	public DepartamentosHibernateDao() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see modelo.persistencia.InterfacRecuperable#leerEmpleado(int)
	 */
	@Override
	public Object leerEmpleado(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see modelo.persistencia.InterfacRecuperable#leerDepartamentos(int)
	 */
	@Override
	public Object leerDepartamentos(int id) {
		Session session = null;
		Transaction transaction = null;
		Departments departments = null;
		session = SesionManager.obtenerSesionNueva();
		departments = (Departments) session.get(Departments.class, id);
		
		return departments;
	}
}
