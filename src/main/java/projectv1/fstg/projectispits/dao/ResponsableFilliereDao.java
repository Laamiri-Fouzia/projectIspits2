package projectv1.fstg.projectispits.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectv1.fstg.projectispits.bean.Professeur;
import projectv1.fstg.projectispits.bean.ResponsableFilliere;

import java.util.List;

@Repository
public interface ResponsableFilliereDao extends JpaRepository<ResponsableFilliere,Long> {
    ResponsableFilliere findByCin(String cin);
    ResponsableFilliere findByCodeEmploye( String codeEmploye);
    List<ResponsableFilliere> findByNomAndPrenom(String nom,String prenon);
    int deleteByCodeEmploye ( String codeEmploye);
}
