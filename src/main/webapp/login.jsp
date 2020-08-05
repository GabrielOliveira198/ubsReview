<%-- 
    Document   : login
    Created on : 24/10/2019, 23:35:26
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
        <script type="text/javascript"> alert("<%= request.getAttribute("Falhas") %>") </script>
    </head>

    <body>
         
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container"> <a class="navbar-brand" href="index.jsp">
                    <i class="fa d-inline fa-lg fa-circle-o"></i>
                    <b> UBS Review</b>
                </a> <button class="navbar-toggler navbar-toggler-right border-0" type="button" data-toggle="collapse" data-target="#navbar17" style="">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbar17">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item"> <a class="nav-link" href="index.jsp">Home</a> </li>
                        <li class="nav-item"> <a class="nav-link" href="pesquisar.jsp">Pesquisar</a> </li>
                        <li class="nav-item"> <a class="nav-link" href="#">Mapa</a> </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="py-5 text-center" style="background-image: url(&quot;https://static.pingendo.com/cover-bubble-dark.svg&quot;); background-size: cover;">
            <div class="container">
                <div class="row">
                    <div class="mx-auto col-md-6 col-10 bg-white p-5">
                        <h1 class="mb-4">Acesse sua conta</h1>
                        <form name="login"  action="Autentica" method="POST">
                            <div class="form-group"> <input type="email" class="form-control" name="email" id="form9" placeholder="Insira seu Email" value=""> </div>
                            <div class="form-group mb-3"> <input type="password" name="senha" class="form-control" placeholder="Senha" id="form10" value=""> <small class="form-text text-muted text-right">
                                    <a href="#" class="text-dark">Recuperar senha<br></a>
                                </small> </div>
                            <div class="form-group mb-3"> <small class="form-text text-muted text-right">
                                    <a href="faces/user/Create.xhtml" class="text-dark">Registre-se</a>
                                </small> </div>
                            <button type="submit" value="Logar" class="btn btn-dark">CONTINUAR</button>
                        </form>
                    </div>
                </div> 
            </div>
        </div>
<%
            String user = request.getParameter("email");
            String senha = request.getParameter("senha");

            if (user != null && senha != null && !user.isEmpty() && !senha.isEmpty()) {

                session.setAttribute("user", user);
                response.sendRedirect("login.jsp");
            }
        %>
       
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>

</html>