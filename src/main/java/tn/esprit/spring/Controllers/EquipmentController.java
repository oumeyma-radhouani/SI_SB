package tn.esprit.spring.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Services.IEquipementService;
import tn.esprit.spring.entity.Employe;
import tn.esprit.spring.entity.Equipement;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipment")


public class EquipmentController {
    IEquipementService equipementService;

    @PostMapping("/addequipment")
    public Equipement creer(@RequestBody Equipement equipement) {
        return equipementService.creer(equipement);
    }

    @GetMapping("/getequipment/{id}")
    public Equipement obtenirParId(@PathVariable Long id) {
        return equipementService.obtenirParId(id);
    }

    @GetMapping("/equipments")
    public List<Equipement> listerTous() {
        return equipementService.listerTous();
    }

    @PutMapping("/mettreajourequipement")
    public Equipement mettreAjour(@PathVariable Long id, @RequestBody Equipement equipement) {
        return equipementService.mettreAjour(equipement);
    }

    @DeleteMapping("/deleteEquipement")
    public void supprimer( @PathVariable Long id) {
        equipementService.supprimer(id);
    }
}
