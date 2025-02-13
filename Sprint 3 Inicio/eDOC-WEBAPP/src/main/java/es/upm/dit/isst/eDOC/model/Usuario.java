package es.upm.dit.isst.eDOC.model;
import java.util.List;

import java.io.Serializable;
import java.util.Arrays;
import javax.persistence.*;


public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private int id;
	private String name;
	private String email;
	private String password;
	private String rol;
	private String departamento;
	
	@JoinTable(
		name = "rel_usuarios_asignaturas",
		joinColumns = @JoinColumn(name = "FK_USUARIO", nullable = false),
		inverseJoinColumns = @JoinColumn(name="FK_ASIGNATURA", nullable = false)
			)
	
	private List<Asignatura> asignaturas;
	
	@JoinTable(
			name = "rel_usuarios_grupos",
			joinColumns = @JoinColumn(name = "FK_USUARIO", nullable = false),
			inverseJoinColumns = @JoinColumn(name="FK_GRUPO", nullable = false)
				)
	
	private List<Grupo> grupos;
	
	public Usuario(){}
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setContraseña(String password) {
		this.password = password;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((rol == null) ? 0 : rol.hashCode());
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
		Usuario other = (Usuario) obj;
		if (departamento == null) {
			if (other.departamento != null)
				return false;
		} else if (!departamento.equals(other.departamento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (rol == null) {
			if (other.rol != null)
				return false;
		} else if (!rol.equals(other.rol))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", rol=" + rol
				+ ", departamento=" + departamento + "]";
	}
	
	
	
	
}