package projectv1.fstg.projectispits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projectv1.fstg.projectispits.bean.NoteEtudiantModule;
import projectv1.fstg.projectispits.bean.NoteEtudiantSemestre;
import projectv1.fstg.projectispits.dao.NoteEtudiantModuleDao;
import projectv1.fstg.projectispits.dao.NoteEtudiantSemetreDao;

import java.util.List;

@Service
public class NoteEtudiantSemestreService {
    @Autowired
    private NoteEtudiantSemetreDao noteEtudiantSemestreDao;


    public NoteEtudiantSemestre findByReference(String reference) {
        return noteEtudiantSemestreDao.findByReference(reference);
    }

    public List<NoteEtudiantSemestre> findBySemestreCode(String code) {
        return noteEtudiantSemestreDao.findBySemestreCode(code);
    }

    public List<NoteEtudiantModule> findByEtudiantCne(String cne) {
        return noteEtudiantSemestreDao.findByEtudiantCne(cne);
    }

    public NoteEtudiantModule findByEtudiantCneAndSemestreCode(String cne, String code) {
        return noteEtudiantSemestreDao.findByEtudiantCneAndSemestreCode(cne, code);
    }

    public List<NoteEtudiantModule> findByEtatValidationCode(String code) {
        return noteEtudiantSemestreDao.findByEtatValidationCode(code);
    }
    @Transactional
    public int deleteByEtudiantCne(String cne) {
        return noteEtudiantSemestreDao.deleteByEtudiantCne(cne);
    }
    @Transactional
    public int deleteByReference(String ref) {
        return noteEtudiantSemestreDao.deleteByReference(ref);
    }
    @Transactional
    public int deleteBySemestreCode(String code) {
        return noteEtudiantSemestreDao.deleteBySemestreCode(code);
    }

    public List<NoteEtudiantSemestre> findAll() {
        return noteEtudiantSemestreDao.findAll();
    }
}
