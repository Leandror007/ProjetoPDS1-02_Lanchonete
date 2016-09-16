<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Funcionario</title>

<style type="text/css">

	#alinhar{ margin-left: 200px;}
	#corpo{margin-left: 200px; background: #CCCCCC; width: 50%; box-shadow: 10px 10px 5px #888888;}

</style>

</head>
<body>
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<%@ include file="/includes/menuTopo.jsp"%>

<a href="../funcionario/LanchoneteCrud"> << Voltar</a>

<div id="corpo">
<h2>Entre com os dados do Funcionario</h2>
<form method="post" action="<%=request.getContextPath()%>/funcionario/LanchoneteCrud" name="formFunc" class="form-horizontal">

<div class="control-group">
	<label class="control-label">ID: </label>
<div class="controls">
	<input type="text" readonly="readonly" name="codFuncionario" value="${func.codFuncionario}" /> <br />
</div>
</div>

<div class="control-group">
	<label class="control-label">Nome :</label> 
<div class="controls">
	<input type="text" name="nmFuncionario" value="${func.nmFuncinario}" /> <br />
</div>
</div>

<div class="control-group">
	<label class="control-label">Data Nascimento :</label>
<div class="controls"> 
<input type="text" name="dataNascimento" value="${func.dataNascimento}" /> <br />
</div>
</div>

<div class="control-group">
	<label class="control-label">Endereco : </label>
<div class="controls">
<input type="text" name="dsEndereco" value="${func.dsEndereco}" /> <br />
</div>
</div>

<div class="control-group">
	<label class="control-label">Telefone:</label>
<div class="controls"> 
<input type="text" name="dsTelefone" value="${func.dsTelefone}" /> <br />
</div>
</div>

<div class="control-group">
	<label class="control-label">Login:</label>
<div class="controls">
<input type="text" name="dsLogin" value="${func.dsLogin}" /> <br />
</div>
</div>

<div class="control-group">
	<label class="control-label">Senha:</label>
<div class="controls">
<input type="text" name="dsSenha" value="${func.dsSenha}" /> <br />
</div>
</div>

<div id="alinhar">
<div class="control-group">
<input type="submit" value="Salvar" class="btn btn-small btn-primary"/>
    <input type="reset" value="Limpar" class="btn btn-small btn-primary" /></p>
</div>
</div>

<!-- Exemplo de data com JSTL:Data do pedido: <input
type="text" name="dataPedido"
value="<fmt:formatDate pattern="dd/MM/yyyy" value="${pedido.dataPedido}" />" /> <br />
-->
</form>


</div>

  <script src="http://code.jquery.com/jquery.js"></script>
  <script src="../bootstrap/js/bootstrap.min.js"></script>

</body>
</html>