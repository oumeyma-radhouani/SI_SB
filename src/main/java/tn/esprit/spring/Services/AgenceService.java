package tn.esprit.spring.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Agence;
import tn.esprit.spring.repository.AgenceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService {
    AgenceRepository agenceRepository;

    @Override
    public Agence creer(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence obtenirParId(Long id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Agence> listerTous() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence mettreAjour(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void supprimer(Long id) {
        agenceRepository.deleteById(id);

    }
}
