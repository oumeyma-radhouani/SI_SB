package tn.esprit.spring.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Services.IMaintenanceService;
import tn.esprit.spring.entity.Maintenance;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceController {
    IMaintenanceService maintenanceService;

    @PostMapping("/addmaintenance")
    public Maintenance creer(@RequestBody Maintenance maintenance) {
        return maintenanceService.creer(maintenance);
    }

    @GetMapping("/getmaintenance/{id}")
    public Maintenance obtenirParId(@PathVariable  Long id) {
        return maintenanceService.obtenirParId(id);
    }

    @GetMapping("/maintenances")
    public List<Maintenance> listerTous() {
        return maintenanceService.listerTous();
    }

    @PutMapping("/updatemaintenance")
    public Maintenance mettreAjour(@PathVariable Long id, @RequestBody Maintenance maintenance) {
        return maintenanceService.mettreAjour(maintenance);
    }

    @DeleteMapping("/deletemaintenance")
    public void supprimer(@PathVariable  Long id) {
        maintenanceService.supprimer(id);
    }
}
