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
		
		
		
		Client client = ClientBuilder.newClient(new ClientConfig());
		Response r = client.target(URLHelperEncuestas.getURL()).request()
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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
