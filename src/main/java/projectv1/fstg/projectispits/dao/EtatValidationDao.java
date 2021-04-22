package projectv1.fstg.projectispits.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectv1.fstg.projectispits.bean.EtatValidation;
import projectv1.fstg.projectispits.bean.Module;

@Repository
public interface EtatValidationDao extends JpaRepository<EtatValidation,Long> {
    EtatValidation findByCode(String code);
    EtatValidation findByLibelle( String libelle);
    int deleteByCode( String code);
}
