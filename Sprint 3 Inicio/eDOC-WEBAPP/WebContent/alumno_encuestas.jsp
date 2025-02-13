<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
  <head>
  <script src="//code.jquery.com/jquery-latest.js"></script>
    <title>eDOC</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/alumno_encuestas.css" type="text/css" />
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" >
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
  </head>
  <body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item">
              <a class="nav-link" href="alumno_inicio.html"><i class= "fa fa-home"></i>Inicio</a>
            </li>
            <li class="nav-item">
                     <form class="asignatura-form"action="FormAsignatura" >
                        <button> Encuestas </button>
                    </form>
                    </li>
          </ul>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ml-auto">
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <i class="fa fa-user-circle" aria-hidden="true">  Usuario xxxx</i>
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <a class="dropdown-item" href="index.html"><i class="fa fa-sign-out-alt mr-2" aria-hidden="true"></i>Cerrar sesiÃ³n</a>
                  <div class="dropdown-divider"></div>
                  <a class="dropdown-item" href="#">Editar perfil</a>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </nav>
      
      <h2 class="subtitle"> Encuestas por realizar:</h2>
      <div class="padre">
      <!--<div class="hijo">-->
      
        <table class="table  table-striped ">

            <thead>
              <tr>
                <th scope="col">Curso</th>
                <th scope="col">Nombre</th>
                <th scope="col">Acronimo</th>
                <th scope="col">Semestre</th>
                <th scope="col">Realizar</th>
              </tr>
            </thead>
            
           
            <c:forEach items= "${asignaturas}" var="asignaturai">
            <tbody>
              <tr>
                <td> ${asignaturai.curso}</td>
                <td> ${asignaturai.name}</td>
                <td>${asignaturai.acronimo}</td>
                <td> ${asignaturai.semestre}</td>
                <td>
                    <a href="Encuestas.html" class="btn btn-warning" >Realizar</a>
                </td>
              </tr>
               
            </tbody> 
              
             </c:forEach>
             
          </table>
      <!--</div>-->
    </div>
      
      
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" ></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" ></script>
  </body>
</html>