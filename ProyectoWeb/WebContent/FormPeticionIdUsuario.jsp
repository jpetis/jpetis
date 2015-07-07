<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Buscar ususrio</title>
</head>
<body>
<h1>Introducca un identificador de usuario</h1>
<form action="ServletEmpleadoEL" method="get">
Id Usuario:<br>
<input type="text" name="id">
<br><br>
<input type="submit" value="Solicitar" >
</form> 

<h1>Introducca un identificador de Departamento</h1>
<form action="ServletListaDepartamentos" method="get">
Id Departamento:<br>
<input type="text" name="id">
<br><br>
<input type="submit" value="Solicitar" >
</form> 

</body>
</html>