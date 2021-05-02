package es.upm.dit.isst.eDOC.model;
import java.util.List;
import java.io.Serializable;
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
	private int semestre;
	
	@ManyToMany(mappedBy = "asignaturas")
    private List<Usuario> usuarios;
	
	public Asignatura(){}
	
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
		return semestre;
	}
	public void setSementre(int sementre) {
		this.semestre = semestre;
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
		result = prime * result + semestre;
		result = prime * result + ((usuarios == null) ? 0 : usuarios.hashCode());
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
		if (semestre != other.semestre)
			return false;
		if (usuarios == null) {
			if (other.usuarios != null)
				return false;
		} else if (!usuarios.equals(other.usuarios))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Asignatura [id=" + id + ", name=" + name + ", acronimo=" + acronimo + ", curso=" + curso + ", semestre="
				+ semestre + ", usuarios=" + usuarios + "]";
	}
	
	
	
		

}
