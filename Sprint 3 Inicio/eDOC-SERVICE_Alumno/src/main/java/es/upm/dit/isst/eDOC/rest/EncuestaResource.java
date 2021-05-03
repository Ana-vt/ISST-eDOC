package es.upm.dit.isst.eDOC.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import es.upm.dit.isst.eDOC.dao.EncuestaDAOImplementation;
import es.upm.dit.isst.eDOC.model.Asignatura;
import es.upm.dit.isst.eDOC.model.Encuesta;
import es.upm.dit.isst.eDOC.model.Grupo;

@Path("/Encuestas")
public class EncuestaResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Encuesta> readAll () {
	     return EncuestaDAOImplementation.getInstance().readAll();
	}
	
	/*
	@GET
	@Path("asignatura/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Encuesta> readAll_asignatura (@PathParam("id") Asignatura id) {
	   return EncuestaDAOImplementation.getInstance().readAll_asignatura(id);
	}
	
	@GET
	@Path("asignatura/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Encuesta> readAll_grupo (@PathParam("id") Grupo id) {
	   return EncuestaDAOImplementation.getInstance().readAll_grupo(id);
	}
	*/
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Encuesta tnew) throws URISyntaxException {
		Encuesta t = EncuestaDAOImplementation.getInstance().create(tnew);
	    if (t != null) {
	       URI uri = new URI("/eDOC-SERVICE/rest/Encuestas/" + t.getId());
	       return Response.created(uri).build();
	    }
	    return Response.status(Response.Status.NOT_FOUND).build();
	}
	
	@DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") int  id) {
        Encuesta rold = EncuestaDAOImplementation.getInstance().read(id);
        if (rold == null)
            return Response.notModified().build();
        EncuestaDAOImplementation.getInstance().delete(rold);
        return Response.ok().build();
    }

}

