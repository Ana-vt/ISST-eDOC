package es.upm.dit.isst.eDOC.dao;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import es.upm.dit.isst.eDOC.model.Usuario;

class UsuarioDAOImplementationTest {
	

	@Test
	void testUsuario() {
		UsuarioDAO usuariodao = UsuarioDAOImplementation.getInstance();
		
		Usuario usuario = new Usuario();

		usuario.setId(1);
		usuario.setName("Jambrina");
		usuario.setEmail("j.fdez.jambrina@upm.es");
		usuario.setPassword("jambrina123");
		usuario.setRol("profesor");
		usuario.setDepartamento("SSR");
		
		usuariodao.create(usuario);
		Usuario usuario2 = usuariodao.read(1);
		assertEquals(usuario2.getEmail(), usuario.getEmail());
		assertEquals(usuario2.getName(), "Jambrina");
		
		usuario.setEmail("jambrina@upm.es");
		usuariodao.update(usuario);
		usuario2 = usuariodao.read(1);
		assertNotEquals(usuario2.getEmail(), "j.fdez.jambrina@upm.es");
		
		usuariodao.delete(usuario);
		usuario2 = usuariodao.read(1);
		assertNull(usuario2);
		
	}

}
