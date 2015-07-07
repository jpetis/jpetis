/**
 * 
 */
package modelo.jslt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Jaime Gpetis
 *
 * 
 */

public class RanUtilities {
	private final static Logger log = LogManager.getRootLogger(); 
	
	/** Me genera un número aleatorio desde 1 hasta el rango indicado */
	public static int randomInt(int rango) {
		int recuperaRango = (1 + ((int)(Math.random() * rango)));
		log.trace("class RanUtilities", recuperaRango);
	return recuperaRango;
	
		} 
	
}