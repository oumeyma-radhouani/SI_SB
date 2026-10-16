package tn.esprit.spring.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Services.IReservationService;
import tn.esprit.spring.entity.Reservation;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {
    IReservationService reservationService;

    @PostMapping("/addreservation")
    public Reservation creer(@RequestBody Reservation reservation) {
        return reservationService.creer(reservation);
    }

    @GetMapping("/getreservation/{id}")
    public Reservation obtenirParId(@PathVariable  Long id) {
        return reservationService.obtenirParId(id);
    }

    @GetMapping("/reservations")
    public List<Reservation> listerTous() {
        return reservationService.listerTous();
    }

    @PutMapping("/updatereservation")
    public Reservation mettreAjour(@PathVariable Long id, @RequestBody Reservation reservation) {
        return reservationService.mettreAjour(reservation);
    }

    @DeleteMapping("/deletereservation")
    public void supprimer(@PathVariable Long id) {
        reservationService.supprimer(id);
    }
}
