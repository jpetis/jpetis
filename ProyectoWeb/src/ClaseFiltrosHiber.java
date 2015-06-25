/**
 * 
 */

/**

+ * @author Jaime Gpetis
 *
 * 
 */
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
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
public class ClaseFiltrosHiber implements Filter{
	private final Logger log = LogManager.getRootLogger();
	/* (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {
		log.trace("Ha entrado por class ClaseFiltrosHiber; destroy");
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest  request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		log.trace("pase por el dofilter de filtroHiber");
		//PREPROCESAMIENTO
		long tiempoAntes = System.currentTimeMillis();
		filterChain.doFilter(request, response);
		long tiempoDespues = System.currentTimeMillis();
		long tiempoPaso = tiempoDespues-tiempoAntes;
		System.out.println(tiempoPaso);
		//POSTPROCESAMIENTO
		
		
		
		
		
		System.out.println("log.trace(Ha entrado por class ClaseFiltrosHiber;  doFilter)");
		log.trace("Ha entrado por class ClaseFiltrosHiber;  doFilter");
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		System.out.println("log.trace(Ha entrado por;  init(FilterConfig filterConfig))");
		log.trace("Ha entrado por;  init(FilterConfig filterConfig)");
		
	}

}
