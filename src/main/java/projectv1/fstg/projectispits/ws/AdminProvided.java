package projectv1.fstg.projectispits.ws;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import projectv1.fstg.projectispits.bean.Admin;
import projectv1.fstg.projectispits.dao.AdminDao;
import projectv1.fstg.projectispits.service.AdminService;

import java.util.List;

@RestController
@RequestMapping("ispits-project/admin")
public class AdminProvided {
    @Autowired
    private AdminService adminService;

    @GetMapping("/cin/{cin}")
    public Admin findByCin(@PathVariable String cin) {
        return adminService.findByCin(cin);
    }
    @GetMapping("/codeEmploye/{codeEmploye}")
    public Admin findByCodeEmploye(@PathVariable String codeEmploye) {
        return adminService.findByCodeEmploye(codeEmploye);
    }
    @GetMapping("/nom/{nom}/prenon/{prenon}")
    public List<Admin> findByNomAndPrenom(@PathVariable String nom,@PathVariable String prenon) {
        return adminService.findByNomAndPrenom(nom, prenon);
    }

    @DeleteMapping("/code-employe/{codeEmploye}")
    public int deleteByCodeEmploye( @PathVariable String codeEmploye) {
        return adminService.deleteByCodeEmploye(codeEmploye);
    }
    @GetMapping("/")
    public List<Admin> findAll() {
        return adminService.findAll();
    }
}
