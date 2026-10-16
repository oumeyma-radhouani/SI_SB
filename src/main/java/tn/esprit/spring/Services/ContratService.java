package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Contrat;
import tn.esprit.spring.repository.ContratRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements IContratService {
    ContratRepository contratRepository;

    @Override
    public Contrat creer(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat obtenirParId(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public List<Contrat> listerTous() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat mettreAjour(Contrat contrat) {
        return  contratRepository.save(contrat);
    }

    @Override
    public void supprimer(Long id) {
        contratRepository.deleteById(id);

    }
}
