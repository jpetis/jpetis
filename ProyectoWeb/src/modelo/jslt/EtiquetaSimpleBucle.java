package modelo.jslt;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class EtiquetaSimpleBucle extends SimpleTagSupport{
	
	private int num;
	
	
	@Override
	public void doTag() throws JspException, IOException {
		//sSystem.out.println(getJspBody().toString());
		StringWriter bodyamodificar = new StringWriter();
		getJspBody().invoke(bodyamodificar); //relleno la variable para poder modificarla
		bodyamodificar = bodyamodificar.append("- MODIFICADO");
		getJspContext().getOut().println("El body es = "+bodyamodificar +" ese es el body");
		
		for (int i = 0; i < num; i++) {
			//metodo -invoke- meto en esta variable el valor del body del jsp
			//por lo tanto modifico el Strimg y con el valor= -num = 3- hago un blucle
			
			/**al pasarle el null me imprime el cuerpo y se le paso un String me setea el valor
			de dentro del cuerpo y lo almaceno*/
			getJspBody().invoke(null);
			
		}
		
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}

}
