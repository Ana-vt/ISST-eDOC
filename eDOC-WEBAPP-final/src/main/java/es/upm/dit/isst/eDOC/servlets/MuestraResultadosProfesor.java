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
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;

import es.upm.dit.isst.eDOC.model.*;

/**
 * Servlet implementation class MuestraResultadosProfesor
 */
@WebServlet("/MuestraResultadosProfesor")
public class MuestraResultadosProfesor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Client client = ClientBuilder.newClient(new ClientConfig());
		
		//Seleccion encuestas por asignatura
		int id_asignatura_seleccionada_profesor = Integer.parseInt((String)request.getParameter("id_asignatura_seleccionada_profesor"));
		
		Asignatura asignatura_seleccionada_profesor = client.target(URLHelperAsignaturas.getURL()+ "/" + id_asignatura_seleccionada_profesor)
				.request().accept(MediaType.APPLICATION_JSON).get(Asignatura.class);
		
		List<Encuesta> encuestas_asignatura = client.target(URLHelperEncuestas.getURL()+ "/" + id_asignatura_seleccionada_profesor)
	    		 .request().accept(MediaType.APPLICATION_JSON).get(new GenericType<List<Encuesta>>() {});
		
		System.out.print("encuestas_asignatura");
		System.out.print(encuestas_asignatura);
		
		//Seleccion grupo
		
		int curso_asignatura_seleccionada_profesor = asignatura_seleccionada_profesor.getCurso();		
		String email = (String) request.getSession().getAttribute("email_profesor");
		
		List<Grupo> grupos_usuario = client.target(URLHelperUsuarios.getURL()+ "/" + email)
				.request().accept(MediaType.APPLICATION_JSON).get(Usuario.class).getGrupos();
		int prueba = 0;
		//int contador = 0;
		
		Grupo grupo_seleccionado_profesor = new Grupo();
			for(Grupo grupo_usuario: grupos_usuario) {
				char primer_numero_grupo = String.valueOf(grupo_usuario.getId()).charAt(0);
				int primer_numero_grupo_int = Character.getNumericValue(primer_numero_grupo);
				System.out.print("primer_numero_grupo_int");
				System.out.print(primer_numero_grupo_int);
				if (curso_asignatura_seleccionada_profesor == primer_numero_grupo_int) {
					grupo_seleccionado_profesor = grupo_usuario; 
					
					
					//contador+=1;
				}
				else {prueba = 3;}
					
					
			}
			
			//request.getSession().setAttribute("num_encuestas_realizadas", contador);
	
		
		
		//seleccion de las encuestas por grupo
		
		List<Encuesta> encuestas_asignatura_grupo = new ArrayList<Encuesta>();
		
		for(Encuesta encuesta_asignatura: encuestas_asignatura) {
			if ((encuesta_asignatura.getGrupo().getId()==(grupo_seleccionado_profesor).getId()))
				encuestas_asignatura_grupo.add(encuesta_asignatura);
		}
		System.out.print("curso_asignatura_seleccionada_profesor");
		System.out.print(curso_asignatura_seleccionada_profesor);
		System.out.print("grupo_seleccionado_profesor");
		System.out.print(grupo_seleccionado_profesor);
		System.out.print("encuestas_asignatura_grupo");
		System.out.print(encuestas_asignatura_grupo);
		request.getSession().setAttribute("encuestas_asignatura_grupo", encuestas_asignatura_grupo);
		getServletContext().getRequestDispatcher("/profesor_resultados.jsp").forward(request,response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
