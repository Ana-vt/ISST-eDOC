package es.upm.dit.isst.eDOC.dao;
import java.util.List;

import es.upm.dit.isst.eDOC.model.*;


public interface UsuarioDAO {
	
	public Usuario create(Usuario usuario);
	public Usuario read(int id);
	public Usuario update(Usuario usuario);
	public Usuario delete(Usuario usuario);
	public List<Usuario> readAll();
	public List<Usuario> readAll(String rol); //para leer los usuarios por rol.

}