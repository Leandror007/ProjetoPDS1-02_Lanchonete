<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<%@ include file="/includes/menuTopo.jsp"%>

<h1>Lista de Compras</h1>
<hr/>
<h2>Escolha o Funcionario</h2>
<br/>
<table border="1" class="table">
<thead>
<tr>
	<th>Id</th>
	<th>Funcionario</th>
	<th>Escolher</th>
</tr>
</thead>
<tbody>
<c:forEach items="${lista}" var="f">
<tr>
	<td>${f.codFuncionario}</td>
	<td>${f.nmFuncinario}</td>

<td>
	<a class="btn btn-small btn-primary" href="<%=request.getContextPath()%>/compra/CompraCrud?cmd=novo&codFuncionario=${f.codFuncionario}">Escolher este</a></td>
</tr>
</c:forEach>
</tbody>
</table>

</body>
</html>