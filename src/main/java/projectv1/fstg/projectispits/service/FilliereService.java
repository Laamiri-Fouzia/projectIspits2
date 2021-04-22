package projectv1.fstg.projectispits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projectv1.fstg.projectispits.bean.Admin;
import projectv1.fstg.projectispits.bean.Filliere;
import projectv1.fstg.projectispits.dao.AdminDao;
import projectv1.fstg.projectispits.dao.FilliereDao;

import java.util.List;

@Service
public class FilliereService {
    @Autowired
    private FilliereDao filliereDao;


    public Filliere findByCode(String code) {
        return filliereDao.findByCode(code);
    }

    public Filliere findByLibelle(String libelle) {
        return filliereDao.findByLibelle(libelle);
    }
    @Transactional
    public int deleteByCode(String code) {
        return filliereDao.deleteByCode(code);
    }

    public List<Filliere> findAll() {
        return filliereDao.findAll();
    }
}
