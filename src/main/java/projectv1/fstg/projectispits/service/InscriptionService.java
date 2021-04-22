package projectv1.fstg.projectispits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projectv1.fstg.projectispits.bean.Etudiant;
import projectv1.fstg.projectispits.bean.Inscription;
import projectv1.fstg.projectispits.dao.EtudiantDao;
import projectv1.fstg.projectispits.dao.InscriptionDao;

import java.util.List;

@Service
public class InscriptionService {
    @Autowired
    private InscriptionDao inscriptionDao;


    public Inscription findByReference(String reference) {
        return inscriptionDao.findByReference(reference);
    }
    @Transactional
    public int deleteByReference(String reference) {
        return inscriptionDao.deleteByReference(reference);
    }

    public List<Inscription> findAll() {
        return inscriptionDao.findAll();
    }
}
