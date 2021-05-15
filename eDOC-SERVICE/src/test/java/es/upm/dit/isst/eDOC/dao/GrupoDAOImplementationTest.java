package es.upm.dit.isst.eDOC.dao;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import es.upm.dit.isst.eDOC.model.Grupo;

class GrupoDAOImplementationTest {

	@Test
	void testGrupo() {
		GrupoDAO grupodao = GrupoDAOImplementation.getInstance();
		
		Grupo grupo = new Grupo();

		grupo.setId(1);
		
		
		grupodao.create(grupo);
		Grupo grupo2 = grupodao.read(1);
		assertEquals(grupo2.getId(), grupo.getId());
		assertEquals(grupo2.getId(), 1);
				
		grupodao.delete(grupo);
		grupo2 = grupodao.read(1);
		assertNull(grupo2);
		
	}

}
