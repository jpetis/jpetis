<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Departamentos</title>
</head>
<body>
<h1>Lista Departamentos</h1>
<jsp:useBean id="departamentosBean" type="modelo.dominio.Departments" scope="request"></jsp:useBean>
<jsp:getProperty property="departmentName" name="departamentosBean"/>
<select>
 
</select>

</body>
</html>