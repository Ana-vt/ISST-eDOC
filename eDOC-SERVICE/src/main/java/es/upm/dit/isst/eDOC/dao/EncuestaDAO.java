package es.upm.dit.isst.eDOC.dao;
import java.util.List;

import es.upm.dit.isst.eDOC.model.*;


public interface EncuestaDAO {
	
	public Encuesta create(Encuesta encuesta);
	public Encuesta read(char id);
	public Encuesta update(Encuesta encuesta);
	public Encuesta delete(Encuesta encuesta);
	public List<Encuesta> readAll();
	public List<Encuesta> readAll(char asignatura); //para leer las encuestas de una asignatura.

}
