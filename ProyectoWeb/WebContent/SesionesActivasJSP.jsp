<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
    <%@ page errorPage="PaginaError.jsp" %>
    <%@ page import="org.apache.logging.log4j.*" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sesiones Activas</title>
</head>
<body>
<!-- ClassHttpSessionListener -->
<h1>Sesiones activas</h1>
<%-- <%@include file="/AdivinaNumeros.jsp %> --%>
<jsp:include page="/PrimerJSP.jsp"></jsp:include>
<%final Logger log = LogManager.getRootLogger(); %>
<%log.error("Mensaje log error Sesiones activas"); %>
</body>
</html>   