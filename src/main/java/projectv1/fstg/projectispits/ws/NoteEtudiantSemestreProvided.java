package projectv1.fstg.projectispits.ws;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import projectv1.fstg.projectispits.bean.NoteEtudiantModule;
import projectv1.fstg.projectispits.bean.NoteEtudiantSemestre;
import projectv1.fstg.projectispits.service.NoteEtudiantModuleService;
import projectv1.fstg.projectispits.service.NoteEtudiantSemestreService;

import java.util.List;

@RestController
@RequestMapping("ispits-project/note-etudiant-semestre ")
public class NoteEtudiantSemestreProvided {
    @Autowired
    private NoteEtudiantSemestreService noteEtudiantSemestreService;

    @GetMapping("/reference/{reference}")
    public NoteEtudiantSemestre findByReference(@PathVariable String reference) {
        return noteEtudiantSemestreService.findByReference(reference);
    }
    @GetMapping("/semestre/code/{code}")
    public List<NoteEtudiantSemestre> findBySemestreCode(@PathVariable String code) {
        return noteEtudiantSemestreService.findBySemestreCode(code);
    }
    @GetMapping("/etudiant/cne/{cne}")
    public List<NoteEtudiantModule> findByEtudiantCne(@PathVariable String cne) {
        return noteEtudiantSemestreService.findByEtudiantCne(cne);
    }
    @GetMapping("/etudiant/cne/{cne}/semestre/code/{code}")
    public NoteEtudiantModule findByEtudiantCneAndSemestreCode(@PathVariable String cne,@PathVariable String code) {
        return noteEtudiantSemestreService.findByEtudiantCneAndSemestreCode(cne, code);
    }
    @GetMapping("/etat-validation/code/{code}")
    public List<NoteEtudiantModule> findByEtatValidationCode(@PathVariable String code) {
        return noteEtudiantSemestreService.findByEtatValidationCode(code);
    }
    @DeleteMapping("/etudiant/cne/{cne}")
    public int deleteByEtudiantCne(@PathVariable String cne) {
        return noteEtudiantSemestreService.deleteByEtudiantCne(cne);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return noteEtudiantSemestreService.deleteByReference(reference);
    }
    @DeleteMapping("/semestre/code/{code}")
    public int deleteBySemestreCode(@PathVariable String code) {
        return noteEtudiantSemestreService.deleteBySemestreCode(code);
    }
    @GetMapping("/")
    public List<NoteEtudiantSemestre> findAll() {
        return noteEtudiantSemestreService.findAll();
    }
}
