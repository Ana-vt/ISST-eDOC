package es.upm.dit.isst.eDOC.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;


import es.upm.dit.isst.eDOC.model.Usuario;


public class UsuarioDAOImplementation implements UsuarioDAO {
	private static  UsuarioDAOImplementation instancia = null;
	private UsuarioDAOImplementation() {
	}
	
	public static UsuarioDAOImplementation getInstance() {
		if( null == instancia )
		   instancia = new UsuarioDAOImplementation();
		return instancia;
	}
	
	@Override
	public Usuario create(Usuario usuario) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		try {
			session.save(usuario);
		} catch (Exception e) {
			usuario = null;
		}
		session.getTransaction().commit();
		session.close();
		return usuario;
	}
	
	@Override
	public Usuario read(int id) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		Usuario usuario = session.get(Usuario.class, id);
		session.getTransaction().commit();
		session.close();
		return usuario;
	}
	@Override
	public Usuario update(Usuario usuario) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		session.saveOrUpdate(usuario);
		session.getTransaction().commit();
		session.close();
		return usuario;
	}
	
	@Override
	public Usuario delete(Usuario usuario) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		session.delete(usuario);
		session.getTransaction().commit();
		session.close();
		return usuario;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> readAll() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		usuarios.addAll(session.createQuery("from Usuario").list());
		session.getTransaction().commit();
		session.close();
		return usuarios;
	}

	@Override
	public List<Usuario> readAll_rol (String rol) {
		List<Usuario> res = new ArrayList<Usuario>();
		for (Usuario usuario : this.readAll())
			if (usuario.getRol() == (rol))
				res.add(usuario);
		return res;
	}
	
	

}