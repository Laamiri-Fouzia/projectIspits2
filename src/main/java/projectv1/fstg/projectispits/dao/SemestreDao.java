package projectv1.fstg.projectispits.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectv1.fstg.projectispits.bean.Module;
import projectv1.fstg.projectispits.bean.Semestre;

@Repository
public interface SemestreDao extends JpaRepository<Semestre,Long> {
    Module findByCode(String code);
    Module findByLibelle( String libelle);
    int deleteByCode( String code);
}
