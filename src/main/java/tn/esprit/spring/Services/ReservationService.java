package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Reservation;
import tn.esprit.spring.repository.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {
    private ReservationRepository reservationRepository;
    @Override
    public Reservation creer(Reservation reservation) {
        return  reservationRepository.save(reservation);
    }

    @Override
    public Reservation obtenirParId(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Reservation> listerTous() {
        return  reservationRepository.findAll();
    }

    @Override
    public Reservation mettreAjour(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void supprimer(Long id) {
        reservationRepository.deleteById(id);

    }
}
