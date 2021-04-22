package projectv1.fstg.projectispits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projectv1.fstg.projectispits.bean.Admin;
import projectv1.fstg.projectispits.bean.Professeur;
import projectv1.fstg.projectispits.dao.AdminDao;
import projectv1.fstg.projectispits.dao.ProfesseurDao;

import java.util.List;

@Service
public class ProfesseurService {
    @Autowired
    private ProfesseurDao professeurDao;


    public Professeur findByCin(String cin) {
        return professeurDao.findByCin(cin);
    }

    public Professeur findByCodeEmploye(String codeEmploye) {
        return professeurDao.findByCodeEmploye(codeEmploye);
    }

    public List<Professeur> findByNomAndPrenom(String nom, String prenon) {
        return professeurDao.findByNomAndPrenom(nom, prenon);
    }
    @Transactional
    public int deleteByCodeEmploye(String codeEmploye) {
        return professeurDao.deleteByCodeEmploye(codeEmploye);
    }

    public List<Professeur> findAll() {
        return professeurDao.findAll();
    }
}
