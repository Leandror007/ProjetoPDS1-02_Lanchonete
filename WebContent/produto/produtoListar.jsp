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
<STYLE type="text/css">
	

</STYLE>

</head>
<body>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<%@ include file="/includes/menuTopo.jsp"%>

<h2>Lista de Produtos</h2>
<br/>
<p><a class="btn btn-large btn-primary" href="<%=request.getContextPath()%>/produto/ProdutoCrud?cmd=novo">Adicionar Pedido</a></p>


  <div class="panel-heading">Lista de Produto</div>

<table border="1" class="table table-hover">
<thead>
<tr>
	<th>Id</th>
	<th>Descricao</th>
	<th>Nome</th>
	<th>Preco</th>
	
	<th colspan="2" align="center">Ações</th>
</tr>
</thead>
<tbody>
<c:forEach items="${lista}" var="p">
<tr>
<td>${p.codProduto}</td>
<td>${p.descricao}</td>
<td>${p.nome}</td>
<td>${p.preco}</td>

<td>
	<a class="btn btn-small btn-primary" href="<%=request.getContextPath()%>/pedido/PedidoCrud?cmd=novo&codProduto=${p.codProduto}">Escolher este</a></td>
</tr>
</c:forEach>
</tbody>

</table>

  <script src="http://code.jquery.com/jquery.js"></script>
  <script src="../bootstrap/js/bootstrap.min.js"></script>
</body>
</html>