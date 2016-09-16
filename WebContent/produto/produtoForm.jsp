<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	#alinhar{ margin-left: 200px;}
	#corpo{margin-left: 200px; background: #CCCCCC; width: 50%; box-shadow: 10px 10px 5px #888888;}
</style>


</head>
<body>
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<%@ include file="/includes/menuTopo.jsp"%>

<a href="../produto/ProdutoCrud">Voltar</a>

<div id="corpo">
<h2>Entre com os dados do Produto</h2>
<form method="post" action="<%=request.getContextPath()%>/produto/ProdutoCrud" name="formProd" class="form-horizontal">

<div class="control-group">
	<label class="control-label"> ID: </label>
<div class="controls">
	<input type="text" readonly="readonly" name="codProduto" value="${prod.codProduto}" /> <br />
</div>
</div>

<div class="control-group">
	<label class="control-label">Descricao:</label>
<div class="controls"> 
	<input type="text" name="descricao" value="${prod.descricao}" /> <br />
</div>
</div>

<div class="control-group">
	<label class="control-label">Nome :</label>
<div class="controls"> 
	<input type="text" name="nome" value="${prod.nome}" /> <br />
</div>
</div>

<div class="control-group">
	<label class="control-label">Preco : </label>
<div class="controls"> 
	<input type="text" name="preco" value="${prod.preco}" /> <br />
</div>
</div>
<div id="alinhar">
<div class="control-group">
<p> <input type="submit" value="Salvar" class="btn btn-small btn-primary">
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