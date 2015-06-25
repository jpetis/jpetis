/**
 * 
 */
package modelo.persistencia.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import modelo.dominio.Employees;
import modelo.persistencia.InstruccionesSQL;
import modelo.persistencia.InterfacRecuperable;
import modelo.persistencia.SesionManager;
import modelo.services.EmployessServices;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class EmpleadoHibertDao implements InterfacRecuperable {
	/**
	 * 
	 */
	public EmpleadoHibertDao() {
	
		
	}
	/* (non-Javadoc)
	 * @see modelo.persistencia.InterfacRecuperable#leerEmpleado(int)
	 */
	@Override
	public Object leerEmpleado(int id) {
		
		Session session = null;
		Transaction transaction = null;
		Employees empleado = null;
		session = SesionManager.obtenerSesionNueva();
		empleado = (Employees) session.get(Employees.class, id);
		return empleado;
		
	}


}
