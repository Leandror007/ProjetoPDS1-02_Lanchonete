<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
  <head>
    <title>Bootstrap 101 Template</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
  </head>
  <body>
  
 <div class="navbar navbar-inverse">
  <div class="navbar-inner">
     <ul class="nav">
      <li class="active"><a href="../index.jsp" title="Tela inicial">Home</a></li>
      <li><a href="../funcionario/LanchoneteCrud" title="Cadastrar funcionario">Cadastrar Funcionario</a></li>
      <li><a href="../insumo/InsumoCrud" title="Cadastar Insumo">Cadastrar Insumo</a></li>
      <li><a href="../produto/ProdutoCrud" title="Cadastrar Produto">Cadastrar Produto</a></li>      
      <li><a href="../compra/CompraCrud" title="Realizar compra">Realizar Compra</a></li>
      <li><a href="../pedido/PedidoCrud" title="Realizar pedido">Realizar pedido</a></li>
      
         <input type="text" class="input-medium search-query">
  		 <button type="submit" class="btn">Busca</button>
    </ul>
  </div>
</div>
        
    
    
    <script src="../http://code.jquery.com/jquery.js"></script>
    <script src="../bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>