package projectv1.fstg.projectispits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projectv1.fstg.projectispits.bean.Etudiant;
import projectv1.fstg.projectispits.bean.NoteEtudiantModule;
import projectv1.fstg.projectispits.dao.EtudiantDao;
import projectv1.fstg.projectispits.dao.NoteEtudiantModuleDao;

import java.util.List;

@Service
public class NoteEtudiantModuleService {
    @Autowired
    private NoteEtudiantModuleDao noteEtudiantModuleDao;


    public NoteEtudiantModule findByReference(String reference) {
        return noteEtudiantModuleDao.findByReference(reference);
    }

    public List<NoteEtudiantModule> findByModuleFilliereSemestreReference(String reference) {
        return noteEtudiantModuleDao.findByModuleFilliereSemestreReference(reference);
    }

    public NoteEtudiantModule findByModuleFilliereSemestreReferenceAndEtudiantCne(String reference, String cne) {
        return noteEtudiantModuleDao.findByModuleFilliereSemestreReferenceAndEtudiantCne(reference, cne);
    }

    public List<NoteEtudiantModule> findByEtudiantCne(String cne) {
        return noteEtudiantModuleDao.findByEtudiantCne(cne);
    }

    public List<NoteEtudiantModule> findByEtatValidationCode(String code) {
        return noteEtudiantModuleDao.findByEtatValidationCode(code);
    }
    @Transactional
    public int deleteByModuleFilliereSemestreReference(String reference) {
        return noteEtudiantModuleDao.deleteByModuleFilliereSemestreReference(reference);
    }
    @Transactional
    public int deleteByEtudiantCne(String cne) {
        return noteEtudiantModuleDao.deleteByEtudiantCne(cne);
    }

    public List<NoteEtudiantModule> findAll() {
        return noteEtudiantModuleDao.findAll();
    }
}
