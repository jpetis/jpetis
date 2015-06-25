import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 */

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class ClaseFiltrosJDBC implements Filter{
	private final Logger log = LogManager.getRootLogger();
	/* (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {
		log.trace("Ha entrado por class ClaseFiltrosJDBC; destroy");
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		//PREPROCESAMIENTO
		log.trace("pase por el dofilter de filtroJDBC");
		long tiempoAntes = System.currentTimeMillis();
		filterChain.doFilter(request, response);
		long tiempoDespues = System.currentTimeMillis();
		long tiempoPaso = tiempoDespues-tiempoAntes;
		System.out.println(tiempoPaso);
		//POSTPROCESAMIENTO
		System.out.println("log.trace(Ha entrado por class ClaseFiltrosJDBC ;  doFilter)");
		log.trace("Ha entrado por class ClaseFiltrosJDBC ;  doFilter");
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
