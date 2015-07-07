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
public class DepartamentosServices {
	//Atributo
	private Departments departamentoDao;
	//me creo una lista de departamentos
	List<Departments> obtener_depart(){
		//obtengo una session
		Session ob_sesion = SesionManager.obtenerSesionNueva();
		
		return obtener_depart();}
	
	
	
	

}
