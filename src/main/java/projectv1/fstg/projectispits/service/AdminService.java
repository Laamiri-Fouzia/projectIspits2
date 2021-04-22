package projectv1.fstg.projectispits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projectv1.fstg.projectispits.bean.Admin;
import projectv1.fstg.projectispits.bean.Etudiant;
import projectv1.fstg.projectispits.dao.AdminDao;
import projectv1.fstg.projectispits.dao.EtudiantDao;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminDao adminDao;


    public Admin findByCin(String cin) {
        return adminDao.findByCin(cin);
    }

    public Admin findByCodeEmploye(String codeEmploye) {
        return adminDao.findByCodeEmploye(codeEmploye);
    }

    public List<Admin> findByNomAndPrenom(String nom, String prenon) {
        return adminDao.findByNomAndPrenom(nom, prenon);
    }
    @Transactional
    public int deleteByCodeEmploye(String codeEmploye) {
        return adminDao.deleteByCodeEmploye(codeEmploye);
    }

    public List<Admin> findAll() {
        return adminDao.findAll();
    }
}
