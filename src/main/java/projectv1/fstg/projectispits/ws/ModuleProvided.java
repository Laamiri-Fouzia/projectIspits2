package projectv1.fstg.projectispits.ws;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import projectv1.fstg.projectispits.bean.Filliere;
import projectv1.fstg.projectispits.bean.Module;
import projectv1.fstg.projectispits.service.FilliereService;
import projectv1.fstg.projectispits.service.ModuleService;

import java.util.List;

@RestController
@RequestMapping("ispits-project/module")
public class ModuleProvided {
    @Autowired
    private ModuleService moduleService;

    @GetMapping("/code/{code}")
    public Module findByCode(@PathVariable String code) {
        return moduleService.findByCode(code);
    }
    @GetMapping("/libelle/{libelle}")
    public Module findByLibelle(@PathVariable String libelle) {
        return moduleService.findByLibelle(libelle);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return moduleService.deleteByCode(code);
    }

    public List<Module> findAll() {
        return moduleService.findAll();
    }
}
