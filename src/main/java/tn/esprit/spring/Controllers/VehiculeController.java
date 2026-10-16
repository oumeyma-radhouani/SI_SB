package tn.esprit.spring.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Services.IVehiculeService;
import tn.esprit.spring.entity.Vehicule;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeController {
    IVehiculeService vehiculeService;

    @PostMapping("/addvehicule")
    public Vehicule creer(@RequestBody Vehicule vehicule) {
        return vehiculeService.creer(vehicule);
    }

    @GetMapping("/getvehicule/{id}")
    public Vehicule obtenirParId(@PathVariable Long id) {
        return vehiculeService.obtenirParId(id);
    }

    @GetMapping("/vehicules")
    public List<Vehicule> listerTous() {
        return vehiculeService.listerTous();
    }

    @PutMapping("/updatevehicules")
    public Vehicule mettreAjour(@PathVariable Long id, @RequestBody Vehicule vehicule) {
        return vehiculeService.mettreAjour(vehicule);
    }

    @DeleteMapping("/deletevehicule")
    public void supprimer(@PathVariable Long id) {
        vehiculeService.supprimer(id);
    }
}
