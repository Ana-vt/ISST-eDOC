import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import es.upm.dit.isst.eDOC.dao.EncuestaDAOImplementation;
import es.upm.dit.isst.eDOC.model.Encuesta;

class TestEncuesta {

	@Test
	void test() {
		
        Encuesta encuesta = new Encuesta();
        encuesta.setId(1);
        encuesta.setEntregada(true);
        encuesta.setRespuesta_Texto("Prueba");
 		encuesta.setRespuesta_Test1(7.5);
 		encuesta.setRespuesta_Test2(0);
 		encuesta.setRespuesta_Test3(0);
 		encuesta.setRespuesta_Test4(0);
 		encuesta.setRespuesta_Test5(0);
 		encuesta.setRespuesta_Test6(0);
 		encuesta.setRespuesta_Test7(0);
 		encuesta.setRespuesta_Test8(0);
 		encuesta.setRespuesta_Test9(0);
 		encuesta.setRespuesta_Test10(0);
 		encuesta.setRespuesta_Test11(0);
 		encuesta.setRespuesta_Test12(0);
 		encuesta.setRespuesta_Test13(0);
 		encuesta.setRespuesta_Test14(0);
 		encuesta.setRespuesta_Test15(0);
 		encuesta.setRespuesta_Test16(0);
 		encuesta.setRespuesta_Test17(0);
 		encuesta.setRespuesta_Test18(0);
 		encuesta.setRespuesta_Test19(0);
 		encuesta.setRespuesta_Test20(0);
 		encuesta.setRespuesta_Test21(0);
 		encuesta.setRespuesta_Test22(0);
 		encuesta.setRespuesta_Test23(0);
 		encuesta.setRespuesta_Test24(0);
 		encuesta.setMedia_Documentacion(0);
 		encuesta.setMedia_Evaluacion(0);
 		encuesta.setMedia_Estudiante(0);
 		encuesta.setMedia_Clases(0);
 		encuesta.setMedia_Profesorado(0);
 		encuesta.setMedia_Satisfaccion(0);
 		encuesta.setMedia_Encuesta(0);
         
         //Creamos una encuesta
         EncuestaDAOImplementation.getInstance().create(encuesta);
         
         //Comprobamos el create y el read del DAOImplementation
         Encuesta encuesta2 = EncuestaDAOImplementation.getInstance().read(1);
         assertEquals(encuesta2.isEntregada(), encuesta.isEntregada());
         assertEquals(encuesta2.getRespuesta_Test1(), 7.5);
         
         //Comprobamos el Update del DAOImplementation
         encuesta.setRespuesta_Test2(5);
         EncuestaDAOImplementation.getInstance().update(encuesta);
         encuesta2 = EncuestaDAOImplementation.getInstance().read(1);
         assertNotEquals(encuesta2.getRespuesta_Test2(), 2.5);
         
         //Comprobamos el delete del DAOImplementation
         EncuestaDAOImplementation.getInstance().delete(encuesta);
         encuesta2 = EncuestaDAOImplementation.getInstance().read(1);
         assertNull(encuesta2);


	}

}
