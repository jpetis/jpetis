/**
 * 
 */
package modelo.services;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import modelo.dominio.Employees;
import modelo.persistencia.InterfacRecuperable;
import modelo.persistencia.SesionManager;
import modelo.persistencia.dao.EmpleadoHibertDao;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class EmployessServices {
	private InterfacRecuperable iRecuperable;

	/**
	 * @param iRecuperable the iRecuperable to set
	 */
	public void setiRecuperable(InterfacRecuperable iRecuperable) {
		this.iRecuperable = iRecuperable;
	}
	/**
	 * 
	 */
	public Object leerEmpleado(int id) {
		Object obj_emp = null;
		obj_emp = this.iRecuperable.leerEmpleado(id);
		return obj_emp;
	
		

	}



}
