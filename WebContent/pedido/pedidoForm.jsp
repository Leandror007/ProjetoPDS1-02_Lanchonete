<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	#alinhar{ margin-left: 180px;}
	#corpo{margin-left: 200px; background: #CCCCCC; width: 50%; box-shadow: 10px 10px 5px #888888;}
</style>

</head>
<body>
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<%@ include file="/includes/menuTopo.jsp"%>

<a href="../insumo/InsumoCrud"> << Voltar</a>

<form method="post" action="<%=request.getContextPath()%>/compra/CompraCrud" name="formComp" class="form-horizontal">

<div class="control-group">
	<label class="control-label">Código : </label> 
<div class="controls">	 
	<input type="text" readonly="readonly" name="codCompras" value="${ped.codPedido}" /> <br />
</div>
</div>

<div class="control-group">
	<label class="control-label">Data : </label> 
<div class="controls">	 
	<input type="text" name="dsData" value="${ped.datapedido}" /> <br />
</div>
</div>


<div class="control-group">
	<label class="control-label">Codigo Funcionario: </label> 
<div class="controls">	 
	<input type="text" name="codFuncionario" value="${ped.funcionario.codFuncionario}" /> <br />
</div>
</div>

<div class="control-group">
	<label class="control-label">Produto: </label> 
<div class="controls">	 
   <select name="veiculo" style="width:218px;">
    <option value="0">SELECIONE</option>
     <c:forEach var="p" items="${produto}">
      <option value="${p.nome}"> ${p.nome}</option>
     </c:forEach>
   </select>    
  </div>
</div>


<div class="control-group">
	<label class="control-label">Preco: </label> 
<div class="controls">	 
	<input type="text" name="preco" value="${p.preco}" /> <br />
</div>
</div>

<div id="alinhar">
	<input type="submit" value="Salvar" class="btn btn-small btn-primary" />
</div>
</form>


 
 <script src="http://code.jquery.com/jquery.js"></script>
  <script src="../bootstrap/js/bootstrap.min.js"></script>
</body>
</html>