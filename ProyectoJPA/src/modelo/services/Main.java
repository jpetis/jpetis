/**
 * 
 */
package modelo.services;


import org.hibernate.Session;

import modelo.dominio.Employees;
import modelo.persistencia.InterfacRecuperable;
import modelo.persistencia.dao.EmpleadoHibertDao;
import modelo.persistencia.dao.EmpleadoJDBCDao;
import modelo.persistencia.dao.EmpleadoJPADao;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class Main {
	
		public static void main(String[] args) {
			
			EmployessServices es = new EmployessServices();
			
			InterfacRecuperable objeto_hibernate = new EmpleadoHibertDao();
			InterfacRecuperable objeto_jdbc = new EmpleadoJDBCDao();
			InterfacRecuperable objeto_jpa = new EmpleadoJPADao();
			
			es.setiRecuperable(objeto_hibernate);
			System.out.println(es.leerEmpleado(150));
			
			
			
//			es.setiRecuperable(objeto_jdbc);
//			es.leerEmpleado(150);
			
//			es.setiRecuperable(objeto_jpa);
//			es.leerEmpleado(150);
			
			
			
			
			
		}
	
	}

