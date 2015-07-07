/**
 * 
 */
package modelo.persistencia;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class InstruccionesSQL {
	
		
		public static final String CONSULTAR_TODOS = "SELECT * FROM EMPLOYEES";
		public static final String CONSULTAR_DEPARTAMENTOS = "SELECT * FROM DEPARTMENTS";
		public static final String CONSULTAR_SASALARY_MAX = "SELECT FIRST_NAME FROM EMPLOYEES WHERE SALARY = (SELECT MAX(SALARY) FROM DEPARTMENTS)";
		public static final String CONSULTAR_EMPLEADOS_POR_DEPARTAMENTOS = "SELECT * FROM EMPLOYEES WHERE EMPLOYEES_ID = ";
	/**PreparedStatement pstmt = conn.prepareStatement("Select * from employees where employee_id = ?");     
	pstmt.setInt(1, 110);	
	rset = pstmt.executeQuery();*/
}
