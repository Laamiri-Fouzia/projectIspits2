package projectv1.fstg.projectispits.ws;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import projectv1.fstg.projectispits.bean.EtatValidation;
import projectv1.fstg.projectispits.bean.Filliere;
import projectv1.fstg.projectispits.service.EtatValidationService;
import projectv1.fstg.projectispits.service.FilliereService;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("ispits-project/filliere")
public class FilliereProvided {
    @Autowired
    private FilliereService filliereService;

    @GetMapping("/code/{code}")
    public Filliere findByCode(@PathVariable String code) {
        return filliereService.findByCode(code);
    }
    @GetMapping("/libelle/{libelle}")
    public Filliere findByLibelle(@PathVariable String libelle) {
        return filliereService.findByLibelle(libelle);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return filliereService.deleteByCode(code);
    }
    @GetMapping("/")
    public List<Filliere> findAll() {
        return filliereService.findAll();
    }
}
