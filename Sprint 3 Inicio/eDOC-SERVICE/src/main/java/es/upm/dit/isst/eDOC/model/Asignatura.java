package es.upm.dit.isst.eDOC.model;

import java.io.Serializable;
import java.util.Arrays;
import javax.persistence.*;

@Entity
public class Asignatura implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private char acronimo;
	private int curso;
	private int sementre;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getAcronimo() {
		return acronimo;
	}
	public void setAcronimo(char acronimo) {
		this.acronimo = acronimo;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	public int getSementre() {
		return sementre;
	}
	public void setSementre(int sementre) {
		this.sementre = sementre;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + acronimo;
		result = prime * result + curso;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sementre;
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
		Asignatura other = (Asignatura) obj;
		if (acronimo != other.acronimo)
			return false;
		if (curso != other.curso)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sementre != other.sementre)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Asignatura [id=" + id + ", name=" + name + ", acronimo=" + acronimo + ", curso=" + curso + ", sementre="
				+ sementre + "]";
	}
	
	
	
		

}
