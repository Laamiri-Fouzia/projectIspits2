package projectv1.fstg.projectispits.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectv1.fstg.projectispits.bean.Inscription;
import projectv1.fstg.projectispits.bean.ModuleFilliereSemestre;
import projectv1.fstg.projectispits.bean.Semestre;

import java.util.List;

@Repository
public interface ModuleFilliereSemestreDao extends JpaRepository<ModuleFilliereSemestre,Long> {
    ModuleFilliereSemestre findByReference(String reference);
    List<ModuleFilliereSemestre> findByModuleCode(String code);
    List<ModuleFilliereSemestre> findBySemestreCode(String code);
    List<ModuleFilliereSemestre> findByFilliereCode(String code);
    int deleteByReference( String reference);
    int deleteByFilliereCode(String code);
    int deleteByModuleCode(String code);
    int deleteBySemestreCode(String code);
}
