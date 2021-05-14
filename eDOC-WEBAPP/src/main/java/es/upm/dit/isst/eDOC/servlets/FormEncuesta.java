package es.upm.dit.isst.eDOC.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

import es.upm.dit.isst.eDOC.model.Asignatura;
import es.upm.dit.isst.eDOC.model.Encuesta;
import es.upm.dit.isst.eDOC.model.Grupo;
import es.upm.dit.isst.eDOC.model.Usuario;

/**
 * Servlet implementation class FormEncuesta
 */
@WebServlet("/FormEncuesta")
public class FormEncuesta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Client client = ClientBuilder.newClient(new ClientConfig());
		
		
		
		Encuesta encuesta = new Encuesta();
		//encuesta.setAsignatura();
		
		encuesta.setEntregada(true);
		
		encuesta.setRespuesta_Texto(request.getParameter("texto"));
		
		encuesta.setRespuesta_Test1(Double.parseDouble(request.getParameter("apuntes")));
	
		encuesta.setRespuesta_Test2(Double.parseDouble(request.getParameter("bibliografia")));
	
		encuesta.setRespuesta_Test3(Double.parseDouble(request.getParameter("trabajos")));
		
		encuesta.setRespuesta_Test4(Double.parseDouble(request.getParameter("examenes")));
		
		encuesta.setRespuesta_Test5(Double.parseDouble(request.getParameter("sistema")));
		
		encuesta.setRespuesta_Test6(Double.parseDouble(request.getParameter("esfuerzo")));
		
		encuesta.setRespuesta_Test7(Double.parseDouble(request.getParameter("asistencia")));
		
		encuesta.setRespuesta_Test8(Double.parseDouble(request.getParameter("dia")));
		
		encuesta.setRespuesta_Test9(Double.parseDouble(request.getParameter("tutoria")));
		
		encuesta.setRespuesta_Test10(Double.parseDouble(request.getParameter("interesante")));
		
		encuesta.setRespuesta_Test11(Double.parseDouble(request.getParameter("preparacion")));
		
		encuesta.setRespuesta_Test12(Double.parseDouble(request.getParameter("conocimientos")));
		
		encuesta.setRespuesta_Test13(Double.parseDouble(request.getParameter("horas")));
		
		encuesta.setRespuesta_Test14(Double.parseDouble(request.getParameter("solapamientos")));
		
		encuesta.setRespuesta_Test15(Double.parseDouble(request.getParameter("evaluacion")));
		
		encuesta.setRespuesta_Test16(Double.parseDouble(request.getParameter("participacion")));
		
		encuesta.setRespuesta_Test17(Double.parseDouble(request.getParameter("interes")));
		
		encuesta.setRespuesta_Test18(Double.parseDouble(request.getParameter("guia")));
		
		encuesta.setRespuesta_Test19(Double.parseDouble(request.getParameter("accesible")));
		
		encuesta.setRespuesta_Test20(Double.parseDouble(request.getParameter("coordinacion")));
		
		encuesta.setRespuesta_Test21(Double.parseDouble(request.getParameter("horario")));
		
		encuesta.setRespuesta_Test22(Double.parseDouble(request.getParameter("claridad")));
		
		encuesta.setRespuesta_Test23(Double.parseDouble(request.getParameter("repetir")));
		
		encuesta.setRespuesta_Test24(Double.parseDouble(request.getParameter("satisfaccion")));
		
		String email = (String) request.getSession().getAttribute("email_alumno");
		
		int id_asignatura_seleccionada = (int) request.getSession().getAttribute("id_asignatura_seleccionada");
		
		System.out.print(id_asignatura_seleccionada);
		
		Asignatura asignatura_seleccionada = client.target(URLHelperAsignaturas.getURL()+ "/" + id_asignatura_seleccionada)
				.request().accept(MediaType.APPLICATION_JSON).get(Asignatura.class);
		
		encuesta.setAsignatura(asignatura_seleccionada);
		
		//Para borrar la fila
		
		List<Asignatura> asignaturas = (List<Asignatura>)request.getSession().getAttribute("asignaturas");
		
		List<Asignatura> asignaturas_actualizadas = new ArrayList<Asignatura>();
		
		for(Asignatura asignatura: asignaturas) {
			if (!(asignatura.getId()==(id_asignatura_seleccionada)))
				asignaturas_actualizadas.add(asignatura);
		}
		
		client.target(URLHelperUsuarios.getURL()+ "/" + email)
				.request().accept(MediaType.APPLICATION_JSON).get(Usuario.class).setAsignaturas(asignaturas_actualizadas);
		
		request.getSession().setAttribute("asignaturas", asignaturas_actualizadas);
		
		//Seleccion de grupo
		
		int curso_asignatura_seleccionada = asignatura_seleccionada.getCurso();
		
		System.out.print("curso_asignatura_seleccionada");
		System.out.print(curso_asignatura_seleccionada);
		
		
		List<Grupo> grupos_usuario = client.target(URLHelperUsuarios.getURL()+ "/" + email)
				.request().accept(MediaType.APPLICATION_JSON).get(Usuario.class).getGrupos();
		int prueba = 0;
		
		Grupo grupo_seleccionado = new Grupo();
			for(Grupo grupo_usuario: grupos_usuario) {
				char primer_numero_grupo = String.valueOf(grupo_usuario.getId()).charAt(0);
				int primer_numero_grupo_int = Character.getNumericValue(primer_numero_grupo);
				System.out.print("primer_numero_grupo");
				System.out.print(primer_numero_grupo);
				if (curso_asignatura_seleccionada == primer_numero_grupo_int) {
					grupo_seleccionado = grupo_usuario; 
				}
				else {prueba = 3;}
					
					
			}
			
			
		encuesta.setGrupo(grupo_seleccionado);
		System.out.print(grupo_seleccionado);
		System.out.print(prueba);
		
		Response r = client.target(URLHelperEncuestas.getURL()).request()
                .post(Entity.entity(encuesta, MediaType.APPLICATION_JSON)
               , Response.class);
      
	
        		
        getServletContext().getRequestDispatcher("/alumno_encuestas.jsp").forward(request, response);
                return;
       
        
        
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
