package projectv1.fstg.projectispits.ws;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import projectv1.fstg.projectispits.bean.Etudiant;
import projectv1.fstg.projectispits.service.AdminService;
import projectv1.fstg.projectispits.service.EtudiantService;

import java.util.List;

@RestController
@RequestMapping("ispits-project/Etudiant")
public class EtudiantProvided {
    @GetMapping("/cne/{cne}")
    public Etudiant findByCne(@PathVariable String cne) {
        return etudiantService.findByCne(cne);
    }
    @GetMapping("/nom/{nom}/prenon/{prenon}")
    public List<Etudiant> findByNomAndPrenom(@PathVariable String nom,@PathVariable String prenon) {
        return etudiantService.findByNomAndPrenom(nom, prenon);
    }

    @DeleteMapping("/cne/{cne}")
    public int deleteByCne(@PathVariable String cne) {
        return etudiantService.deleteByCne(cne);
    }
    @GetMapping("/")
    public List<Etudiant> findAll() {
        return etudiantService.findAll();
    }

    @Autowired
    private EtudiantService etudiantService;
}
