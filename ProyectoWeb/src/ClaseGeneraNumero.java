import java.util.Random;

import sun.java2d.loops.DrawGlyphListAA.General;

/**
 * 
 */

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class ClaseGeneraNumero {
	Random random = new Random();
	/**
	 * 
	 */
	private int genera(int numActual) {
			int numMax = 0;
			int numMin = 0;
			int numGenerado= 0;
			numGenerado = random.nextInt(((numMax-numMin)+1)/2);
			
		return numGenerado;
	

	}
	
}
