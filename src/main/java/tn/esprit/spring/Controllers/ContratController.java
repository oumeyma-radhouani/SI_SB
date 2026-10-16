package tn.esprit.spring.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Services.IContratService;
import tn.esprit.spring.entity.Contrat;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")

public class ContratController {
    IContratService contratService;


    @PostMapping("/addcontrat")
    public Contrat creer(@RequestBody Contrat contrat) {
        return contratService.creer(contrat);
    }

    @GetMapping("/getcontrat/{id}")

    public Contrat obtenirParId(@PathVariable Long id) {
        return contratService.obtenirParId(id);
    }

    @GetMapping("/contrats")
    public List<Contrat> listerTous() {
        return contratService.listerTous();
    }

    @PutMapping("/mettreajourcontrat")
    public Contrat mettreAjour(@PathVariable Long id, @RequestBody Contrat contrat) {
        return contratService.mettreAjour(contrat);
    }

    @DeleteMapping("/deleteContrat")
    public void supprimer(@PathVariable("id") Long id) {
        contratService.supprimer(id);
    }
}
