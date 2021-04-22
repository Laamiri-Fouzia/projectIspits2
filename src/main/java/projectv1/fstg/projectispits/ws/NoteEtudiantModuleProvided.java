package projectv1.fstg.projectispits.ws;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import projectv1.fstg.projectispits.bean.Module;
import projectv1.fstg.projectispits.bean.NoteEtudiantModule;
import projectv1.fstg.projectispits.service.ModuleService;
import projectv1.fstg.projectispits.service.NoteEtudiantModuleService;

import java.util.List;

@RestController
@RequestMapping("ispits-project/note-etudiant-module")
public class NoteEtudiantModuleProvided {
    @Autowired
    private NoteEtudiantModuleService noteEtudiantModuleService;

    @GetMapping("/reference/{reference}")
    public NoteEtudiantModule findByReference(@PathVariable String reference) {
        return noteEtudiantModuleService.findByReference(reference);
    }
    @GetMapping("/module-filliere-semestre/reference/{reference}")
    public List<NoteEtudiantModule> findByModuleFilliereSemestreReference(@PathVariable String reference) {
        return noteEtudiantModuleService.findByModuleFilliereSemestreReference(reference);
    }
    @GetMapping("/module-filliere-semestre/reference/{reference}/etudiant/cne/{cne}")
    public NoteEtudiantModule findByModuleFilliereSemestreReferenceAndEtudiantCne(@PathVariable String reference,@PathVariable String cne) {
        return noteEtudiantModuleService.findByModuleFilliereSemestreReferenceAndEtudiantCne(reference, cne);
    }
    @GetMapping("/etudiant/cne/{cne}")
    public List<NoteEtudiantModule> findByEtudiantCne(@PathVariable String cne) {
        return noteEtudiantModuleService.findByEtudiantCne(cne);
    }
    @GetMapping("/etat-validtaion/code/{code}")
    public List<NoteEtudiantModule> findByEtatValidationCode(@PathVariable String code) {
        return noteEtudiantModuleService.findByEtatValidationCode(code);
    }

    @DeleteMapping("/module-filliere-semestre/reference/{reference}")
    public int deleteByModuleFilliereSemestreReference(@PathVariable String reference) {
        return noteEtudiantModuleService.deleteByModuleFilliereSemestreReference(reference);
    }

    @DeleteMapping("/etudiant/cne/{cne}")
    public int deleteByEtudiantCne(@PathVariable String cne) {
        return noteEtudiantModuleService.deleteByEtudiantCne(cne);
    }
    @GetMapping("/")
    public List<NoteEtudiantModule> findAll() {
        return noteEtudiantModuleService.findAll();
    }
}
