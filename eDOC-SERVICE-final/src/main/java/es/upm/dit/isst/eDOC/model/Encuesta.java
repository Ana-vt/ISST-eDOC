package es.upm.dit.isst.eDOC.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Encuesta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private boolean entregada;
	
	@JoinColumn(name = "fk_asignatura" )
	@ManyToOne
	private Asignatura asignatura;
	
	@JoinColumn(name = "fk_grupo" )
	@ManyToOne
	private Grupo grupo;
	
	
private double respuesta_Test1;
	
	private double respuesta_Test2;
	
	private double respuesta_Test3;
	
	private double respuesta_Test4;
	
	private double respuesta_Test5;
	
	private double respuesta_Test6;
	
	private double respuesta_Test7;
	
	private double respuesta_Test8;
	
	private double respuesta_Test9;
	
	private double respuesta_Test10;
	
	private double respuesta_Test11;
	
	private double respuesta_Test12;
	
	private double respuesta_Test13;
	
	private double respuesta_Test14;
	
	private double respuesta_Test15;
	
	private double respuesta_Test16;
	
	private double respuesta_Test17;
	
	private double respuesta_Test18;
	
	private double respuesta_Test19;
	
	private double respuesta_Test20;
	
	private double respuesta_Test21;
	
	private double respuesta_Test22;
	
	private double respuesta_Test23;
	
	private double respuesta_Test24;
	
	private double media_Encuesta;
	
	//preguntas 1 y 2
	private double media_Documentacion;
	
	//pregunta 3, 4, 5 y 6
	private double media_Evaluacion;
	
	//pregunta 7,8,9,10,11 y 12
	private double media_Estudiante;

	//pregunta 13 y 14
	private double media_Clases;

	//pregunta 15 hasta la 23
	private double media_Profesorado;
	
	//pregunta 24
	private double media_Satisfaccion;
	
	@Lob
	private String respuesta_Texto;
	
	public Encuesta(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isEntregada() {
		return entregada;
	}

	public void setEntregada(boolean entregada) {
		this.entregada = entregada;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public double getRespuesta_Test1() {
		return respuesta_Test1;
	}

	public void setRespuesta_Test1(double respuesta_Test1) {
		this.respuesta_Test1 = respuesta_Test1;
	}

	public double getRespuesta_Test2() {
		return respuesta_Test2;
	}

	public void setRespuesta_Test2(double respuesta_Test2) {
		this.respuesta_Test2 = respuesta_Test2;
	}

	public double getRespuesta_Test3() {
		return respuesta_Test3;
	}

	public void setRespuesta_Test3(double respuesta_Test3) {
		this.respuesta_Test3 = respuesta_Test3;
	}

	public double getRespuesta_Test4() {
		return respuesta_Test4;
	}

	public void setRespuesta_Test4(double respuesta_Test4) {
		this.respuesta_Test4 = respuesta_Test4;
	}

	public double getRespuesta_Test5() {
		return respuesta_Test5;
	}

	public void setRespuesta_Test5(double respuesta_Test5) {
		this.respuesta_Test5 = respuesta_Test5;
	}

	public double getRespuesta_Test6() {
		return respuesta_Test6;
	}

	public void setRespuesta_Test6(double respuesta_Test6) {
		this.respuesta_Test6 = respuesta_Test6;
	}

	public double getRespuesta_Test7() {
		return respuesta_Test7;
	}

	public void setRespuesta_Test7(double respuesta_Test7) {
		this.respuesta_Test7 = respuesta_Test7;
	}

	public double getRespuesta_Test8() {
		return respuesta_Test8;
	}

	public void setRespuesta_Test8(double respuesta_Test8) {
		this.respuesta_Test8 = respuesta_Test8;
	}

	public double getRespuesta_Test9() {
		return respuesta_Test9;
	}

	public void setRespuesta_Test9(double respuesta_Test9) {
		this.respuesta_Test9 = respuesta_Test9;
	}

	public double getRespuesta_Test10() {
		return respuesta_Test10;
	}

	public void setRespuesta_Test10(double respuesta_Test10) {
		this.respuesta_Test10 = respuesta_Test10;
	}

	public double getRespuesta_Test11() {
		return respuesta_Test11;
	}

	public void setRespuesta_Test11(double respuesta_Test11) {
		this.respuesta_Test11 = respuesta_Test11;
	}

	public double getRespuesta_Test12() {
		return respuesta_Test12;
	}

	public void setRespuesta_Test12(double respuesta_Test12) {
		this.respuesta_Test12 = respuesta_Test12;
	}

	public double getRespuesta_Test13() {
		return respuesta_Test13;
	}

	public void setRespuesta_Test13(double respuesta_Test13) {
		this.respuesta_Test13 = respuesta_Test13;
	}

	public double getRespuesta_Test14() {
		return respuesta_Test14;
	}

	public void setRespuesta_Test14(double respuesta_Test14) {
		this.respuesta_Test14 = respuesta_Test14;
	}

	public double getRespuesta_Test15() {
		return respuesta_Test15;
	}

	public void setRespuesta_Test15(double respuesta_Test15) {
		this.respuesta_Test15 = respuesta_Test15;
	}

	public double getRespuesta_Test16() {
		return respuesta_Test16;
	}

	public void setRespuesta_Test16(double respuesta_Test16) {
		this.respuesta_Test16 = respuesta_Test16;
	}

	public double getRespuesta_Test17() {
		return respuesta_Test17;
	}

	public void setRespuesta_Test17(double respuesta_Test17) {
		this.respuesta_Test17 = respuesta_Test17;
	}

	public double getRespuesta_Test18() {
		return respuesta_Test18;
	}

	public void setRespuesta_Test18(double respuesta_Test18) {
		this.respuesta_Test18 = respuesta_Test18;
	}

	public double getRespuesta_Test19() {
		return respuesta_Test19;
	}

	public void setRespuesta_Test19(double respuesta_Test19) {
		this.respuesta_Test19 = respuesta_Test19;
	}

	public double getRespuesta_Test20() {
		return respuesta_Test20;
	}

	public void setRespuesta_Test20(double respuesta_Test20) {
		this.respuesta_Test20 = respuesta_Test20;
	}

	public double getRespuesta_Test21() {
		return respuesta_Test21;
	}

	public void setRespuesta_Test21(double respuesta_Test21) {
		this.respuesta_Test21 = respuesta_Test21;
	}

	public double getRespuesta_Test22() {
		return respuesta_Test22;
	}

	public void setRespuesta_Test22(double respuesta_Test22) {
		this.respuesta_Test22 = respuesta_Test22;
	}

	public double getRespuesta_Test23() {
		return respuesta_Test23;
	}

	public void setRespuesta_Test23(double respuesta_Test23) {
		this.respuesta_Test23 = respuesta_Test23;
	}

	public double getRespuesta_Test24() {
		return respuesta_Test24;
	}

	public void setRespuesta_Test24(double respuesta_Test24) {
		this.respuesta_Test24 = respuesta_Test24;
	}

	public String getRespuesta_Texto() {
		return respuesta_Texto;
	}

	public void setRespuesta_Texto(String respuesta_Texto) {
		this.respuesta_Texto = respuesta_Texto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	public double getMedia_Encuesta() {
		return media_Encuesta;
	}

	public void setMedia_Encuesta(double media_Encuesta) {
		this.media_Encuesta = media_Encuesta;
	}

	public double getMedia_Documentacion() {
		return media_Documentacion;
	}

	public void setMedia_Documentacion(double media_Documentacion) {
		this.media_Documentacion = media_Documentacion;
	}

	public double getMedia_Evaluacion() {
		return media_Evaluacion;
	}

	public void setMedia_Evaluacion(double media_Evaluacion) {
		this.media_Evaluacion = media_Evaluacion;
	}

	public double getMedia_Estudiante() {
		return media_Estudiante;
	}

	public void setMedia_Estudiante(double media_Estudiante) {
		this.media_Estudiante = media_Estudiante;
	}

	public double getMedia_Clases() {
		return media_Clases;
	}

	public void setMedia_Clases(double media_Clases) {
		this.media_Clases = media_Clases;
	}

	public double getMedia_Profesorado() {
		return media_Profesorado;
	}

	public void setMedia_Profesorado(double media_Profesorado) {
		this.media_Profesorado = media_Profesorado;
	}

	public double getMedia_Satisfaccion() {
		return media_Satisfaccion;
	}

	public void setMedia_Satisfaccion(double media_Satisfaccion) {
		this.media_Satisfaccion = media_Satisfaccion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asignatura == null) ? 0 : asignatura.hashCode());
		result = prime * result + (entregada ? 1231 : 1237);
		result = prime * result + ((grupo == null) ? 0 : grupo.hashCode());
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(media_Clases);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(media_Documentacion);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(media_Encuesta);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(media_Estudiante);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(media_Evaluacion);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(media_Profesorado);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(media_Satisfaccion);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test10);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test11);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test12);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test13);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test14);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test15);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test16);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test17);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test18);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test19);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test20);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test21);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test22);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test23);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test24);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test4);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test5);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test6);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test7);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test8);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(respuesta_Test9);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((respuesta_Texto == null) ? 0 : respuesta_Texto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Encuesta other = (Encuesta) obj;
		if (asignatura == null) {
			if (other.asignatura != null)
				return false;
		} else if (!asignatura.equals(other.asignatura))
			return false;
		if (entregada != other.entregada)
			return false;
		if (grupo == null) {
			if (other.grupo != null)
				return false;
		} else if (!grupo.equals(other.grupo))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(media_Clases) != Double.doubleToLongBits(other.media_Clases))
			return false;
		if (Double.doubleToLongBits(media_Documentacion) != Double.doubleToLongBits(other.media_Documentacion))
			return false;
		if (Double.doubleToLongBits(media_Encuesta) != Double.doubleToLongBits(other.media_Encuesta))
			return false;
		if (Double.doubleToLongBits(media_Estudiante) != Double.doubleToLongBits(other.media_Estudiante))
			return false;
		if (Double.doubleToLongBits(media_Evaluacion) != Double.doubleToLongBits(other.media_Evaluacion))
			return false;
		if (Double.doubleToLongBits(media_Profesorado) != Double.doubleToLongBits(other.media_Profesorado))
			return false;
		if (Double.doubleToLongBits(media_Satisfaccion) != Double.doubleToLongBits(other.media_Satisfaccion))
			return false;
		if (Double.doubleToLongBits(respuesta_Test1) != Double.doubleToLongBits(other.respuesta_Test1))
			return false;
		if (Double.doubleToLongBits(respuesta_Test10) != Double.doubleToLongBits(other.respuesta_Test10))
			return false;
		if (Double.doubleToLongBits(respuesta_Test11) != Double.doubleToLongBits(other.respuesta_Test11))
			return false;
		if (Double.doubleToLongBits(respuesta_Test12) != Double.doubleToLongBits(other.respuesta_Test12))
			return false;
		if (Double.doubleToLongBits(respuesta_Test13) != Double.doubleToLongBits(other.respuesta_Test13))
			return false;
		if (Double.doubleToLongBits(respuesta_Test14) != Double.doubleToLongBits(other.respuesta_Test14))
			return false;
		if (Double.doubleToLongBits(respuesta_Test15) != Double.doubleToLongBits(other.respuesta_Test15))
			return false;
		if (Double.doubleToLongBits(respuesta_Test16) != Double.doubleToLongBits(other.respuesta_Test16))
			return false;
		if (Double.doubleToLongBits(respuesta_Test17) != Double.doubleToLongBits(other.respuesta_Test17))
			return false;
		if (Double.doubleToLongBits(respuesta_Test18) != Double.doubleToLongBits(other.respuesta_Test18))
			return false;
		if (Double.doubleToLongBits(respuesta_Test19) != Double.doubleToLongBits(other.respuesta_Test19))
			return false;
		if (Double.doubleToLongBits(respuesta_Test2) != Double.doubleToLongBits(other.respuesta_Test2))
			return false;
		if (Double.doubleToLongBits(respuesta_Test20) != Double.doubleToLongBits(other.respuesta_Test20))
			return false;
		if (Double.doubleToLongBits(respuesta_Test21) != Double.doubleToLongBits(other.respuesta_Test21))
			return false;
		if (Double.doubleToLongBits(respuesta_Test22) != Double.doubleToLongBits(other.respuesta_Test22))
			return false;
		if (Double.doubleToLongBits(respuesta_Test23) != Double.doubleToLongBits(other.respuesta_Test23))
			return false;
		if (Double.doubleToLongBits(respuesta_Test24) != Double.doubleToLongBits(other.respuesta_Test24))
			return false;
		if (Double.doubleToLongBits(respuesta_Test3) != Double.doubleToLongBits(other.respuesta_Test3))
			return false;
		if (Double.doubleToLongBits(respuesta_Test4) != Double.doubleToLongBits(other.respuesta_Test4))
			return false;
		if (Double.doubleToLongBits(respuesta_Test5) != Double.doubleToLongBits(other.respuesta_Test5))
			return false;
		if (Double.doubleToLongBits(respuesta_Test6) != Double.doubleToLongBits(other.respuesta_Test6))
			return false;
		if (Double.doubleToLongBits(respuesta_Test7) != Double.doubleToLongBits(other.respuesta_Test7))
			return false;
		if (Double.doubleToLongBits(respuesta_Test8) != Double.doubleToLongBits(other.respuesta_Test8))
			return false;
		if (Double.doubleToLongBits(respuesta_Test9) != Double.doubleToLongBits(other.respuesta_Test9))
			return false;
		if (respuesta_Texto == null) {
			if (other.respuesta_Texto != null)
				return false;
		} else if (!respuesta_Texto.equals(other.respuesta_Texto))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Encuesta [id=" + id + ", entregada=" + entregada + ", asignatura=" + asignatura + ", grupo=" + grupo
				+ ", respuesta_Test1=" + respuesta_Test1 + ", respuesta_Test2=" + respuesta_Test2 + ", respuesta_Test3="
				+ respuesta_Test3 + ", respuesta_Test4=" + respuesta_Test4 + ", respuesta_Test5=" + respuesta_Test5
				+ ", respuesta_Test6=" + respuesta_Test6 + ", respuesta_Test7=" + respuesta_Test7 + ", respuesta_Test8="
				+ respuesta_Test8 + ", respuesta_Test9=" + respuesta_Test9 + ", respuesta_Test10=" + respuesta_Test10
				+ ", respuesta_Test11=" + respuesta_Test11 + ", respuesta_Test12=" + respuesta_Test12
				+ ", respuesta_Test13=" + respuesta_Test13 + ", respuesta_Test14=" + respuesta_Test14
				+ ", respuesta_Test15=" + respuesta_Test15 + ", respuesta_Test16=" + respuesta_Test16
				+ ", respuesta_Test17=" + respuesta_Test17 + ", respuesta_Test18=" + respuesta_Test18
				+ ", respuesta_Test19=" + respuesta_Test19 + ", respuesta_Test20=" + respuesta_Test20
				+ ", respuesta_Test21=" + respuesta_Test21 + ", respuesta_Test22=" + respuesta_Test22
				+ ", respuesta_Test23=" + respuesta_Test23 + ", respuesta_Test24=" + respuesta_Test24
				+ ", media_Encuesta=" + media_Encuesta + ", media_Documentacion=" + media_Documentacion
				+ ", media_Evaluacion=" + media_Evaluacion + ", media_Estudiante=" + media_Estudiante
				+ ", media_Clases=" + media_Clases + ", media_Profesorado=" + media_Profesorado
				+ ", media_Satisfaccion=" + media_Satisfaccion + ", respuesta_Texto=" + respuesta_Texto + "]";
	}

	

	
	
}
