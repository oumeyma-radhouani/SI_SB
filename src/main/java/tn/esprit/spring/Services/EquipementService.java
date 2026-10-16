package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Equipement;
import tn.esprit.spring.repository.EquipementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipementService implements IEquipementService {
    EquipementRepository equipementRepository;

    @Override
    public Equipement creer(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement obtenirParId(Long id) {
        return equipementRepository.findById(id).orElse(null);
    }

    @Override
    public List<Equipement> listerTous() {
        return equipementRepository.findAll();
    }

    @Override
    public Equipement mettreAjour(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public void supprimer(Long id) {
        equipementRepository.deleteById(id);

    }
}
