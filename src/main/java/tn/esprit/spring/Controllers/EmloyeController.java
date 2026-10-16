package tn.esprit.spring.Controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Services.IEmployeService;
import tn.esprit.spring.entity.Employe;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employer")

public class EmloyeController {
    IEmployeService employeService;

    @PostMapping("/addemployee")
    public Employe creer(@RequestBody Employe employe) {
        return employeService.creer(employe);
    }
    @GetMapping("/getemployer/{id}")
    public Employe obtenirParId(@PathVariable("id") Long id) {
        return employeService.obtenirParId(id);
    }
    @GetMapping("/employes")

    public List<Employe> listerTous() {
        return employeService.listerTous();
    }
    @PutMapping("/mettreajours}")
    public Employe mettreAjour(@PathVariable Long id, @RequestBody Employe employe) {
        employe.setIdEmploye(id);
        return employeService.mettreAjour(employe);
    }
    @DeleteMapping("/deleteEmployer")
    public void supprimer(@PathVariable("id") Long id) {
        employeService.supprimer(id);
    }
}
