package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Vehicule;
import tn.esprit.spring.repository.VehiculeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeService implements IVehiculeService {
    VehiculeRepository vehiculeRepository;
    @Override
    public Vehicule creer(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule obtenirParId(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Vehicule> listerTous() {
        return  vehiculeRepository.findAll();
    }

    @Override
    public Vehicule mettreAjour(Vehicule vehicule) {
        return  vehiculeRepository.save(vehicule);
    }

    @Override
    public void supprimer(Long id) {
        vehiculeRepository.deleteById(id);


    }
}
