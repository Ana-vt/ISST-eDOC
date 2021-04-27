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
	
	
	private double Respuesta_Test1;
	
	private double Respuesta_Test2;
	
	private double Respuesta_Test3;
	
	private double Respuesta_Test4;
	
	private double Respuesta_Test5;
	
	private double Respuesta_Test6;
	
	private double Respuesta_Test7;
	
	private double Respuesta_Test8;
	
	private double Respuesta_Test9;
	
	private double Respuesta_Test10;
	
	private double Respuesta_Test11;
	
	private double Respuesta_Test12;
	
	private double Respuesta_Test13;
	
	private double Respuesta_Test14;
	
	private double Respuesta_Test15;
	
	private double Respuesta_Test16;
	
	private double Respuesta_Test17;
	
	private double Respuesta_Test18;
	
	private double Respuesta_Test19;
	
	private double Respuesta_Test20;
	
	private double Respuesta_Test21;
	
	private double Respuesta_Test22;
	
	private double Respuesta_Test23;
	
	private double Respuesta_Test24;
	
	public double getRespuesta_Test16() {
		return Respuesta_Test16;
	}

	public void setRespuesta_Test16(double respuesta_Test16) {
		Respuesta_Test16 = respuesta_Test16;
	}

	public double getRespuesta_Test17() {
		return Respuesta_Test17;
	}

	public void setRespuesta_Test17(double respuesta_Test17) {
		Respuesta_Test17 = respuesta_Test17;
	}

	public double getRespuesta_Test18() {
		return Respuesta_Test18;
	}

	public void setRespuesta_Test18(double respuesta_Test18) {
		Respuesta_Test18 = respuesta_Test18;
	}

	public double getRespuesta_Test19() {
		return Respuesta_Test19;
	}

	public void setRespuesta_Test19(double respuesta_Test19) {
		Respuesta_Test19 = respuesta_Test19;
	}

	public double getRespuesta_Test20() {
		return Respuesta_Test20;
	}

	public void setRespuesta_Test20(double respuesta_Test20) {
		Respuesta_Test20 = respuesta_Test20;
	}

	public double getRespuesta_Test21() {
		return Respuesta_Test21;
	}

	public void setRespuesta_Test21(double respuesta_Test21) {
		Respuesta_Test21 = respuesta_Test21;
	}

	public double getRespuesta_Test22() {
		return Respuesta_Test22;
	}

	public void setRespuesta_Test22(double respuesta_Test22) {
		Respuesta_Test22 = respuesta_Test22;
	}

	public double getRespuesta_Test23() {
		return Respuesta_Test23;
	}

	public void setRespuesta_Test23(double respuesta_Test23) {
		Respuesta_Test23 = respuesta_Test23;
	}

	public double getRespuesta_Test24() {
		return Respuesta_Test24;
	}

	public void setRespuesta_Test24(double respuesta_Test24) {
		Respuesta_Test24 = respuesta_Test24;
	}

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
		temp = Double.doubleToLongBits(Respuesta_Test16);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test17);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test18);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test19);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test20);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test21);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test22);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test23);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Respuesta_Test24);
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
		if (Double.doubleToLongBits(Respuesta_Test16) != Double.doubleToLongBits(other.Respuesta_Test16))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test17) != Double.doubleToLongBits(other.Respuesta_Test17))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test18) != Double.doubleToLongBits(other.Respuesta_Test18))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test19) != Double.doubleToLongBits(other.Respuesta_Test19))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test2) != Double.doubleToLongBits(other.Respuesta_Test2))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test20) != Double.doubleToLongBits(other.Respuesta_Test20))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test21) != Double.doubleToLongBits(other.Respuesta_Test21))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test22) != Double.doubleToLongBits(other.Respuesta_Test22))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test23) != Double.doubleToLongBits(other.Respuesta_Test23))
			return false;
		if (Double.doubleToLongBits(Respuesta_Test24) != Double.doubleToLongBits(other.Respuesta_Test24))
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
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Encuesta [id=" + id + ", Entregada=" + Entregada + ", Asignatura=" + Asignatura + ", Respuesta_Test1="
				+ Respuesta_Test1 + ", Respuesta_Test2=" + Respuesta_Test2 + ", Respuesta_Test3=" + Respuesta_Test3
				+ ", Respuesta_Test4=" + Respuesta_Test4 + ", Respuesta_Test5=" + Respuesta_Test5 + ", Respuesta_Test6="
				+ Respuesta_Test6 + ", Respuesta_Test7=" + Respuesta_Test7 + ", Respuesta_Test8=" + Respuesta_Test8
				+ ", Respuesta_Test9=" + Respuesta_Test9 + ", Respuesta_Test10=" + Respuesta_Test10
				+ ", Respuesta_Test11=" + Respuesta_Test11 + ", Respuesta_Test12=" + Respuesta_Test12
				+ ", Respuesta_Test13=" + Respuesta_Test13 + ", Respuesta_Test14=" + Respuesta_Test14
				+ ", Respuesta_Test15=" + Respuesta_Test15 + ", Respuesta_Test16=" + Respuesta_Test16
				+ ", Respuesta_Test17=" + Respuesta_Test17 + ", Respuesta_Test18=" + Respuesta_Test18
				+ ", Respuesta_Test19=" + Respuesta_Test19 + ", Respuesta_Test20=" + Respuesta_Test20
				+ ", Respuesta_Test21=" + Respuesta_Test21 + ", Respuesta_Test22=" + Respuesta_Test22
				+ ", Respuesta_Test23=" + Respuesta_Test23 + ", Respuesta_Test24=" + Respuesta_Test24
				+ ", Respuesta_Texto=" + Respuesta_Texto + "]";
	}


	



	

	

	
}
