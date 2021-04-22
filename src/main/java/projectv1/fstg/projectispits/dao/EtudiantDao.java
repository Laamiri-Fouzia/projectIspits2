package projectv1.fstg.projectispits.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectv1.fstg.projectispits.bean.Admin;
import projectv1.fstg.projectispits.bean.Etudiant;

import java.util.List;

@Repository
public interface EtudiantDao extends JpaRepository<Etudiant,Long> {
    Etudiant findByCne( String cne);
    List<Etudiant> findByNomAndPrenom(String nom,String prenon);
    int deleteByCne( String cne);

}
