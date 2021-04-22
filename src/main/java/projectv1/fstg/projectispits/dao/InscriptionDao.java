package projectv1.fstg.projectispits.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectv1.fstg.projectispits.bean.Admin;
import projectv1.fstg.projectispits.bean.Inscription;

import java.util.List;

@Repository
public interface InscriptionDao extends JpaRepository<Inscription,Long> {
    Inscription findByReference( String reference);
    int deleteByReference( String reference);
}
