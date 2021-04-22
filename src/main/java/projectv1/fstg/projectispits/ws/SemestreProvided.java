package projectv1.fstg.projectispits.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import projectv1.fstg.projectispits.bean.Module;
import projectv1.fstg.projectispits.bean.Semestre;
import projectv1.fstg.projectispits.service.SemestreService;

import java.util.List;

@RestController
@RequestMapping("ispits-project/semestre")
public class SemestreProvided {
    @GetMapping("code/{code}")
    public Module findByCode(@PathVariable String code) {
        return semestreService.findByCode(code);
    }
    @GetMapping("libelle/{libelle}")
    public Module findByLibelle(@PathVariable String libelle) {
        return semestreService.findByLibelle(libelle);
    }

    @DeleteMapping("code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return semestreService.deleteByCode(code);
    }

    @GetMapping("/")
    public List<Semestre> findAll() {
        return semestreService.findAll();
    }

    @Autowired
    private SemestreService semestreService;

}
