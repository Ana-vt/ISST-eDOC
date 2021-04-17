package es.upm.dit.isst.eDOC.model;

import java.io.Serializable;
import java.util.Arrays;
import javax.persistence.*;

@Entity
public class Encuesta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private boolean Entregada;
	private char Asignatura;
	private int fk_Resultado;
	private String Pregunta_Test1;
	private double Respuesta_Test1;
	private String Pregunta_Test2;
	private double Respuesta_Test2;
	private String Pregunta_Test3;
	private double Respuesta_Test3;
	private String Pregunta_Test4;
	private double Respuesta_Test4;
	private String Pregunta_Test5;
	private double Respuesta_Test5;
	private String Pregunta_Test6;
	private double Respuesta_Test6;
	private String Pregunta_Test7;
	private double Respuesta_Test7;
	private String Pregunta_Test8;
	private double Respuesta_Test8;
	private String Pregunta_Test9;
	private double Respuesta_Test9;
	private String Pregunta_Test10;
	private double Respuesta_Test10;
	private String Pregunta_Test11;
	private double Respuesta_Test11;
	private String Pregunta_Test12;
	private double Respuesta_Test12;
	private String Pregunta_Test13;
	private double Respuesta_Test13;
	private String Pregunta_Test14;
	private double Respuesta_Test14;
	private String Pregunta_Test15;
	private double Respuesta_Test15;
	@Lob
	private String Respuesta_Texto;
	
	public Encuesta(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isEntregada() {
		return Entregada;
	}

	public void setEntregada(boolean entregada) {
		Entregada = entregada;
	}

	public char getAsignatura() {
		return Asignatura;
	}

	public void setAsignatura(char asignatura) {
		Asignatura = asignatura;
	}

	public int getFk_Resultado() {
		return fk_Resultado;
	}

	public void setFk_Resultado(int fk_Resultado) {
		this.fk_Resultado = fk_Resultado;
	}

	public double getRespuesta_Test1() {
		return Respuesta_Test1;
	}

	public void setRespuesta_Test1(double respuesta_Test1) {
		Respuesta_Test1 = respuesta_Test1;
	}

	public double getRespuesta_Test2() {
		return Respuesta_Test2;
	}

	public void setRespuesta_Test2(double respuesta_Test2) {
		Respuesta_Test2 = respuesta_Test2;
	}

	public double getRespuesta_Test3() {
		return Respuesta_Test3;
	}

	public void setRespuesta_Test3(double respuesta_Test3) {
		Respuesta_Test3 = respuesta_Test3;
	}

	public double getRespuesta_Test4() {
		return Respuesta_Test4;
	}

	public void setRespuesta_Test4(double respuesta_Test4) {
		Respuesta_Test4 = respuesta_Test4;
	}

	public double getRespuesta_Test5() {
		return Respuesta_Test5;
	}

	public void setRespuesta_Test5(double respuesta_Test5) {
		Respuesta_Test5 = respuesta_Test5;
	}

	public double getRespuesta_Test6() {
		return Respuesta_Test6;
	}

	public void setRespuesta_Test6(double respuesta_Test6) {
		Respuesta_Test6 = respuesta_Test6;
	}

	public double getRespuesta_Test7() {
		return Respuesta_Test7;
	}

	public void setRespuesta_Test7(double respuesta_Test7) {
		Respuesta_Test7 = respuesta_Test7;
	}

	public double getRespuesta_Test8() {
		return Respuesta_Test8;
	}

	public void setRespuesta_Test8(double respuesta_Test8) {
		Respuesta_Test8 = respuesta_Test8;
	}

	public double getRespuesta_Test9() {
		return Respuesta_Test9;
	}

	public void setRespuesta_Test9(double respuesta_Test9) {
		Respuesta_Test9 = respuesta_Test9;
	}

	public double getRespuesta_Test10() {
		return Respuesta_Test10;
	}

	public void setRespuesta_Test10(double respuesta_Test10) {
		Respuesta_Test10 = respuesta_Test10;
	}

	public double getRespuesta_Test11() {
		return Respuesta_Test11;
	}

	public void setRespuesta_Test11(double respuesta_Test11) {
		Respuesta_Test11 = respuesta_Test11;
	}

	public double getRespuesta_Test12() {
		return Respuesta_Test12;
	}

	public void setRespuesta_Test12(double respuesta_Test12) {
		Respuesta_Test12 = respuesta_Test12;
	}

	public double getRespuesta_Test13() {
		return Respuesta_Test13;
	}

	public void setRespuesta_Test13(double respuesta_Test13) {
		Respuesta_Test13 = respuesta_Test13;
	}

	public double getRespuesta_Test14() {
		return Respuesta_Test14;
	}

	public void setRespuesta_Test14(double respuesta_Test14) {
		Respuesta_Test14 = respuesta_Test14;
	}

	public double getRespuesta_Test15() {
		return Respuesta_Test15;
	}

	public void setRespuesta_Test15(double respuesta_Test15) {
		Respuesta_Test15 = respuesta_Test15;
	}

	public String getRespuesta_Texto() {
		return Respuesta_Texto;
	}

	public void setRespuesta_Texto(String respuesta_Texto) {
		Respuesta_Texto = respuesta_Texto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Asignatura;
		result = prime * result + (Entregada ? 1231 : 1237);
		result = prime * result + ((Pregunta_Test1 == null) ? 0 : Pregunta_Test1.hashCode());
		result = prime * result + ((Pregunta_Test10 == null) ? 0 : Pregunta_Test10.hashCode());
		result = prime * result + ((Pregunta_Test11 == null) ? 0 : Pregunta_Test11.hashCode());
		result = prime * result + ((Pregunta_Test12 == null) ? 0 : Pregunta_Test12.hashCode());
		result = prime * result + ((Pregunta_Test13 == null) ? 0 : Pregunta_Test13.hashCode());
		result = prime * result + ((Pregunta_Test14 == null) ? 0 : Pregunta_Test14.hashCode());
		result = prime * result + ((Pregunta_Test15 == null) ? 0 : Pregunta_Test15.hashCode());
		result = prime * result + ((Pregunta_Test2 == null) ? 0 : Pregunta_Test2.hashCode());
		result = prime * result + ((Pregunta_Test3 == null) ? 0 : Pregunta_Test3.hashCode());
		result = prime * result + ((Pregunta_Test4 == null) ? 0 : Pregunta_Test4.hashCode());
		result = prime * result + ((Pregunta_Test5 == null) ? 0 : Pregunta_Test5.hashCode());
		result = prime * result + ((Pregunta_Test6 == null) ? 0 : Pregunta_Test6.hashCode());
		result = prime * result + ((Pregunta_Test7 == null) ? 0 : Pregunta_Test7.hashCode());
		result = prime * result + ((Pregunta_Test8 == null) ? 0 : Pregunta_Test8.hashCode());
		result = prime * result + ((Pregunta_Test9 == null) ? 0 : Pregunta_Test9.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Respuesta_Test1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test10);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test11);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test12);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test13);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test14);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test15);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test4);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test5);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test6);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test7);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test8);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test9);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((Respuesta_Texto == null) ? 0 : Respuesta_Texto.hashCode());
		result = prime * result + fk_Resultado;
		result = prime * result + id;
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
		if (Asignatura != other.Asignatura)
			return false;
		if (Entregada != other.Entregada)
			return false;
		if (Pregunta_Test1 == null) {
			if (other.Pregunta_Test1 != null)
				return false;
		} else if (!Pregunta_Test1.equals(other.Pregunta_Test1))
			return false;
		if (Pregunta_Test10 == null) {
			if (other.Pregunta_Test10 != null)
				return false;
		} else if (!Pregunta_Test10.equals(other.Pregunta_Test10))
			return false;
		if (Pregunta_Test11 == null) {
			if (other.Pregunta_Test11 != null)
				return false;
		} else if (!Pregunta_Test11.equals(other.Pregunta_Test11))
			return false;
		if (Pregunta_Test12 == null) {
			if (other.Pregunta_Test12 != null)
				return false;
		} else if (!Pregunta_Test12.equals(other.Pregunta_Test12))
			return false;
		if (Pregunta_Test13 == null) {
			if (other.Pregunta_Test13 != null)
				return false;
		} else if (!Pregunta_Test13.equals(other.Pregunta_Test13))
			return false;
		if (Pregunta_Test14 == null) {
			if (other.Pregunta_Test14 != null)
				return false;
		} else if (!Pregunta_Test14.equals(other.Pregunta_Test14))
			return false;
		if (Pregunta_Test15 == null) {
			if (other.Pregunta_Test15 != null)
				return false;
		} else if (!Pregunta_Test15.equals(other.Pregunta_Test15))
			return false;
		if (Pregunta_Test2 == null) {
			if (other.Pregunta_Test2 != null)
				return false;
		} else if (!Pregunta_Test2.equals(other.Pregunta_Test2))
			return false;
		if (Pregunta_Test3 == null) {
			if (other.Pregunta_Test3 != null)
				return false;
		} else if (!Pregunta_Test3.equals(other.Pregunta_Test3))
			return false;
		if (Pregunta_Test4 == null) {
			if (other.Pregunta_Test4 != null)
				return false;
		} else if (!Pregunta_Test4.equals(other.Pregunta_Test4))
			return false;
		if (Pregunta_Test5 == null) {
			if (other.Pregunta_Test5 != null)
				return false;
		} else if (!Pregunta_Test5.equals(other.Pregunta_Test5))
			return false;
		if (Pregunta_Test6 == null) {
			if (other.Pregunta_Test6 != null)
				return false;
		} else if (!Pregunta_Test6.equals(other.Pregunta_Test6))
			return false;
		if (Pregunta_Test7 == null) {
			if (other.Pregunta_Test7 != null)
				return false;
		} else if (!Pregunta_Test7.equals(other.Pregunta_Test7))
			return false;
		if (Pregunta_Test8 == null) {
			if (other.Pregunta_Test8 != null)
				return false;
		} else if (!Pregunta_Test8.equals(other.Pregunta_Test8))
			return false;
		if (Pregunta_Test9 == null) {
			if (other.Pregunta_Test9 != null)
				return false;
		} else if (!Pregunta_Test9.equals(other.Pregunta_Test9))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test1) != Double.doubleToLongBits(other.Respuesta_Test1))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test10) != Double.doubleToLongBits(other.Respuesta_Test10))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test11) != Double.doubleToLongBits(other.Respuesta_Test11))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test12) != Double.doubleToLongBits(other.Respuesta_Test12))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test13) != Double.doubleToLongBits(other.Respuesta_Test13))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test14) != Double.doubleToLongBits(other.Respuesta_Test14))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test15) != Double.doubleToLongBits(other.Respuesta_Test15))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test2) != Double.doubleToLongBits(other.Respuesta_Test2))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test3) != Double.doubleToLongBits(other.Respuesta_Test3))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test4) != Double.doubleToLongBits(other.Respuesta_Test4))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test5) != Double.doubleToLongBits(other.Respuesta_Test5))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test6) != Double.doubleToLongBits(other.Respuesta_Test6))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test7) != Double.doubleToLongBits(other.Respuesta_Test7))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test8) != Double.doubleToLongBits(other.Respuesta_Test8))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test9) != Double.doubleToLongBits(other.Respuesta_Test9))
			return false;
		if (Respuesta_Texto == null) {
			if (other.Respuesta_Texto != null)
				return false;
		} else if (!Respuesta_Texto.equals(other.Respuesta_Texto))
			return false;
		if (fk_Resultado != other.fk_Resultado)
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Encuesta [id=" + id + ", Entregada=" + Entregada + ", Asignatura=" + Asignatura + ", fk_Resultado="
				+ fk_Resultado + ", Pregunta_Test1=" + Pregunta_Test1 + ", Respuesta_Test1=" + Respuesta_Test1
				+ ", Pregunta_Test2=" + Pregunta_Test2 + ", Respuesta_Test2=" + Respuesta_Test2 + ", Pregunta_Test3="
				+ Pregunta_Test3 + ", Respuesta_Test3=" + Respuesta_Test3 + ", Pregunta_Test4=" + Pregunta_Test4
				+ ", Respuesta_Test4=" + Respuesta_Test4 + ", Pregunta_Test5=" + Pregunta_Test5 + ", Respuesta_Test5="
				+ Respuesta_Test5 + ", Pregunta_Test6=" + Pregunta_Test6 + ", Respuesta_Test6=" + Respuesta_Test6
				+ ", Pregunta_Test7=" + Pregunta_Test7 + ", Respuesta_Test7=" + Respuesta_Test7 + ", Pregunta_Test8="
				+ Pregunta_Test8 + ", Respuesta_Test8=" + Respuesta_Test8 + ", Pregunta_Test9=" + Pregunta_Test9
				+ ", Respuesta_Test9=" + Respuesta_Test9 + ", Pregunta_Test10=" + Pregunta_Test10
				+ ", Respuesta_Test10=" + Respuesta_Test10 + ", Pregunta_Test11=" + Pregunta_Test11
				+ ", Respuesta_Test11=" + Respuesta_Test11 + ", Pregunta_Test12=" + Pregunta_Test12
				+ ", Respuesta_Test12=" + Respuesta_Test12 + ", Pregunta_Test13=" + Pregunta_Test13
				+ ", Respuesta_Test13=" + Respuesta_Test13 + ", Pregunta_Test14=" + Pregunta_Test14
				+ ", Respuesta_Test14=" + Respuesta_Test14 + ", Pregunta_Test15=" + Pregunta_Test15
				+ ", Respuesta_Test15=" + Respuesta_Test15 + ", Respuesta_Texto=" + Respuesta_Texto + "]";
	}

	
}
