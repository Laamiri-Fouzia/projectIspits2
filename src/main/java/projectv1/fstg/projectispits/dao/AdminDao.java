package projectv1.fstg.projectispits.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectv1.fstg.projectispits.bean.Admin;

import java.util.List;
@Repository
public interface AdminDao extends JpaRepository<Admin,Long> {
    Admin findByCin( String cin);
    Admin findByCodeEmploye( String codeEmploye);
    List<Admin> findByNomAndPrenom(String nom,String prenon);
    int deleteByCodeEmploye ( String codeEmploye);
}
