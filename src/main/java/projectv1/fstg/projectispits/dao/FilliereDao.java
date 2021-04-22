package projectv1.fstg.projectispits.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectv1.fstg.projectispits.bean.Admin;
import projectv1.fstg.projectispits.bean.Filliere;
import projectv1.fstg.projectispits.bean.Module;

import java.util.List;

@Repository
public interface FilliereDao extends JpaRepository<Filliere,Long> {
    Filliere findByCode(String code);
    Filliere findByLibelle( String libelle);
    int deleteByCode( String code);
}
