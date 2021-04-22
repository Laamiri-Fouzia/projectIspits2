package projectv1.fstg.projectispits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projectv1.fstg.projectispits.bean.Filliere;
import projectv1.fstg.projectispits.bean.Module;
import projectv1.fstg.projectispits.bean.Semestre;
import projectv1.fstg.projectispits.dao.FilliereDao;
import projectv1.fstg.projectispits.dao.SemestreDao;

import java.util.List;

@Service
public class SmestreService {
    @Autowired
    private SemestreDao semestreDao;

    public Module findByCode(String code) {
        return semestreDao.findByCode(code);
    }

    public Module findByLibelle(String libelle) {
        return semestreDao.findByLibelle(libelle);
    }
    @Transactional
    public int deleteByCode(String code) {
        return semestreDao.deleteByCode(code);
    }

    public List<Semestre> findAll() {
        return semestreDao.findAll();
    }
}
