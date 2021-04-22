package projectv1.fstg.projectispits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projectv1.fstg.projectispits.bean.Module;
import projectv1.fstg.projectispits.dao.ModuleDao;

import java.util.List;

@Service
public class ModuleService {
    @Autowired
    private ModuleDao moduleDao;

    public Module findByCode(String code) {
        return moduleDao.findByCode(code);
    }

    public Module findByLibelle(String libelle) {
        return moduleDao.findByLibelle(libelle);
    }
    @Transactional
    public int deleteByCode(String code) {
        return moduleDao.deleteByCode(code);
    }

    public List<Module> findAll() {
        return moduleDao.findAll();
    }
}
