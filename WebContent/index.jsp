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
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
 <STYLE type="text/css">
 	
 #corrocel{ margin-top: 130px; margin-left: 200px; width: 60%;}
 </STYLE>
 
  
 
  </head>
  <body>
  
  
 <div class="navbar navbar-inverse">
  <div class="navbar-inner">
    
    <ul class="nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="funcionario/LanchoneteCrud">Cadastrar Funcionario</a></li>
      <li><a href="insumo/InsumoCrud">Cadastrar Insumo</a></li>
      <li><a href="produto/ProdutoCrud">Cadastrar Produto</a></li>      
      <li><a href="compra/CompraCrud">Realizar Compra</a></li>
       <li><a href="pedido/PedidoCrud" title="Realizar pedido">Realizar pedido</a></li>
      
 		 <input type="text" class="input-medium search-query">
  		 <button type="submit" class="btn">Busca</button>
 
    </ul>
  </div>
</div>
<!-- inicio do carrocel -->
 
 <div id="corrocel">       
        
    <div id="myCarousel" class="carousel slide">
 	<ol class="carousel-indicators">
 	
 	
    <li data-target="#myCarousel" data-slide-to="0" class="active"> </li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
 
  </ol>
  <!-- Carousel items -->
   <div class="carousel-inner">
                  <div class="item active">
                    <img src="bootstrap/imag/sand01.jpg" width="490px" height="200px" alt="Imagem colorida de um Hamburger. Ingredientes: Pão, alface, carne, cebola">
                    <div class="carousel-caption">
                      <h4>Super Hamburger</h4>
                      <p>Este lanche leva  Pão, alface, carne, cebola, tomate, alface, queijo</p>
                    </div>
                  </div>
                  
    <div class="item">
                    <img src="bootstrap/imag/sand02.jpg"width="490px" height="200px" alt="">
                    <div class="carousel-caption">
                      <h4>Big-Presunto</h4>
                      <p>Este sanduiche leva pão, presunto, alface e bacon</p>
                    </div>
                  </div>
 <div class="item">
                    <img src="bootstrap/imag/sand03.jpg" width="490px" height="200px" alt="">
                    <div class="carousel-caption">
                      <h4>Sandu-frango</h4>
                      <p>Sanduiche de frango com tomate, alface, cebola.</p>
                    </div>
                  </div>
   <div class="item">
                    <img src="bootstrap/imag/sand04.jpg" width="490px" height="300px" alt="">
                    <div class="carousel-caption">
                      <h4>Super-churrasco</h4>
                      <p>Sanduiche de carne de churrasco, cebola, alface e queijo.</p>
                    </div>
                  </div>
    <div class="item">
                    <img src="bootstrap/imag/sand05.jpg" width="490px" height="200px" alt="">
                    <div class="carousel-caption">
                      <h4>Second Thumbnail label</h4>
                      <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                    </div>
                  </div>
  </div>
  <!-- Carousel nav -->
  <a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
  <a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
</div>





    
  </div>  
    <script src="http://code.jquery.com/jquery.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>