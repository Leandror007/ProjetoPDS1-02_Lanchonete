<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ include file="/includes/menuTopo.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Teste CRUD</title>
</head>
<body>
<h2>Lista de Pedidos</h2>
<br/>
<p><a class="btn btn-large btn-primary" href="<%=request.getContextPath()%>/pedido/PedidoCrud?cmd=escolherFuncionario">Adicionar Pedido</a></p>


<table border="1" class="table">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">

	<thead>
	<tr>
		<th>Código</th>
		<th>Data Compra</th>
		<th>Codigo Funcionario</th>
		<th colspan="2">Ação</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${lista}" var="p">
	<tr>
		<td>${p.codCompras}</td>
		<td>${p.dsData}</td>
		<td>${p.funcionario.nmFuncinario}</td>
		
	<td> <a class="btn btn-small btn-primary" href="<%=request.getContextPath()%>/pedido/PedidoCrud?cmd=editar&cod=${p.codCompras}">Editar</a></td>
	<td> <a class="btn btn-small btn btn-danger" href="<%=request.getContextPath()%>/compra/PedidoCrud?cmd=deletar&cod=${p.codCompras}">Excluir</a></td>

	</tr>
	</c:forEach>
</tbody>
</table>
</body>
</html>