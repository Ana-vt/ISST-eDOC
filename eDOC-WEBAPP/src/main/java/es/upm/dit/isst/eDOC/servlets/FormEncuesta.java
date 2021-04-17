package es.upm.dit.isst.eDOC.servlets;

import java.io.IOException;

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

import es.upm.dit.isst.eDOC.model.Encuesta;

/**
 * Servlet implementation class FormEncuesta
 */
@WebServlet("/FormEncuesta")
public class FormEncuesta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Encuesta encuesta = new Encuesta();
		//encuesta.setAsignatura();
		encuesta.setRespuesta_Texto(request.getParameter("texto"));
		Client client = ClientBuilder.newClient(new ClientConfig());
		Response r = client.target(URLHelper.getURL()).request()
                .post(Entity.entity(encuesta, MediaType.APPLICATION_JSON)
               , Response.class);
       // if (r.getStatus() == 200) {
        		request.getSession().setAttribute("encuesta", encuesta);
                getServletContext().getRequestDispatcher("/alumno_encuestas.html")
                      .forward(request, response);
                return;
       // }
        
        //getServletContext().getRequestDispatcher("/alumno_encuestas.html").forward(request, response);;
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
