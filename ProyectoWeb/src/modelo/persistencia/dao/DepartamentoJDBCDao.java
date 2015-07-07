/**
 * 
 */
package modelo.persistencia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import modelo.persistencia.InterfacRecuperable;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class DepartamentoJDBCDao implements InterfacRecuperable{
	Connection conn = null;
	ResultSet rset = null;
	Statement stmt = null;
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
		// TODO Auto-generated method stub
		return null;
	}

}
