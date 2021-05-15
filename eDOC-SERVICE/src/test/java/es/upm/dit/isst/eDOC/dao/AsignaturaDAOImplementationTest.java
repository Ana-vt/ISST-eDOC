package es.upm.dit.isst.eDOC.dao;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import es.upm.dit.isst.eDOC.model.Asignatura;

class AsignaturaDAOImplementationTest {

	@Test
	void testAsignatura() {
		AsignaturaDAO asignaturadao = AsignaturaDAOImplementation.getInstance();
		
		Asignatura asignatura = new Asignatura();
	
		asignatura.setId(1);
		asignatura.setName("Electromagnetismo");
		asignatura.setAcronimo("ELMG");
		asignatura.setCurso(2);
		asignatura.setSemestre(1);
		asignatura.setUsuarios_matriculados(200);
		
		asignaturadao.create(asignatura);
		Asignatura asignatura2 = asignaturadao.read(1);
		assertEquals(asignatura2.getName(), asignatura.getName());
		assertEquals(asignatura2.getName(), "Electromagnetismo");
		
		asignatura.setAcronimo("EM");
		asignaturadao.update(asignatura);
		asignatura2 = asignaturadao.read(1);
		assertNotEquals(asignatura2.getAcronimo(), "ELMG");
		
		asignaturadao.delete(asignatura);
		asignatura2 = asignaturadao.read(1);
		assertNull(asignatura2);
		
	}
}
