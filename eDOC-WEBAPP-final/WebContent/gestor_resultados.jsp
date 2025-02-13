<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
  <head>
    <title>eDOC</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="static/css/gestor_inicio.css" type="text/css" />
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" >
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  </head>
  <body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item">
              <a class="nav-link" href="gestor_inicio.jsp"><i class= "fa fa-home"></i>Inicio</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="FormGestorAsignatura"><i class= "fa fa-paste"></i>Resultados</a>
            </li>
           
          </ul>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ml-auto">
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <i class="fa fa-user-circle" aria-hidden="true">  Usuario xxxx</i>
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <a class="dropdown-item" href="index.html"><i class="fa fa-sign-out-alt mr-2" aria-hidden="true"></i>Cerrar sesión</a>
                 
                </div>
              </li>
            </ul>
          </div>
        </div>
      </nav>
      
      <table class="table  table-striped ">

            <thead>
              <tr>
                <th scope="col">Curso</th>
                <th scope="col">Nombre</th>
                <th scope="col">Acronimo</th>
                <th scope="col">Semestre</th>
                <th scope="col">Mostrar Datos</th>
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
                
                <form action = "MostrarDatos" >
         				<button class="btn btn-warning"  >Mostrar Datos</button>
         				<input type ="hidden" value ="<c:out value = "${asignaturai.id}">identificador</c:out>" name = "asignatura">
         			</form> 
               
  
                </td>
              </tr>
               
            </tbody> 
              
             </c:forEach>
             
          </table>
      
      
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>