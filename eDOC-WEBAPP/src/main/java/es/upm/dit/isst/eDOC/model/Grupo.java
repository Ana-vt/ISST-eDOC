package es.upm.dit.isst.eDOC.model;


import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
 


public class Grupo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private int id;
	
	
    private List<Usuario> usuarios;
	
	public Grupo(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Grupo other = (Grupo) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Grupo [id=" + id + "]";
	}
	
	
}


	
	
	
	