package projectv1.fstg.projectispits.ws;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import projectv1.fstg.projectispits.bean.Inscription;
import projectv1.fstg.projectispits.service.EtudiantService;
import projectv1.fstg.projectispits.service.InscriptionService;

import java.util.List;

@RestController
@RequestMapping("ispits-project/Inscription")
public class InscriptionProvided {
    @GetMapping("/reference/{reference}")
    public Inscription findByReference(@PathVariable String reference) {
        return inscriptionService.findByReference(reference);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference( @PathVariable String reference) {
        return inscriptionService.deleteByReference(reference);
    }
    @GetMapping("/")
    public List<Inscription> findAll() {
        return inscriptionService.findAll();
    }

    @Autowired
    private InscriptionService inscriptionService;
}
