package projectv1.fstg.projectispits.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectv1.fstg.projectispits.bean.Admin;
import projectv1.fstg.projectispits.bean.Professeur;

import java.util.List;

@Repository
public interface ProfesseurDao extends JpaRepository<Professeur,Long> {
    Professeur findByCin(String cin);
    Professeur findByCodeEmploye( String codeEmploye);
    List<Professeur> findByNomAndPrenom(String nom,String prenon);
    int deleteByCodeEmploye ( String codeEmploye);
}
