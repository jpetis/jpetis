/**
 * 
 */
package modelo.persistencia;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public interface InterfacDAO {

	Object create (Object o);
	Object read (Object o);
	boolean update (Object o);
	boolean delete (Object o);
}
