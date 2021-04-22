package projectv1.fstg.projectispits.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectv1.fstg.projectispits.bean.ModuleFilliereSemestre;
import projectv1.fstg.projectispits.bean.NoteEtudiantModule;

import java.util.List;

@Repository
public interface NoteEtudiantModuleDao extends JpaRepository<NoteEtudiantModule,Long> {
    NoteEtudiantModule findByReference(String reference);
    List<NoteEtudiantModule> findByModuleFilliereSemestreReference(String reference);
    NoteEtudiantModule findByModuleFilliereSemestreReferenceAndEtudiantCne(String reference,String cne);
    List<NoteEtudiantModule> findByEtudiantCne(String cne);
    List<NoteEtudiantModule> findByEtatValidationCode(String code);
    int deleteByModuleFilliereSemestreReference(String reference);
    int deleteByEtudiantCne(String cne);
}
