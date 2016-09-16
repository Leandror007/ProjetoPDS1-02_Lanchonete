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


<h2>Lista de Insumos</h2>
<br/>
<p><a class="btn btn-large btn-primary" href="<%=request.getContextPath()%>/insumo/InsumoCrud?cmd=novo">Adicionar Insumo</a></p>


<p><a href="../modelo.jsp">Ir para Menu</a></p>

<div class="panel panel-default">
  <!-- Default panel contents -->
  <div class="panel-heading">Lista de Insumos</div>

<table border="1" class="table">
<thead>
<tr>
	<th>Id</th>
	<th>Nome</th>
	<th>Medida</th>
	<th>Preco</th>

	<th colspan="2">Ações</th>
</tr>
</thead>
<tbody>
<c:forEach items="${lista}" var="i">
<tr>

<td>${i.codInsumo}</td>
<td>${i.nome}</td>
<td>${i.unidadedemedida}</td>
<td>${i.preco}</td>


<td><p class="botao"> <a class="btn btn-small btn-primary"
href="<%=request.getContextPath()%>/insumo/InsumoCrud?cmd=editar&cod=${i.codInsumo}" >Editar</a></p></td>
<td>
<p class="botao"> <a class="btn btn-small btn btn-danger" href="<%=request.getContextPath()%>/insumo/InsumoCrud?cmd=deletar&cod=${i.codInsumo}">Excluir</a></p></td>

</tr>
</c:forEach>
</tbody>


</table>
</div>
   <script src="http://code.jquery.com/jquery.js"></script>
  <script src="../bootstrap/js/bootstrap.min.js"></script>
</body>
</html>