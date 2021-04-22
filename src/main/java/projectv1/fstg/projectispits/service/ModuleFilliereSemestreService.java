package projectv1.fstg.projectispits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projectv1.fstg.projectispits.bean.Admin;
import projectv1.fstg.projectispits.bean.ModuleFilliereSemestre;
import projectv1.fstg.projectispits.dao.AdminDao;
import projectv1.fstg.projectispits.dao.ModuleFilliereSemestreDao;

import java.util.List;

@Service
public class ModuleFilliereSemestreService {
    public ModuleFilliereSemestre findByReference(String reference) {
        return ModuleFilliereSemestreDao.findByReference(reference);
    }

    public List<ModuleFilliereSemestre> findByModuleCode(String code) {
        return ModuleFilliereSemestreDao.findByModuleCode(code);
    }

    public List<ModuleFilliereSemestre> findBySemestreCode(String code) {
        return ModuleFilliereSemestreDao.findBySemestreCode(code);
    }

    public List<ModuleFilliereSemestre> findByFilliereCode(String code) {
        return ModuleFilliereSemestreDao.findByFilliereCode(code);
    }
    @Transactional
    public int deleteByReference(String reference) {
        return ModuleFilliereSemestreDao.deleteByReference(reference);
    }
    @Transactional
    public int deleteByFilliereCode(String code) {
        return ModuleFilliereSemestreDao.deleteByFilliereCode(code);
    }
    @Transactional
    public int deleteByModuleCode(String code) {
        return ModuleFilliereSemestreDao.deleteByModuleCode(code);
    }
    @Transactional
    public int deleteBySemestreCode(String code) {
        return ModuleFilliereSemestreDao.deleteBySemestreCode(code);
    }

    public List<ModuleFilliereSemestre> findAll() {
        return ModuleFilliereSemestreDao.findAll();
    }

    @Autowired
    private ModuleFilliereSemestreDao ModuleFilliereSemestreDao;



}
