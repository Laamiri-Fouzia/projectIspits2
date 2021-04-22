package projectv1.fstg.projectispits.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import projectv1.fstg.projectispits.bean.ModuleFilliereSemestre;
import projectv1.fstg.projectispits.service.InscriptionService;
import projectv1.fstg.projectispits.service.ModuleFilliereSemestreService;

import java.util.List;

@RestController
@RequestMapping("ispits-project/ModuleFilliereSemestre")
public class ModuleFilliereSemestreProvided {
    @GetMapping("/reference/{reference}")
    public ModuleFilliereSemestre findByReference(@PathVariable String reference) {
        return moduleFilliereSemestreService.findByReference(reference);
    }
    @GetMapping("/Module/code/{code}")
    public List<ModuleFilliereSemestre> findByModuleCode(@PathVariable String code) {
        return moduleFilliereSemestreService.findByModuleCode(code);
    }
    @GetMapping("/Semestre/code/{code}")
    public List<ModuleFilliereSemestre> findBySemestreCode(@PathVariable String code) {
        return moduleFilliereSemestreService.findBySemestreCode(code);
    }
    @GetMapping("/Filliere/code/{code}")
    public List<ModuleFilliereSemestre> findByFilliereCode(@PathVariable String code) {
        return moduleFilliereSemestreService.findByFilliereCode(code);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return moduleFilliereSemestreService.deleteByReference(reference);
    }

    @DeleteMapping("/Filliere/code/{code}")
    public int deleteByFilliereCode(@PathVariable String code) {
        return moduleFilliereSemestreService.deleteByFilliereCode(code);
    }

    @DeleteMapping("/Module/code/{code}")
    public int deleteByModuleCode(@PathVariable String code) {
        return moduleFilliereSemestreService.deleteByModuleCode(code);
    }

    @DeleteMapping("/Semestre/code/{code}")
    public int deleteBySemestreCode(@PathVariable String code) {
        return moduleFilliereSemestreService.deleteBySemestreCode(code);
    }
    @GetMapping("/")
    public List<ModuleFilliereSemestre> findAll() {
        return moduleFilliereSemestreService.findAll();
    }

    @Autowired
    private ModuleFilliereSemestreService moduleFilliereSemestreService;
}
