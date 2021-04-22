package projectv1.fstg.projectispits.ws;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import projectv1.fstg.projectispits.bean.Admin;
import projectv1.fstg.projectispits.bean.Professeur;
import projectv1.fstg.projectispits.service.AdminService;
import projectv1.fstg.projectispits.service.ProfesseurService;

import java.util.List;

@RestController
@RequestMapping("ispits-project/professeur")
public class ProfesseurProvided {
    @Autowired
    private ProfesseurService professeurService;
    @GetMapping("/cin/{cin}")
    public Professeur findByCin(@PathVariable String cin) {
        return professeurService.findByCin(cin);
    }
    @GetMapping("/codeEmploye/{codeEmploye}")
    public Professeur findByCodeEmploye(@PathVariable String codeEmploye) {
        return professeurService.findByCodeEmploye(codeEmploye);
    }
    @GetMapping("/nom/{nom}/prenon/{prenon}")
    public List<Professeur> findByNomAndPrenom(@PathVariable String nom,@PathVariable  String prenon) {
        return professeurService.findByNomAndPrenom(nom, prenon);
    }

    @DeleteMapping("/codeEmploye/{codeEmploye}")
    public int deleteByCodeEmploye(@PathVariable String codeEmploye) {
        return professeurService.deleteByCodeEmploye(codeEmploye);
    }
    @GetMapping("/")
    public List<Professeur> findAll() {
        return professeurService.findAll();
    }
}
