package tn.esprit.spring.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Services.IAgenceService;
import tn.esprit.spring.entity.Agence;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")

public class AgenceController {
    IAgenceService agenceService;

    @PostMapping("/addagence")
    public Agence creer(@RequestBody Agence agence) {
        return agenceService.creer(agence);
    }
    @GetMapping("/getagence/{id}")
    public Agence obtenirParId(@PathVariable("id") Long id) {
        return agenceService.obtenirParId(id);
    }
    @GetMapping("/agences")

    public List<Agence> listerTous() {
        return agenceService.listerTous();
    }
    @PutMapping("/mettreajours")
    public Agence mettreAjour(@PathVariable Long id, @RequestBody Agence agence) {
        agence.setIdAgence(id);
        return agenceService.mettreAjour(agence);
    }
    @DeleteMapping("/deleteAgence")
    public void supprimer(@PathVariable("id") Long id) {
        agenceService.supprimer(id);
    }
}