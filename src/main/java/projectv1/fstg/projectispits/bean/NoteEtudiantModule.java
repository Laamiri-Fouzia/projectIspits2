package projectv1.fstg.projectispits.bean;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class NoteEtudiantModule {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String reference;
	@OneToOne
	private ModuleFilliereSemestre module;
	@ManyToOne
	private Etudiant etudiant;
	@ManyToOne
	private EtatValidation etatValidation;
	private BigDecimal note ;
	@ManyToOne
	private NoteEtudiantSemestre noteEtudiantSemestre;

	public NoteEtudiantSemestre getNoteEtudiantSemestre() {
		return noteEtudiantSemestre;
	}

	public void setNoteEtudiantSemestre(NoteEtudiantSemestre noteEtudiantSemestre) {
		this.noteEtudiantSemestre = noteEtudiantSemestre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ModuleFilliereSemestre getModule() {
		return module;
	}

	public void setModule(ModuleFilliereSemestre module) {
		this.module = module;
	}

	public BigDecimal getNote() {
		return note;
	}

	public void setNote(BigDecimal note) {
		this.note = note;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public EtatValidation getEtatValidation() {
		return etatValidation;
	}

	public void setEtatValidation(EtatValidation etatValidation) {
		this.etatValidation = etatValidation;
	}
}
