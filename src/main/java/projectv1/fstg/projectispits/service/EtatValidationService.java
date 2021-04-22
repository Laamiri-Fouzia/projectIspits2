package projectv1.fstg.projectispits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projectv1.fstg.projectispits.bean.EtatValidation;
import projectv1.fstg.projectispits.bean.Etudiant;
import projectv1.fstg.projectispits.bean.Module;
import projectv1.fstg.projectispits.dao.EtatValidationDao;
import projectv1.fstg.projectispits.dao.EtudiantDao;

import java.util.List;

@Service
public class EtatValidationService {
    @Autowired
    private EtatValidationDao etatValidationDao;


    public EtatValidation findByCode(String code) {
        return etatValidationDao.findByCode(code);
    }

    public EtatValidation findByLibelle(String libelle) {
        return etatValidationDao.findByLibelle(libelle);
    }
    @Transactional
    public int deleteByCode(String code) {
        return etatValidationDao.deleteByCode(code);
    }

    public List<EtatValidation> findAll() {
        return etatValidationDao.findAll();
    }
}
