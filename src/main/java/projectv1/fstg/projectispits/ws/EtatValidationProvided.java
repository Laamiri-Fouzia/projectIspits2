package projectv1.fstg.projectispits.ws;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import projectv1.fstg.projectispits.bean.Admin;
import projectv1.fstg.projectispits.bean.EtatValidation;
import projectv1.fstg.projectispits.bean.Etudiant;
import projectv1.fstg.projectispits.bean.Module;
import projectv1.fstg.projectispits.service.AdminService;
import projectv1.fstg.projectispits.service.EtatValidationService;

import java.util.List;

@RestController
@RequestMapping("ispits-project/etat-validation")
public class EtatValidationProvided {
    @Autowired
    private EtatValidationService etatValidationService;

    @GetMapping("/code/{code}")
    public EtatValidation findByCode(@PathVariable  String code) {
        return etatValidationService.findByCode(code);
    }
    @GetMapping("/libelle/{libelle}")
    public EtatValidation findByLibelle(@PathVariable String libelle) {
        return etatValidationService.findByLibelle(libelle);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return etatValidationService.deleteByCode(code);
    }
    @GetMapping("/")
    public List<EtatValidation> findAll() {
        return etatValidationService.findAll();
    }
}
