package projectv1.fstg.projectispits.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class ModuleFilliereSemestre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String reference;
	@ManyToOne
	private Module module;
	@ManyToOne
	private Filliere filliere;
	@ManyToOne
	private Semestre semestre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public Filliere getFilliere() {
		return filliere;
	}

	public void setFilliere(Filliere filliere) {
		this.filliere = filliere;
	}

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

}
