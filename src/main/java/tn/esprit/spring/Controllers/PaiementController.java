package tn.esprit.spring.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Services.IPaiementService;
import tn.esprit.spring.entity.Paiement;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/paiement")

public class PaiementController {
    IPaiementService paiementService;

    @PostMapping("/addpaiement")

    public Paiement creer(@RequestBody Paiement paiement) {
        return paiementService.creer(paiement);
    }

    @GetMapping("/getpaiement/{id}")

    public Paiement obtenirParId(@PathVariable Long id) {
        return paiementService.obtenirParId(id);
    }

    @GetMapping("/paiements")
    public List<Paiement> listerTous() {
        return paiementService.listerTous();
    }

    @PutMapping("/updatepaiement")
    public Paiement mettreAjour(@PathVariable Long id, @RequestBody Paiement paiement) {
        return paiementService.mettreAjour(paiement);
    }

    @DeleteMapping("/deletepaiement")
    public void supprimer(@PathVariable Long id) {
        paiementService.supprimer(id);
    }
}
