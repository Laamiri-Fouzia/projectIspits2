package projectv1.fstg.projectispits.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectv1.fstg.projectispits.bean.NoteEtudiantModule;
import projectv1.fstg.projectispits.bean.NoteEtudiantSemestre;

import java.util.List;

@Repository
public interface NoteEtudiantSemetreDao extends JpaRepository<NoteEtudiantSemestre,Long> {
    NoteEtudiantSemestre findByReference(String reference);
    List<NoteEtudiantSemestre> findBySemestreCode(String code);
    List<NoteEtudiantModule> findByEtudiantCne(String cne);
    NoteEtudiantModule findByEtudiantCneAndSemestreCode(String cne,String code);
    List<NoteEtudiantModule> findByEtatValidationCode(String code);
    int deleteByEtudiantCne(String cne);
    int deleteByReference(String ref);
    int deleteBySemestreCode(String code);
}
