/**
 * 
 */
package modelo.services;

import modelo.persistencia.InterfacRecuperable;

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
