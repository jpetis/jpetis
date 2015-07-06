<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adivina números</title>
<style type="text/css">
body {
	color: blue;
	position: relative;
}

#contenedor {
	margin: 0 auto;
	text-align: left;
	width: 70%;
}

h1 {
	margin: 0 auto;
	text-align: left;
	width: 70%;
	text-align: justify;
}
</style>
</head>

<body>

	<h1>¿Es éste?</h1>
	<br>
	<br>
	<div id="contenedor">
	<form action="AdivinaNumeros.jsp">
		<p>
			<img alt="Mal..Mal..mal.." src="La brja lola.jpg">
		</p>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<%int n = 50; 
		System.out.println(request.getParameter("numero"));
		System.out.println(request.getParameter("pregunta"));
		ClaseGeneraNumero cl = new ClaseGeneraNumero();
		
		%>
		<input type="text" name="numero" value="<%= n %>" />
		
			<select name="pregunta">
				<option value="Mayor">Mayor</option>
				<option value="Menor">Menor</option>
				<option value="Igual" selected>Igual</option>
				</select>
			<input type="submit" value="Confirmar" />
			<br>
			<br>

		</form>
	</div>

</body>
</html>