/**
 * 
 */
package modelo.services;

import java.util.List;

import org.hibernate.Session;

import modelo.dominio.Departments;
import modelo.persistencia.SesionManager;

/**
 * @author Jaime Gpetis
 *
 * 
 */

public class DepartamentosService {
	
	public List<Departments> ob_depart(){
		Session ob_sesion = SesionManager.obtenerSesionNueva();
		
		return null;
		
	} 
	
}
