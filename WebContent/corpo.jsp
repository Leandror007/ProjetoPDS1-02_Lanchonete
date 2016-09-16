<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Sistema de Lanchonete</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link href="boot/css/bootstrap.css" rel="stylesheet">
    <style type="text/css">
      body {
        padding-top: 60px;
        padding-bottom: 40px;
        background-color: #fff;
      /*  background: #eedfcc url(img/imagem.jpg) no-repeat center top;
        -webkit-background-size: cover;
        -moz-background-size: cover;
      */
      }
      .sidebar-nav {
              padding: 9px 0;
      }

      @media (max-width: 980px) {
        /* Enable use of floated navbar text */
        .navbar-text.pull-right {
          float: none;
          padding-left: 5px;
          padding-right: 5px;
        }
      }
    </style>
    <link href="boot/css/bootstrap-responsive.css" rel="stylesheet">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="../assets/js/html5shiv.js"></script>
    <![endif]-->

   
  </head>

  <body>

    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container-fluid">
          <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="brand" href="#">Sistema de Lanchonete</a>
          <div class="nav-collapse collapse">
            <p class="navbar-text pull-right">
              Logar <a href="#" class="navbar-link">Usuario</a>
            </p>
            <ul class="nav">
              <li class="active"><a href="#">Home</a></li>
              <li><a href="#about">Cardapio</a></li>
              <li><a href="#contact">Contatos</a></li>
              <li><a href="#contact">Prestador</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container-fluid">
      <div class="row-fluid">
        <div class="span3">
          <div class="well sidebar-nav">
            <ul class="nav nav-list">
              <li class="nav-header">Pedidos</li>
              <li class="active"><a href="#">Fazer Pedido</a></li>
              <li><a href="#">Registros</a></li>
              <li><a href="#">Listar</a></li>
              <li><a href="#">Ranquear</a></li>
              <li class="nav-header">Cadastro</li>
              <li><a href="funcionario/LanchoneteCrud">Cadastrar Funcionario</a></li>
              <li><a href="#">Cadastrar Insumo</a></li>
              <li><a href="#">Cadastrar Produto</a></li>
            
             
            </ul>
          </div><!--/.well -->
        </div><!--/span-->
        <div class="span9">








        </div><!--/span-->
      </div><!--/row-->

      <hr>

      <footer>
        <p>&copy; Company 2015</p>
      </footer>

    </div><!--/.fluid-container-->

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="boot/js/jquery.js"></script>
    <script src="boot/js/bootstrap-transition.js"></script>
    <script src="boot/js/bootstrap-alert.js"></script>
    <script src="boot/js/bootstrap-modal.js"></script>
    <script src="boot/js/bootstrap-dropdown.js"></script>
    <script src="boot/js/bootstrap-scrollspy.js"></script>
    <script src="boot/js/bootstrap-tab.js"></script>
    <script src="boot/js/bootstrap-tooltip.js"></script>
    <script src="boot/js/bootstrap-popover.js"></script>
    <script src="boot/js/bootstrap-button.js"></script>
    <script src="boot/js/bootstrap-collapse.js"></script>
    <script src="boot/js/bootstrap-carousel.js"></script>
    <script src="boot/js/bootstrap-typeahead.js"></script>

  </body>
</html>
