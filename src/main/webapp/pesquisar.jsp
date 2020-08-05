<%-- 
    Document   : pesquisa
    Created on : 24/10/2019, 23:35:13
    Author     : olive
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="https://static.pingendo.com/bootstrap/bootstrap-4.3.1.css">
</head>

<body>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container"> <a class="navbar-brand" href="index.jsp">
        <i class="fa d-inline fa-lg fa-circle-o"></i>
        <b> UBS Review<br></b>
      </a> <button class="navbar-toggler navbar-toggler-right border-0" type="button" data-toggle="collapse" data-target="#navbar11">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbar11">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item"> <a class="nav-link" href="index.jsp">Home</a> </li>
          <li class="nav-item"> <a class="nav-link active" href="faces/model/List.xhtml">Pesquisar</a> </li>
          <li class="nav-item"> <a class="nav-link" href="#">Mapa</a> </li>
        </ul>
      </div>
    </div>
  </nav>
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <div class="py-5 text-center" style="">
    <div class="container">
      <div class="row">
        <div class="mx-auto col-lg-10 " style="">
          <h1><b>Pesquisar UBS</b></h1>
          <p class="mb-4" contenteditable="true"><b>Informe abaixo o nome da UBS ou o seu CNES. Caso não tenha essa informação, você poderá listar todas as Unidades Básicas de Saúde da</b><b>&nbsp;localidade selecionada.</b></p>
          <div class="form-group"><input type="text" class="form-control form-control-lg" id="inlineFormInput" placeholder="Digite aqui..."></div>
          <div class="btn-group btn-group-lg">
            <button class="btn dropdown-toggle btn-dark" data-toggle="dropdown">Estado</button>
            <div class="dropdown-menu"> <a class="dropdown-item" href="#">Action</a>
              <div class="dropdown-divider"></div>
              <a class="dropdown-item" href="#">Separated link</a>
            </div>
          </div>
          <div class="btn-group btn-group-lg">
            <button class="btn dropdown-toggle btn-dark" data-toggle="dropdown"> Cidade</button>
            <div class="dropdown-menu"> <a class="dropdown-item" href="#">Action</a>
              <div class="dropdown-divider"></div>
              <a class="dropdown-item" href="#">Separated link</a>
            </div>
          </div>
          <form class="form-inline d-flex justify-content-around">
            <div class="form-group row"><label class="col-2" style=""></label></div>
          </form>
          <div class="btn-group btn-group-lg">
            <button class="btn dropdown-toggle btn-dark" data-toggle="dropdown"> Pesquisar por...</button>
            <div class="dropdown-menu"> <a class="dropdown-item" href="#">Action</a>
              <div class="dropdown-divider"></div>
              <a class="dropdown-item" href="#">Separated link</a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>

</html>
