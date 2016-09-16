<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Teste CRUD</title>
 
</head>

<body>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<%@ include file="/includes/menuTopo.jsp"%>


<h2>Lista de Funcionario</h2>
<br/>
<p><a class="btn btn-large btn-primary" href="<%=request.getContextPath()%>/funcionario/LanchoneteCrud?cmd=novo">Adicionar Funcionario</a></p>


<table border="1" class="table">
<thead>
<tr>
	<th>Id</th>
	<th>Nome</th>
	<th>Data Nascimento</th>
	<th>Endere�o</th>
	<th>Telefone</th>
	<th>Login</th>
	<th>Senha</th>
	<th colspan="2">A��es</th>
</tr>
</thead>
<tbody>
<c:forEach items="${lista}" var="x">
<tr>
	<td>${x.codFuncionario}</td>
	<td>${x.nmFuncinario}</td>
	<td>${x.dataNascimento}</td>
	<td>${x.dsEndereco}</td>
	<td>${x.dsTelefone}</td>
	<td>${x.dsLogin}</td>
	<td>${x.dsSenha}</td>
<td><p class="botao"> <a class="btn btn-small btn-primary" href="<%=request.getContextPath()%>/funcionario/LanchoneteCrud?cmd=editar&cod=${x.codFuncionario}" >Editar</a></p></td>
<td>
<p class="botao"> <a class="btn btn-small btn btn-danger" href="<%=request.getContextPath()%>/funcionario/LanchoneteCrud?cmd=deletar&cod=${x.codFuncionario}">Excluir</a></p></td>

</tr>
</c:forEach>
</tbody>


</table>

  <script src="http://code.jquery.com/jquery.js"></script>
  <script src="../bootstrap/js/bootstrap.min.js"></script>
 </div>
</body>
</html>