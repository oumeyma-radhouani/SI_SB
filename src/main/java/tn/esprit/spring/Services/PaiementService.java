package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Paiement;
import tn.esprit.spring.repository.PaiementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiementService implements IPaiementService{
    PaiementRepository paiementRepository;

    @Override
    public Paiement creer(Paiement paiement) {
        return  paiementRepository.save(paiement);
    }

    @Override
    public Paiement obtenirParId(Long id) {
        return   paiementRepository.findById(id).orElse(null);
    }

    @Override
    public List<Paiement> listerTous() {
        return  paiementRepository.findAll();
    }

    @Override
    public Paiement mettreAjour(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public void supprimer(Long id) {
        paiementRepository.deleteById(id);

    }
}
