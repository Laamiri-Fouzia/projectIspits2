package projectv1.fstg.projectispits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projectv1.fstg.projectispits.bean.Etudiant;
import projectv1.fstg.projectispits.bean.Module;
import projectv1.fstg.projectispits.dao.EtudiantDao;
import projectv1.fstg.projectispits.dao.ModuleDao;

import java.util.List;

@Service
public class EtudiantService {
    @Autowired
    private EtudiantDao etudiantDao;

    public Etudiant findByCne(String cne) {
        return etudiantDao.findByCne(cne);
    }

    public List<Etudiant> findByNomAndPrenom(String nom, String prenon) {
        return etudiantDao.findByNomAndPrenom(nom, prenon);
    }
    @Transactional
    public int deleteByCne(String cne) {
        return etudiantDao.deleteByCne(cne);
    }

    public List<Etudiant> findAll() {
        return etudiantDao.findAll();
    }
}
