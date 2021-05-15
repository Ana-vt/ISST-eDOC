<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <title>eDOC</title>
        <script type = "text/javascript">
            //let encuestas_realizadas = 0;
        </script>
        <link href="static/css/circular-prog-bar.css" media="all" rel="stylesheet" />
        <link rel="stylesheet" href="static/css/alumno_inicio.css" type="text/css" />
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" >
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    </head>

    <body >
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="alumno_inicio.jsp"><i class= "fa fa-home"></i>Inicio</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="AsignaturasAlumno"><i class= "fa fa-paste"></i>Encuestas</a>
                    </li>
                </ul>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <i class="fa fa-user-circle" aria-hidden="true"> <%= session.getAttribute("email_alumno") %> </i>
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="FormLogoutServlet"><i class="fa fa-sign-out-alt mr-2" aria-hidden="true"></i>Cerrar sesión</a>
                                
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <h1 class="title" >Bienvenido a eDOC</h1>

        <h2 class="subtitle" style = "color:#ffa500">Tu página de evaluaciones docentes</h2>
        <div class="padre">
        	<div align="center">
            	<img src="static/img/alumnos.png" width="250" height="250" class="departamento" />
           	</div>
        
        <p>Estas encuestas tienen una gran importancia en el Procedimiento de Evaluación de la Actividad Docente del Profesorado de la Universidad Politécnica de Madrid, pues aportan 50 puntos sobre los 140 posibles sobre los que se evalúa a los profesores.</p>
    	<p>Tu opinión es muy importante para la calidad docente y aporta información relevante para tus profesores y los responsables académicos.</p>
    	<p>Muchas gracias!!</p>
    	
    	</div>
       
        
        
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>