/**
 * 
 */
package modelo.persistencia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.Session;

import modelo.persistencia.InterfacRecuperable;
import modelo.persistencia.SesionManager;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class EmpleadoJDBCDao implements InterfacRecuperable {
	Connection conn = null;
	ResultSet rset = null;
	Statement stmt = null;
	/* (non-Javadoc)
	 * @see modelo.persistencia.InterfacRecuperable#leerEmpleado(int)
	 */
	
	
	@Override
	public Object leerEmpleado(int n) {
		
		return null;
	}
	
}
