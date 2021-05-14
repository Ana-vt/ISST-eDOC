<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html lang="es">
    <head>
        <title>eDOC</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    </head>
    <body>
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item">
              <a class="nav-link" href="alumno_inicio.jsp"><i class= "fa fa-home"></i>Inicio</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="alumno_encuestas.jsp"><i class= "fa fa-paste"></i>Encuestas</a>
            </li>
          </ul>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ml-auto">
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <i class="fa fa-user-circle" aria-hidden="true">  <%= session.getAttribute("email_alumno") %></i>
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <a class="dropdown-item" href="FormLogoutServlet"><i class="fa fa-sign-out-alt mr-2" aria-hidden="true"></i>Cerrar sesi�n</a>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </nav>
        <div class="container">
            <section class="row">
                <div class="col-md-12">
                    <h1 class="text-center">Evaluaci�n Docente</h1>
                    <p class="text-center">Encuesta de Asignatura</p>
                </div>

                <form name="encuesta" action = "FormEncuesta" method="post">
                    <!--  Sobre la Documentaci�n  -->
                    <section class="row">
                        <div class="col-md-12">
                            <h3>Sobre la documentaci�n</h3>
                            <p></p>
                        </div>
                    </section>
                    <!--  PREGUNTA 1  -->
                    <section class="row">
                     <div class="col-md-12">
                            <p>1- �Los apuntes son claros y de utilidad?</p>
                        </div>

                         <select name="apuntes">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
                    </section>
                    <br>
                    <!--  PREGUNTA 2  -->
                    <section class="row">
                        <div class="col-md-12">
                            <p>2- �La bibliograf�a recomendada es accesible y de utilidad?</p>
                        </div>
                        
                         <select  name="bibliografia">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
                    </section>
                    <br><hr>
                    <!--  Sobre las pruebas de evaluaci�n  -->
                    <section class="row">
                      <div class="col-md-12">
                          <h3>Sobre las pruebas de evaluaci�n</h3>
                          <p></p>
                      </div>
                  </section>
                <!--  PREGUNTA 3  -->
                <section class="row">
                  <div class="col-md-12">
                      <p>3- �El esfuerzo que lleva realizar las pr�cticas y los trabajos es el esperado para esta asignatura?</p>
                  </div>
                  <select  name="trabajos">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
              </section>
              <br>
                  <!--  PREGUNTA 4  -->
                  <section class="row">
                    <div class="col-md-12">
                        <p>4- �El esfuerzo que lleva realizar los ex�menes es el esperado para esta asignatura?</p>
                    </div>
                    <select  name="examenes">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
                </section>
                <br>
                
                <!--  PREGUNTA 5  -->
                <section class="row">
                  <div class="col-md-12">
                      <p>5- �El sistema de evaluaci�n es adecuado?</p>
                  </div>
                   <select  name="sistema">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
              </section>
              <br>
              <!--  PREGUNTA 6  -->
              <section class="row">
                <div class="col-md-12">
                    <p>6- �El esfuerzo necesario para aprobar es adecuado?</p>
                </div>
                <div class="col-md-2">
                <select  name="esfuerzo">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
            </section>
                  <br><hr>
                  <!--  Sobre su propia labor como estudiante  -->
                  <section class="row">
                    <div class="col-md-12">
                        <h3>Sobre su propia labor como estudiante</h3>
                        <p></p>
                    </div>
                </section>
                <!--  PREGUNTA 7  -->
                <section class="row">
                  <div class="col-md-12">
                      <p>7- �Asisto a las actividades docentes diariamente?</p>
                  </div>
                  <select  name="asistencia">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
              </section>
              <br>
              <!--  PREGUNTA 8  -->
              <section class="row">
                <div class="col-md-12">
                    <p>8- �Llevo al d�a el estudio de esta asignatura?</p>
                </div>
                <select  name="dia">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
            </section>
            <br>
            <!--  PREGUNTA 9  -->
            <section class="row">
                <div class="col-md-12">
                    <p>9- �Resuelvo mis dudas en tutor�as?</p>
                </div>
               <select  name="tutoria">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
            </section>
            <br>
            <!--  PREGUNTA 10  -->
            <section class="row">
                <div class="col-md-12">
                    <p>10- �Considero interesante esta asignatura para mi formaci�n?</p>
                </div>
                 <select  name="interesante">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
            </section>
            <br>
                <!--  PREGUNTA 11  -->
            <section class="row">
                <div class="col-md-12">
                    <p>11- �Considero mi preparaci�n previa adecuada para seguir esta asignatura?</p>
                </div>
                <select  name="preparacion">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
            </section>
            <br>
              <!--  PREGUNTA 12  -->
            <section class="row">
                <div class="col-md-12">
                    <p>12- �La calificaci�n obtenida se ajusta a los conocimientos demostrados?</p>
                </div>
               <select  name="conocimientos">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
            </section>
            <br>
                <br><hr>
                    <!--  Sobre las clases  -->
                    <section class="row">
                      <div class="col-md-12">
                          <h3>Sobre las clases</h3>
                          <p></p>
                      </div>
                  </section>
                  <!--  PREGUNTA 13  -->
                  <section class="row">
                    <div class="col-md-12">
                        <p>13- �La distribuci�n de horas te�ricas y pr�cticas es adecuada?</p>
                    </div>
                    <select  name="horas">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
                </section>
                <br>
                  <!--  PREGUNTA 14  -->
                  <section class="row">
                    <div class="col-md-12">
                        <p>14- �No se han producido solapamientos con otras asignaturas?</p>
                    </div>
                    <select  name="solapamientos">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
                </section>
                  <br><hr>
                    <!--  Sobre el profesorado  -->
                    <section class="row">
                      <div class="col-md-12">
                          <h3>Sobre el profesorado</h3>
                          <p></p>
                      </div>
                  </section>
                  <!--  PREGUNTA 15  -->
                  <section class="row">
                    <div class="col-md-12">
                        <p>15- �El profesor eval�a corretamente?</p>
                    </div>
                    <select  name="evaluacion">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
                </section>
                <br>
                <!--  PREGUNTA 116  -->
                <section class="row">
                    <div class="col-md-12">
                        <p>16- �El profesor facilita la participaci�n en clase?</p>
                    </div>
                    <select  name="participacion">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
                </section>
                <br>
                <!--  PREGUNTA 17  -->
                <section class="row">
                    <div class="col-md-12">
                        <p>17- �El profesor despierta mi inter�s por la asignatura?</p>
                    </div>
                   <select  name="interes">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
                </section>
                <br>
                <!--  PREGUNTA 18  -->
                <section class="row">
                    <div class="col-md-12">
                        <p>18- �El profesor cumple con la Guia de Aprendizaje de la asignatura?</p>
                    </div>
                    <select  name="guia">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
                </section>
                <br>
                <!--  PREGUNTA 19  -->
                <section class="row">
                    <div class="col-md-12">
                        <p>19- �El profesor se muestra accesible y disponible para los estudiantes?</p>
                    </div>
                    <select  name="accesible">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
                </section>
                <br>
                 <!--  PREGUNTA 20  -->
                 <section class="row">
                  <div class="col-md-12">
                      <p>20- El profesorado de la asignatura est� bien coordinado?</p>
                  </div>
                  <select  name="coordinacion">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
              </section>
              <br>
              <!--  PREGUNTA 21  -->
              <section class="row">
                <div class="col-md-12">
                    <p>21- �El profesor respeta el horario de clase?</p>
                </div>
                 <select  name="horario">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
            </section>
            <br>
            <!--  PREGUNTA 22  -->
            <section class="row">
              <div class="col-md-12">
                  <p>22- �El profesor explica con claridad?</p>
              </div>
               <select  name="claridad">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
          </section>
          <br>
          <!--  PREGUNTA 23  -->
          <section class="row">
            <div class="col-md-12">
                <p>23- �Repetir�a clase con este profesor?</p>
            </div>
              <select  name="repetir">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>
        </section>
        <br>
        
                  <br><hr>

                    <!--  Satisfacci�n General  -->
                    <section class="row">
                      <div class="col-md-12">
                          <h3>Satisfacci�n General.</h3>
                          <p></p>
                      </div>
                  </section>
                  <!--  PREGUNTA 24  -->
                  <section class="row">
                      <div class="col-md-12">
                          <p>24- �En general, estoy satisfecho con la labor docente del profesor ?</p>
                      </div>
                      <select  name="satisfaccion">
                    <option value="10 ">10 </option>
                    <option value="7.5" >7.5</option>
                    <option value="7.5" >5</option>
                    <option value="2.5" >2.5</option>
		 			<option value="0" >0</option>

                  </select>

                  </section>
                  <br />
                    <!--  Comentarios  -->
                    <section class="row">
                        <div class="col-md-12">
                            <h3>Comentarios.</h3>
                            <p></p>
                        </div>
                    </section>
                    <section class="row">
                        <div class="col-md-12">
                            <div class="form-group">
                                <label class="comment">Comentarios:</label>
                                <textarea name = "texto" class="form-control" rows="6" id="comentarios"></textarea>
                            </div>
                        </div>
                        <div class="terms">
                            <input type = "checkbox" name = "terms" onclick = "function enableSending() {
                                document.encuesta.submit.disabled = !document.encuesta.terms.checked;
                            }
                            enableSending();">

                            <label class="terms">He le�do y acepto los <a href="https://www.upm.es/sfs/Rectorado/Vicerrectorado%20de%20Tecnologias%20de%20la%20Informacion%20y%20Servicios%20en%20Red/Servicio%20de%20Planificacion%20Informatica%20y%20Comunicaciones/Web%20institucional/POLITICA_PRIVACIDAD_UPM.pdf">T�rminos y condiciones de privacidad</a></label>
                        </div>
                        
                        <button type="submit" name="submit" value="Send" disabled>Enviar</button>
                    </section>
                <br/>
                <footer class="container">
                    <p>Todos los derechos reservados para la Universidad Politecnica de Madrid.</p>
                </footer>
                </form>


            </section>
        </div>
    </body>
</html>